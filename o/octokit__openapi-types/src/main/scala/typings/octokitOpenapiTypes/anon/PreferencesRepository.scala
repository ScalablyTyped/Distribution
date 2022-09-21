package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreferencesRepository extends StObject {
  
  var preferences: Autotriggerchecks
  
  var repository: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['minimal-repository'] */ js.Any
}
object PreferencesRepository {
  
  inline def apply(
    preferences: Autotriggerchecks,
    repository: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['minimal-repository'] */ js.Any
  ): PreferencesRepository = {
    val __obj = js.Dynamic.literal(preferences = preferences.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferencesRepository]
  }
  
  extension [Self <: PreferencesRepository](x: Self) {
    
    inline def setPreferences(value: Autotriggerchecks): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
    
    inline def setRepository(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['minimal-repository'] */ js.Any
    ): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
  }
}
