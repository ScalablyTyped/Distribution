package typings.md5

import typings.md5.md5Booleans.`true`
import typings.md5.md5Strings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined md5.md5.Options & {  asBytes :true} */
  trait OptionsasBytestrue extends StObject {
    
    var asBytes: js.UndefOr[Boolean] & `true`
    
    var asString: js.UndefOr[Boolean] = js.undefined
    
    var encoding: js.UndefOr[binary | String] = js.undefined
  }
  object OptionsasBytestrue {
    
    inline def apply(asBytes: js.UndefOr[Boolean] & `true`): OptionsasBytestrue = {
      val __obj = js.Dynamic.literal(asBytes = asBytes.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsasBytestrue]
    }
    
    extension [Self <: OptionsasBytestrue](x: Self) {
      
      inline def setAsBytes(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "asBytes", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: PickOptionsasStringencodi](x: Self) {
      
      inline def setAsString(value: Boolean): Self = StObject.set(x, "asString", value.asInstanceOf[js.Any])
      
      inline def setAsStringUndefined: Self = StObject.set(x, "asString", js.undefined)
      
      inline def setEncoding(value: binary | String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    }
  }
}
