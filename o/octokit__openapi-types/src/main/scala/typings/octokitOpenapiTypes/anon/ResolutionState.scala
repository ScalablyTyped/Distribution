package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolutionState extends StObject {
  
  var resolution: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-resolution'] */ js.Any
  ] = js.undefined
  
  var state: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-state'] */ js.Any
}
object ResolutionState {
  
  inline def apply(
    state: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-state'] */ js.Any
  ): ResolutionState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolutionState]
  }
  
  extension [Self <: ResolutionState](x: Self) {
    
    inline def setResolution(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-resolution'] */ js.Any
    ): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setState(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-state'] */ js.Any
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
