package typings.phpSerialize

import typings.node.Buffer
import typings.phpSerialize.phpSerializeStrings.binary
import typings.phpSerialize.phpSerializeStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("php-serialize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isSerialized(givenItem: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSerialized")(givenItem.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def isSerialized(givenItem: js.Any, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSerialized")(givenItem.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def serialize(item: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def serialize(item: js.Any, scope: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def serialize(item: js.Any, scope: js.Any, givenOptions: SerializeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], givenOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def serialize(item: js.Any, scope: Unit, givenOptions: SerializeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], givenOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def unserialize(item: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def unserialize(item: String, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def unserialize(item: String, scope: js.Any, givenOptions: UnserializeOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], givenOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def unserialize(item: String, scope: Unit, givenOptions: UnserializeOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], givenOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def unserialize(item: Buffer): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def unserialize(item: Buffer, scope: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def unserialize(item: Buffer, scope: js.Any, givenOptions: UnserializeOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], givenOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def unserialize(item: Buffer, scope: Unit, givenOptions: UnserializeOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unserialize")(item.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], givenOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  trait SerializeOptions extends StObject {
    
    /** @default 'utf8' */
    val encoding: js.UndefOr[utf8 | binary] = js.undefined
  }
  object SerializeOptions {
    
    @scala.inline
    def apply(): SerializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SerializeOptions]
    }
    
    @scala.inline
    implicit class SerializeOptionsMutableBuilder[Self <: SerializeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: utf8 | binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  trait UnserializeOptions extends StObject {
    
    /** @default 'utf8' */
    val encoding: js.UndefOr[utf8 | binary] = js.undefined
    
    /** @default true' */
    val strict: js.UndefOr[Boolean] = js.undefined
  }
  object UnserializeOptions {
    
    @scala.inline
    def apply(): UnserializeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnserializeOptions]
    }
    
    @scala.inline
    implicit class UnserializeOptionsMutableBuilder[Self <: UnserializeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: utf8 | binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
}
