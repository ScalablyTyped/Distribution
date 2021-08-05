package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InferenceClassificationOverride
  extends StObject
     with Entity {
  
  /**
    * Specifies how incoming messages from a specific sender should always be classified as. The possible values are:
    * focused, other.
    */
  var classifyAs: js.UndefOr[NullableOption[InferenceClassificationType]] = js.undefined
  
  // The email address information of the sender for whom the override is created.
  var senderEmailAddress: js.UndefOr[NullableOption[EmailAddress]] = js.undefined
}
object InferenceClassificationOverride {
  
  inline def apply(): InferenceClassificationOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InferenceClassificationOverride]
  }
  
  extension [Self <: InferenceClassificationOverride](x: Self) {
    
    inline def setClassifyAs(value: NullableOption[InferenceClassificationType]): Self = StObject.set(x, "classifyAs", value.asInstanceOf[js.Any])
    
    inline def setClassifyAsNull: Self = StObject.set(x, "classifyAs", null)
    
    inline def setClassifyAsUndefined: Self = StObject.set(x, "classifyAs", js.undefined)
    
    inline def setSenderEmailAddress(value: NullableOption[EmailAddress]): Self = StObject.set(x, "senderEmailAddress", value.asInstanceOf[js.Any])
    
    inline def setSenderEmailAddressNull: Self = StObject.set(x, "senderEmailAddress", null)
    
    inline def setSenderEmailAddressUndefined: Self = StObject.set(x, "senderEmailAddress", js.undefined)
  }
}
