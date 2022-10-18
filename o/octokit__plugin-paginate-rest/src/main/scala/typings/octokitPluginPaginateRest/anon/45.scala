package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.distTypesGeneratedEndpointsMod.ExtractOctokitResponse
import typings.octokitTypes.distTypesGeneratedEndpointsMod.RequiredPreview
import typings.octokitTypes.distTypesGeneratedEndpointsMod.ToOctokitParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `45` extends StObject {
  
  var parameters: (ToOctokitParameters[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/actions/secrets']['get'] */ js.Any
  ]) & RequiredPreview[Any]
  
  var response: (ExtractOctokitResponse[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/actions/secrets']['get'] */ js.Any
  ]) & `44`
}
object `45` {
  
  inline def apply(
    parameters: (ToOctokitParameters[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/actions/secrets']['get'] */ js.Any
    ]) & RequiredPreview[Any],
    response: (ExtractOctokitResponse[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/actions/secrets']['get'] */ js.Any
    ]) & `44`
  ): `45` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`45`]
  }
  
  extension [Self <: `45`](x: Self) {
    
    inline def setParameters(
      value: (ToOctokitParameters[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/actions/secrets']['get'] */ js.Any
        ]) & RequiredPreview[Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setResponse(
      value: (ExtractOctokitResponse[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.paths['/orgs/{org}/actions/secrets']['get'] */ js.Any
        ]) & `44`
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
