package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `611` extends StObject {
  
  /** The unique identifier of the project. */
  var project_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['project-id'] */ js.Any
  
  /** The unique identifier of the team. */
  var team_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['team-id'] */ js.Any
}
object `611` {
  
  inline def apply(
    project_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['project-id'] */ js.Any,
    team_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['team-id'] */ js.Any
  ): `611` = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[`611`]
  }
  
  extension [Self <: `611`](x: Self) {
    
    inline def setProject_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['project-id'] */ js.Any
    ): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['team-id'] */ js.Any
    ): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
