package typings.maximMazurokGapiClientSpeech.gapi.client.speech

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomClassRequest extends StObject {
  
  /** Required. The custom class to create. */
  var customClass: js.UndefOr[CustomClass] = js.undefined
  
  /**
    * Required. The ID to use for the custom class, which will become the final component of the custom class' resource name. This value should restrict to letters, numbers, and hyphens,
    * with the first character a letter, the last a letter or a number, and be 4-63 characters.
    */
  var customClassId: js.UndefOr[String] = js.undefined
}
object CreateCustomClassRequest {
  
  inline def apply(): CreateCustomClassRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomClassRequest]
  }
  
  extension [Self <: CreateCustomClassRequest](x: Self) {
    
    inline def setCustomClass(value: CustomClass): Self = StObject.set(x, "customClass", value.asInstanceOf[js.Any])
    
    inline def setCustomClassId(value: String): Self = StObject.set(x, "customClassId", value.asInstanceOf[js.Any])
    
    inline def setCustomClassIdUndefined: Self = StObject.set(x, "customClassId", js.undefined)
    
    inline def setCustomClassUndefined: Self = StObject.set(x, "customClass", js.undefined)
  }
}
