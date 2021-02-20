package typings.md5

import typings.md5.md5Booleans.`true`
import typings.md5.md5Strings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined md5.md5.Options & {  asBytes :true} */
  @js.native
  trait OptionsasBytestrue extends StObject {
    
    var asBytes: js.UndefOr[Boolean] with `true` = js.native
    
    var asString: js.UndefOr[Boolean] = js.native
    
    var encoding: js.UndefOr[binary | String] = js.native
  }
  object OptionsasBytestrue {
    
    @scala.inline
    def apply(asBytes: js.UndefOr[Boolean] with `true`): OptionsasBytestrue = {
      val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsasBytestrue]
    }
    
    @scala.inline
    implicit class OptionsasBytestrueMutableBuilder[Self <: OptionsasBytestrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsBytes(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "asBytes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
      
      @scala.inline
      def setEncoding(value: binary | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  /* Inlined std.Pick<md5.md5.Options, 'asString' | 'encoding'> */
  @js.native
  trait PickOptionsasStringencodi extends StObject {
    
    var asString: js.UndefOr[Boolean] = js.native
    
    var encoding: js.UndefOr[binary | String] = js.native
  }
  object PickOptionsasStringencodi {
    
    @scala.inline
    def apply(): PickOptionsasStringencodi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptionsasStringencodi]
    }
    
    @scala.inline
    implicit class PickOptionsasStringencodiMutableBuilder[Self <: PickOptionsasStringencodi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
      
      @scala.inline
      def setEncoding(value: binary | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
