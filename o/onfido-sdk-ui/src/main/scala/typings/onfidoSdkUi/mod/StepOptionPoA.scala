package typings.onfidoSdkUi.mod

import typings.onfidoSdkUi.anon.PartialRecordPoaTypesbool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepOptionPoA extends StObject {
  
  var country: js.UndefOr[String] = js.undefined
  
  var documentTypes: js.UndefOr[PartialRecordPoaTypesbool] = js.undefined
}
object StepOptionPoA {
  
  inline def apply(): StepOptionPoA = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepOptionPoA]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StepOptionPoA] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setDocumentTypes(value: PartialRecordPoaTypesbool): Self = StObject.set(x, "documentTypes", value.asInstanceOf[js.Any])
    
    inline def setDocumentTypesUndefined: Self = StObject.set(x, "documentTypes", js.undefined)
  }
}
