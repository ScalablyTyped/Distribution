package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Teamid extends StObject {
  
  /** The unique identifier of the team. */
  var team_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['team-id'] */ js.Any
}
object Teamid {
  
  inline def apply(
    team_id: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['team-id'] */ js.Any
  ): Teamid = {
    val __obj = js.Dynamic.literal(team_id = team_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Teamid]
  }
  
  extension [Self <: Teamid](x: Self) {
    
    inline def setTeam_id(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['team-id'] */ js.Any
    ): Self = StObject.set(x, "team_id", value.asInstanceOf[js.Any])
  }
}
