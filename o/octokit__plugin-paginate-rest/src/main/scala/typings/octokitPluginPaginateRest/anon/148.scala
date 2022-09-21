package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.endpointsMod.ExtractOctokitResponse
import typings.octokitTypes.endpointsMod.RequiredPreview
import typings.octokitTypes.endpointsMod.ToOctokitParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `148` extends StObject {
  
  var parameters: (ToOctokitParameters[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies']['get'] */ js.Any
  ]) & RequiredPreview[Any]
  
  var response: (ExtractOctokitResponse[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies']['get'] */ js.Any
  ]) & `147`
}
object `148` {
  
  inline def apply(
    parameters: (ToOctokitParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies']['get'] */ js.Any
    ]) & RequiredPreview[Any],
    response: (ExtractOctokitResponse[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies']['get'] */ js.Any
    ]) & `147`
  ): `148` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`148`]
  }
  
  extension [Self <: `148`](x: Self) {
    
    inline def setParameters(
      value: (ToOctokitParameters[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies']['get'] */ js.Any
        ]) & RequiredPreview[Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: (ExtractOctokitResponse[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/repos/{owner}/{repo}/environments/{environment_name}/deployment-branch-policies']['get'] */ js.Any
        ]) & `147`
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
