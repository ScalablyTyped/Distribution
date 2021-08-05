package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatientId extends StObject {
  
  /** ID type. For example, MRN or NHS. */
  var `type`: js.UndefOr[String] = js.undefined
  
  /** The patient's unique identifier. */
  var value: js.UndefOr[String] = js.undefined
}
object PatientId {
  
  inline def apply(): PatientId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatientId]
  }
  
  extension [Self <: PatientId](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
