package typings.phpSerialize

import typings.node.Buffer
import typings.phpSerialize.phpSerializeStrings.binary
import typings.phpSerialize.phpSerializeStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("php-serialize", "isSerialized")
  @js.native
  def isSerialized(givenItem: js.Any): Boolean = js.native
  @JSImport("php-serialize", "isSerialized")
  @js.native
  def isSerialized(givenItem: js.Any, strict: Boolean): Boolean = js.native
  
  @JSImport("php-serialize", "serialize")
  @js.native
  def serialize(item: js.Any): String = js.native
  @JSImport("php-serialize", "serialize")
  @js.native
  def serialize(item: js.Any, scope: js.UndefOr[scala.Nothing], givenOptions: SerializeOptions): String = js.native
  @JSImport("php-serialize", "serialize")
  @js.native
  def serialize(item: js.Any, scope: js.Any): String = js.native
  @JSImport("php-serialize", "serialize")
  @js.native
  def serialize(item: js.Any, scope: js.Any, givenOptions: SerializeOptions): String = js.native
  
  @JSImport("php-serialize", "unserialize")
  @js.native
  def unserialize(item: String): js.Any = js.native
  @JSImport("php-serialize", "unserialize")
  @js.native
  def unserialize(item: String, scope: js.UndefOr[scala.Nothing], givenOptions: UnserializeOptions): js.Any = js.native
  @JSImport("php-serialize", "unserialize")
  @js.native
  def unserialize(item: String, scope: js.Any): js.Any = js.native
  @JSImport("php-serialize", "unserialize")
  @js.native
  def unserialize(item: String, scope: js.Any, givenOptions: UnserializeOptions): js.Any = js.native
  @JSImport("php-serialize", "unserialize")
  @js.native
  def unserialize(item: Buffer): js.Any = js.native
  @JSImport("php-serialize", "unserialize")
  @js.native
  def unserialize(item: Buffer, scope: js.UndefOr[scala.Nothing], givenOptions: UnserializeOptions): js.Any = js.native
  @JSImport("php-serialize", "unserialize")
  @js.native
  def unserialize(item: Buffer, scope: js.Any): js.Any = js.native
  @JSImport("php-serialize", "unserialize")
  @js.native
  def unserialize(item: Buffer, scope: js.Any, givenOptions: UnserializeOptions): js.Any = js.native
  
  @js.native
  trait SerializeOptions extends StObject {
    
    /** @default 'utf8' */
    val encoding: js.UndefOr[utf8 | binary] = js.native
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
  
  @js.native
  trait UnserializeOptions extends StObject {
    
    /** @default 'utf8' */
    val encoding: js.UndefOr[utf8 | binary] = js.native
    
    /** @default true' */
    val strict: js.UndefOr[Boolean] = js.native
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
