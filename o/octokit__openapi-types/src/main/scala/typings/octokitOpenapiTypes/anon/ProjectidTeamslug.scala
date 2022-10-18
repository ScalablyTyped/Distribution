package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectidTeamslug extends StObject {
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
  
  /** The unique identifier of the project. */
  var project_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['project-id'] */ js.Any
  
  /** The slug of the team name. */
  var team_slug: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['team-slug'] */ js.Any
}
object ProjectidTeamslug {
  
  inline def apply(
    org_ : /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any,
    project_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['project-id'] */ js.Any,
    team_slug: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['team-slug'] */ js.Any
  ): ProjectidTeamslug = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any], team_slug = team_slug.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectidTeamslug]
  }
  
  extension [Self <: ProjectidTeamslug](x: Self) {
    
    inline def setOrg_(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['org'] */ js.Any
    ): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setProject_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['project-id'] */ js.Any
    ): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setTeam_slug(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['team-slug'] */ js.Any
    ): Self = StObject.set(x, "team_slug", value.asInstanceOf[js.Any])
  }
}
