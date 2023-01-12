package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1ProductKeyValue extends StObject {
  
  /** The key of the label attached to the product. Cannot be empty and cannot exceed 128 bytes. */
  var key: js.UndefOr[String] = js.undefined
  
  /** The value of the label attached to the product. Cannot be empty and cannot exceed 128 bytes. */
  var value: js.UndefOr[String] = js.undefined
}
object GoogleCloudVisionV1p4beta1ProductKeyValue {
  
  inline def apply(): GoogleCloudVisionV1p4beta1ProductKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1ProductKeyValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudVisionV1p4beta1ProductKeyValue] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
