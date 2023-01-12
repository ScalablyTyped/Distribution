package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Reviewers extends StObject {
  
  /** @description An array of user `login`s that will be requested. */
  var reviewers: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description An array of team `slug`s that will be requested. */
  var team_reviewers: js.UndefOr[js.Array[String]] = js.undefined
}
object Reviewers {
  
  inline def apply(): Reviewers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Reviewers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Reviewers] (val x: Self) extends AnyVal {
    
    inline def setReviewers(value: js.Array[String]): Self = StObject.set(x, "reviewers", value.asInstanceOf[js.Any])
    
    inline def setReviewersUndefined: Self = StObject.set(x, "reviewers", js.undefined)
    
    inline def setReviewersVarargs(value: String*): Self = StObject.set(x, "reviewers", js.Array(value*))
    
    inline def setTeam_reviewers(value: js.Array[String]): Self = StObject.set(x, "team_reviewers", value.asInstanceOf[js.Any])
    
    inline def setTeam_reviewersUndefined: Self = StObject.set(x, "team_reviewers", js.undefined)
    
    inline def setTeam_reviewersVarargs(value: String*): Self = StObject.set(x, "team_reviewers", js.Array(value*))
  }
}
