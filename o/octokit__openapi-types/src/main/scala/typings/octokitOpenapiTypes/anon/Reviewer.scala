package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reviewer extends StObject {
  
  var reviewer: js.UndefOr[Avatarurl | Parent] = js.undefined
  
  var `type`: js.UndefOr[
    typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.User | typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Team
  ] = js.undefined
}
object Reviewer {
  
  inline def apply(): Reviewer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reviewer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reviewer] (val x: Self) extends AnyVal {
    
    inline def setReviewer(value: Avatarurl | Parent): Self = StObject.set(x, "reviewer", value.asInstanceOf[js.Any])
    
    inline def setReviewerUndefined: Self = StObject.set(x, "reviewer", js.undefined)
    
    inline def setType(
      value: typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.User | typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.Team
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
