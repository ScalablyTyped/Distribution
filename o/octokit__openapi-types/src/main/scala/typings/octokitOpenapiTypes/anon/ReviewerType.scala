package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Team
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReviewerType extends StObject {
  
  var reviewer: js.UndefOr[Partial[Avatarurl] & Partial[Membersurl]] = js.undefined
  
  var `type`: js.UndefOr[typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.User | Team] = js.undefined
}
object ReviewerType {
  
  inline def apply(): ReviewerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReviewerType]
  }
  
  extension [Self <: ReviewerType](x: Self) {
    
    inline def setReviewer(value: Partial[Avatarurl] & Partial[Membersurl]): Self = StObject.set(x, "reviewer", value.asInstanceOf[js.Any])
    
    inline def setReviewerUndefined: Self = StObject.set(x, "reviewer", js.undefined)
    
    inline def setType(value: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.User | Team): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
