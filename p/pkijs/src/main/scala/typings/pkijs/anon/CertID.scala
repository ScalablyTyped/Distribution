package typings.pkijs.anon

import typings.pkijs.mod.CertIDSchema
import typings.pkijs.mod.ExtensionsSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertID extends StObject {
  
  var certID: js.UndefOr[CertIDSchema] = js.undefined
  
  var certStatus: js.UndefOr[String] = js.undefined
  
  var nextUpdate: js.UndefOr[String] = js.undefined
  
  var singleExtensions: js.UndefOr[ExtensionsSchema] = js.undefined
  
  var thisUpdate: js.UndefOr[String] = js.undefined
}
object CertID {
  
  inline def apply(): CertID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertID]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertID] (val x: Self) extends AnyVal {
    
    inline def setCertID(value: CertIDSchema): Self = StObject.set(x, "certID", value.asInstanceOf[js.Any])
    
    inline def setCertIDUndefined: Self = StObject.set(x, "certID", js.undefined)
    
    inline def setCertStatus(value: String): Self = StObject.set(x, "certStatus", value.asInstanceOf[js.Any])
    
    inline def setCertStatusUndefined: Self = StObject.set(x, "certStatus", js.undefined)
    
    inline def setNextUpdate(value: String): Self = StObject.set(x, "nextUpdate", value.asInstanceOf[js.Any])
    
    inline def setNextUpdateUndefined: Self = StObject.set(x, "nextUpdate", js.undefined)
    
    inline def setSingleExtensions(value: ExtensionsSchema): Self = StObject.set(x, "singleExtensions", value.asInstanceOf[js.Any])
    
    inline def setSingleExtensionsUndefined: Self = StObject.set(x, "singleExtensions", js.undefined)
    
    inline def setThisUpdate(value: String): Self = StObject.set(x, "thisUpdate", value.asInstanceOf[js.Any])
    
    inline def setThisUpdateUndefined: Self = StObject.set(x, "thisUpdate", js.undefined)
  }
}
