package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.approved
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentnameState extends StObject {
  
  /** @description Optional comment to include with the review. */
  var comment: js.UndefOr[String] = js.undefined
  
  /** @description The name of the environment to approve or reject. */
  var environment_name: String
  
  /**
    * @description Whether to approve or reject deployment to the specified environments.
    * @enum {string}
    */
  var state: approved | rejected
}
object EnvironmentnameState {
  
  inline def apply(environment_name: String, state: approved | rejected): EnvironmentnameState = {
    val __obj = js.Dynamic.literal(environment_name = environment_name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentnameState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnvironmentnameState] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setEnvironment_name(value: String): Self = StObject.set(x, "environment_name", value.asInstanceOf[js.Any])
    
    inline def setState(value: approved | rejected): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
