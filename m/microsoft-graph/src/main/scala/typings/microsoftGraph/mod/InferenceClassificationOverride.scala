package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InferenceClassificationOverride extends Entity {
  
  /**
    * Specifies how incoming messages from a specific sender should always be classified as. The possible values are:
    * focused, other.
    */
  var classifyAs: js.UndefOr[NullableOption[InferenceClassificationType]] = js.native
  
  // The email address information of the sender for whom the override is created.
  var senderEmailAddress: js.UndefOr[NullableOption[EmailAddress]] = js.native
}
object InferenceClassificationOverride {
  
  @scala.inline
  def apply(): InferenceClassificationOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceClassificationOverride]
  }
  
  @scala.inline
  implicit class InferenceClassificationOverrideOps[Self <: InferenceClassificationOverride] (val x: Self) extends AnyVal {
    
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
    def setClassifyAs(value: NullableOption[InferenceClassificationType]): Self = this.set("classifyAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassifyAs: Self = this.set("classifyAs", js.undefined)
    
    @scala.inline
    def setClassifyAsNull: Self = this.set("classifyAs", null)
    
    @scala.inline
    def setSenderEmailAddress(value: NullableOption[EmailAddress]): Self = this.set("senderEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderEmailAddress: Self = this.set("senderEmailAddress", js.undefined)
    
    @scala.inline
    def setSenderEmailAddressNull: Self = this.set("senderEmailAddress", null)
  }
}
