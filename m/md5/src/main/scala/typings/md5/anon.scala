package typings.md5

import typings.md5.md5Strings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined md5.md5.Options & {  asBytes :true} */
  trait OptionsasBytestrue extends StObject {
    
    var asBytes: js.UndefOr[Boolean] = js.undefined
    
    var asString: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[binary | String] = js.undefined
  }
  object OptionsasBytestrue {
    
    inline def apply(): OptionsasBytestrue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsasBytestrue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsasBytestrue] (val x: Self) extends AnyVal {
      
      inline def setAsBytes(value: Boolean): Self = StObject.set(x, "asBytes", value.asInstanceOf[js.Any])
      
      inline def setAsBytesUndefined: Self = StObject.set(x, "asBytes", js.undefined)
      
      inline def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      inline def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
      
      inline def setEncoding(value: binary | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
  
  /* Inlined std.Pick<md5.md5.Options, 'asString' | 'encoding'> */
  trait PickOptionsasStringencodi extends StObject {
    
    var asString: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[binary | String] = js.undefined
  }
  object PickOptionsasStringencodi {
    
    inline def apply(): PickOptionsasStringencodi = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PickOptionsasStringencodi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PickOptionsasStringencodi] (val x: Self) extends AnyVal {
      
      inline def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      inline def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
      
      inline def setEncoding(value: binary | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
