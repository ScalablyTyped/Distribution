package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1Property extends StObject {
  
  /** Name of the property. */
  var name: js.UndefOr[String] = js.native
  
  /** Value of numeric properties. */
  var uint64Value: js.UndefOr[String] = js.native
  
  /** Value of the property. */
  var value: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p4beta1Property {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1Property = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1Property]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1PropertyMutableBuilder[Self <: GoogleCloudVisionV1p4beta1Property] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUint64Value(value: String): Self = StObject.set(x, "uint64Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUint64ValueUndefined: Self = StObject.set(x, "uint64Value", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
