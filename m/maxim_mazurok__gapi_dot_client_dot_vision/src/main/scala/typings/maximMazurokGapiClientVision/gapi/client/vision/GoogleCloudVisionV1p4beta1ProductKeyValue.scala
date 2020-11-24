package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudVisionV1p4beta1ProductKeyValue extends js.Object {
  
  /** The key of the label attached to the product. Cannot be empty and cannot exceed 128 bytes. */
  var key: js.UndefOr[String] = js.native
  
  /** The value of the label attached to the product. Cannot be empty and cannot exceed 128 bytes. */
  var value: js.UndefOr[String] = js.native
}
object GoogleCloudVisionV1p4beta1ProductKeyValue {
  
  @scala.inline
  def apply(): GoogleCloudVisionV1p4beta1ProductKeyValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1ProductKeyValue]
  }
  
  @scala.inline
  implicit class GoogleCloudVisionV1p4beta1ProductKeyValueOps[Self <: GoogleCloudVisionV1p4beta1ProductKeyValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
