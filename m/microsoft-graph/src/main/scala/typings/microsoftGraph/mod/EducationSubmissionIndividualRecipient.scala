package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EducationSubmissionIndividualRecipient
  extends StObject
     with EducationSubmissionRecipient {
  
  // User ID of the user to whom the submission is assigned.
  var userId: js.UndefOr[NullableOption[String]] = js.undefined
}
object EducationSubmissionIndividualRecipient {
  
  inline def apply(): EducationSubmissionIndividualRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EducationSubmissionIndividualRecipient]
  }
  
  extension [Self <: EducationSubmissionIndividualRecipient](x: Self) {
    
    inline def setUserId(value: NullableOption[String]): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
