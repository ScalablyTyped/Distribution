package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Resolutioncomment extends StObject {
  
  var resolution: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-resolution'] */ js.Any
  ] = js.undefined
  
  var resolution_comment: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-resolution-comment'] */ js.Any
  ] = js.undefined
  
  var state: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-state'] */ js.Any
}
object Resolutioncomment {
  
  inline def apply(
    state: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-state'] */ js.Any
  ): Resolutioncomment = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Resolutioncomment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Resolutioncomment] (val x: Self) extends AnyVal {
    
    inline def setResolution(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-resolution'] */ js.Any
    ): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    inline def setResolution_comment(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-resolution-comment'] */ js.Any
    ): Self = StObject.set(x, "resolution_comment", value.asInstanceOf[js.Any])
    
    inline def setResolution_commentUndefined: Self = StObject.set(x, "resolution_comment", js.undefined)
    
    inline def setState(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['secret-scanning-alert-state'] */ js.Any
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
