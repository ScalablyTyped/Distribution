package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamsTeamsurl extends StObject {
  
  var apps: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['integration'] */ js.Any
    ]
  ] = js.undefined
  
  var teams: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['team'] */ js.Any
  ]
  
  /** Format: uri */
  var teams_url: String
  
  /** Format: uri */
  var url: String
  
  var users: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
  ]
  
  /** Format: uri */
  var users_url: String
}
object TeamsTeamsurl {
  
  inline def apply(
    teams: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['team'] */ js.Any
    ],
    teams_url: String,
    url: String,
    users: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ],
    users_url: String
  ): TeamsTeamsurl = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsTeamsurl]
  }
  
  extension [Self <: TeamsTeamsurl](x: Self) {
    
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
    
    inline def setTeamsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['team'] */ js.Any)*
    ): Self = StObject.set(x, "teams", js.Array(value*))
    
    inline def setTeams_url(value: String): Self = StObject.set(x, "teams_url", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUsers(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
        ]
    ): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any)*
    ): Self = StObject.set(x, "users", js.Array(value*))
    
    inline def setUsers_url(value: String): Self = StObject.set(x, "users_url", value.asInstanceOf[js.Any])
  }
}
