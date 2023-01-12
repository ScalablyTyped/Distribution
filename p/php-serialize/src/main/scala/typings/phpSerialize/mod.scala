package typings.phpSerialize

import typings.node.bufferMod.global.Buffer
import typings.phpSerialize.phpSerializeStrings.binary
import typings.phpSerialize.phpSerializeStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("php-serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isSerialized(givenItem: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSerialized")(givenItem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def isSerialized(givenItem: Any, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSerialized")(givenItem.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def serialize(item: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def serialize(item: Any, scope: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def serialize(item: Any, scope: Any, givenOptions: SerializeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], givenOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def serialize(item: Any, scope: Unit, givenOptions: SerializeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], givenOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def unserialize(item: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def unserialize(item: String, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unserialize(item: String, scope: Any, givenOptions: UnserializeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], givenOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unserialize(item: String, scope: Unit, givenOptions: UnserializeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], givenOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unserialize(item: Buffer): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def unserialize(item: Buffer, scope: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unserialize(item: Buffer, scope: Any, givenOptions: UnserializeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], givenOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def unserialize(item: Buffer, scope: Unit, givenOptions: UnserializeOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], givenOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  trait SerializeOptions extends StObject {
    
    /** @default 'utf8' */
    val encoding: js.UndefOr[utf8 | binary] = js.undefined
  }
  object SerializeOptions {
    
    inline def apply(): SerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SerializeOptions] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: utf8 | binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait UnserializeOptions extends StObject {
    
    /** @default 'utf8' */
    val encoding: js.UndefOr[utf8 | binary] = js.undefined
    
    /** @default true' */
    val strict: js.UndefOr[Boolean] = js.undefined
  }
  object UnserializeOptions {
    
    inline def apply(): UnserializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnserializeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnserializeOptions] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: utf8 | binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
