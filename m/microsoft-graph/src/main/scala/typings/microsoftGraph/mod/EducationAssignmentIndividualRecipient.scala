package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationAssignmentIndividualRecipient
  extends StObject
     with EducationAssignmentRecipient {
  
  // A collection of IDs of the recipients.
  var recipients: js.UndefOr[NullableOption[js.Array[String]]] = js.undefined
}
object EducationAssignmentIndividualRecipient {
  
  inline def apply(): EducationAssignmentIndividualRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationAssignmentIndividualRecipient]
  }
  
  extension [Self <: EducationAssignmentIndividualRecipient](x: Self) {
    
    inline def setRecipients(value: NullableOption[js.Array[String]]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsNull: Self = StObject.set(x, "recipients", null)
    
    inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    inline def setRecipientsVarargs(value: String*): Self = StObject.set(x, "recipients", js.Array(value*))
  }
}
