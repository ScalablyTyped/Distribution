package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p2beta1ProductKeyValue extends StObject {
  
  /** The key of the label attached to the product. Cannot be empty and cannot exceed 128 bytes. */
  var key: js.UndefOr[String] = js.native
  
  /** The value of the label attached to the product. Cannot be empty and cannot exceed 128 bytes. */
  var value: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p2beta1ProductKeyValue {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p2beta1ProductKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1ProductKeyValue]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p2beta1ProductKeyValueMutableBuilder[Self <: GoogleCloudVisionV1p2beta1ProductKeyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
