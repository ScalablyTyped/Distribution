package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
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
  implicit class InferenceClassificationOverrideMutableBuilder[Self <: InferenceClassificationOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifyAs(value: NullableOption[InferenceClassificationType]): Self = StObject.set(x, "classifyAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassifyAsNull: Self = StObject.set(x, "classifyAs", null)
    
    @scala.inline
    def setClassifyAsUndefined: Self = StObject.set(x, "classifyAs", js.undefined)
    
    @scala.inline
    def setSenderEmailAddress(value: NullableOption[EmailAddress]): Self = StObject.set(x, "senderEmailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderEmailAddressNull: Self = StObject.set(x, "senderEmailAddress", null)
    
    @scala.inline
    def setSenderEmailAddressUndefined: Self = StObject.set(x, "senderEmailAddress", js.undefined)
  }
}
