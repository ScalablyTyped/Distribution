package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dismissedcomment extends StObject {
  
  var dismissed_comment: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-dismissed-comment'] */ js.Any
  ] = js.undefined
  
  var dismissed_reason: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-dismissed-reason'] */ js.Any
  ] = js.undefined
  
  var state: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-set-state'] */ js.Any
}
object Dismissedcomment {
  
  inline def apply(
    state: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-set-state'] */ js.Any
  ): Dismissedcomment = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dismissedcomment]
  }
  
  extension [Self <: Dismissedcomment](x: Self) {
    
    inline def setDismissed_comment(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-dismissed-comment'] */ js.Any
    ): Self = StObject.set(x, "dismissed_comment", value.asInstanceOf[js.Any])
    
    inline def setDismissed_commentUndefined: Self = StObject.set(x, "dismissed_comment", js.undefined)
    
    inline def setDismissed_reason(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-dismissed-reason'] */ js.Any
    ): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setDismissed_reasonUndefined: Self = StObject.set(x, "dismissed_reason", js.undefined)
    
    inline def setState(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-set-state'] */ js.Any
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
