package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonApplicationvndgithubobject extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['content-directory'] */ js.Any
  
  @JSName("application/vnd.github.object")
  var applicationSlashvndDotgithubDotobject: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['content-tree'] */ js.Any
}
object ApplicationjsonApplicationvndgithubobject {
  
  inline def apply(
    applicationSlashjson: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['content-directory'] */ js.Any,
    applicationSlashvndDotgithubDotobject: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['content-tree'] */ js.Any
  ): ApplicationjsonApplicationvndgithubobject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.updateDynamic("application/vnd.github.object")(applicationSlashvndDotgithubDotobject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonApplicationvndgithubobject]
  }
  
  extension [Self <: ApplicationjsonApplicationvndgithubobject](x: Self) {
    
    inline def setApplicationSlashjson(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['content-directory'] */ js.Any
    ): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashvndDotgithubDotobject(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['content-tree'] */ js.Any
    ): Self = StObject.set(x, "application/vnd.github.object", value.asInstanceOf[js.Any])
  }
}
