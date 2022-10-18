package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Teamsurl extends StObject {
  
  /** @description The list of apps with review dismissal access. */
  var apps: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['integration'] */ js.Any
    ]
  ] = js.undefined
  
  /** @description The list of teams with review dismissal access. */
  var teams: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['team'] */ js.Any
    ]
  ] = js.undefined
  
  /** @example "https://api.github.com/repos/the-org/an-org-repo/branches/master/protection/dismissal_restrictions/teams" */
  var teams_url: js.UndefOr[String] = js.undefined
  
  /** @example "https://api.github.com/repos/the-org/an-org-repo/branches/master/protection/dismissal_restrictions" */
  var url: js.UndefOr[String] = js.undefined
  
  /** @description The list of users with review dismissal access. */
  var users: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ]
  ] = js.undefined
  
  /** @example "https://api.github.com/repos/the-org/an-org-repo/branches/master/protection/dismissal_restrictions/users" */
  var users_url: js.UndefOr[String] = js.undefined
}
object Teamsurl {
  
  inline def apply(): Teamsurl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Teamsurl]
  }
  
  extension [Self <: Teamsurl](x: Self) {
    
    inline def setApps(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['integration'] */ js.Any
        ]
    ): Self = StObject.set(x, "apps", value.asInstanceOf[js.Any])
    
    inline def setAppsUndefined: Self = StObject.set(x, "apps", js.undefined)
    
    inline def setAppsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['integration'] */ js.Any)*
    ): Self = StObject.set(x, "apps", js.Array(value*))
    
    inline def setTeams(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['team'] */ js.Any
        ]
    ): Self = StObject.set(x, "teams", value.asInstanceOf[js.Any])
    
    inline def setTeamsUndefined: Self = StObject.set(x, "teams", js.undefined)
    
    inline def setTeamsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['team'] */ js.Any)*
    ): Self = StObject.set(x, "teams", js.Array(value*))
    
    inline def setTeams_url(value: String): Self = StObject.set(x, "teams_url", value.asInstanceOf[js.Any])
    
    inline def setTeams_urlUndefined: Self = StObject.set(x, "teams_url", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUsers(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
        ]
    ): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any)*
    ): Self = StObject.set(x, "users", js.Array(value*))
    
    inline def setUsers_url(value: String): Self = StObject.set(x, "users_url", value.asInstanceOf[js.Any])
    
    inline def setUsers_urlUndefined: Self = StObject.set(x, "users_url", js.undefined)
  }
}
