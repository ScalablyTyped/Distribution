package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationjsonApplicationvndgithubv3starjson extends StObject {
  
  @JSName("application/json")
  var applicationSlashjson: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository'] */ js.Any
  ]
  
  @JSName("application/vnd.github.v3.star+json")
  var applicationSlashvndDotgithubDotv3DotstarPlussignjson: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['starred-repository'] */ js.Any
  ]
}
object ApplicationjsonApplicationvndgithubv3starjson {
  
  inline def apply(
    applicationSlashjson: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository'] */ js.Any
    ],
    applicationSlashvndDotgithubDotv3DotstarPlussignjson: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['starred-repository'] */ js.Any
    ]
  ): ApplicationjsonApplicationvndgithubv3starjson = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("application/json")(applicationSlashjson.asInstanceOf[js.Any])
    __obj.updateDynamic("application/vnd.github.v3.star+json")(applicationSlashvndDotgithubDotv3DotstarPlussignjson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationjsonApplicationvndgithubv3starjson]
  }
  
  extension [Self <: ApplicationjsonApplicationvndgithubv3starjson](x: Self) {
    
    inline def setApplicationSlashjson(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository'] */ js.Any
        ]
    ): Self = StObject.set(x, "application/json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashjsonVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository'] */ js.Any)*
    ): Self = StObject.set(x, "application/json", js.Array(value*))
    
    inline def setApplicationSlashvndDotgithubDotv3DotstarPlussignjson(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['starred-repository'] */ js.Any
        ]
    ): Self = StObject.set(x, "application/vnd.github.v3.star+json", value.asInstanceOf[js.Any])
    
    inline def setApplicationSlashvndDotgithubDotv3DotstarPlussignjsonVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['starred-repository'] */ js.Any)*
    ): Self = StObject.set(x, "application/vnd.github.v3.star+json", js.Array(value*))
  }
}
