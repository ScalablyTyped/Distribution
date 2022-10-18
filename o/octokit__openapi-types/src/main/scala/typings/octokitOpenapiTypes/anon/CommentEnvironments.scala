package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.approved
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.rejected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommentEnvironments extends StObject {
  
  /**
    * @description The comment submitted with the deployment review
    * @example Ship it!
    */
  var comment: String
  
  /** @description The list of environments that were approved or rejected */
  var environments: js.Array[CreatedatHtmlurl]
  
  /**
    * @description Whether deployment to the environment(s) was approved or rejected
    * @example approved
    * @enum {string}
    */
  var state: approved | rejected
  
  var user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
}
object CommentEnvironments {
  
  inline def apply(
    comment: String,
    environments: js.Array[CreatedatHtmlurl],
    state: approved | rejected,
    user: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
  ): CommentEnvironments = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], environments = environments.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentEnvironments]
  }
  
  extension [Self <: CommentEnvironments](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setEnvironments(value: js.Array[CreatedatHtmlurl]): Self = StObject.set(x, "environments", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentsVarargs(value: CreatedatHtmlurl*): Self = StObject.set(x, "environments", js.Array(value*))
    
    inline def setState(value: approved | rejected): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUser(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
