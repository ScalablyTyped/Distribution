package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessReviewReviewer
  extends StObject
     with Entity {
  
  // The date when the reviewer was added for the access review.
  var createdDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Name of reviewer.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // User principal name of the reviewer.
  var userPrincipalName: js.UndefOr[NullableOption[String]] = js.undefined
}
object AccessReviewReviewer {
  
  inline def apply(): AccessReviewReviewer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessReviewReviewer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessReviewReviewer] (val x: Self) extends AnyVal {
    
    inline def setCreatedDateTime(value: NullableOption[String]): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeNull: Self = StObject.set(x, "createdDateTime", null)
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setUserPrincipalName(value: NullableOption[String]): Self = StObject.set(x, "userPrincipalName", value.asInstanceOf[js.Any])
    
    inline def setUserPrincipalNameNull: Self = StObject.set(x, "userPrincipalName", null)
    
    inline def setUserPrincipalNameUndefined: Self = StObject.set(x, "userPrincipalName", js.undefined)
  }
}
