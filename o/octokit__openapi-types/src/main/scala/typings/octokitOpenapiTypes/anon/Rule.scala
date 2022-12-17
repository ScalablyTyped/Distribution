package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  var created_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-created-at'] */ js.Any
  
  var dismissed_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-dismissed-at'] */ js.Any
  
  var dismissed_by: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
  
  var dismissed_comment: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-dismissed-comment'] */ js.Any
  ] = js.undefined
  
  var dismissed_reason: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-dismissed-reason'] */ js.Any
  
  var fixed_at: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-fixed-at'] */ js.Any
  ] = js.undefined
  
  var html_url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-html-url'] */ js.Any
  
  var instances_url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-instances-url'] */ js.Any
  
  var most_recent_instance: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-instance'] */ js.Any
  
  var number: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-number'] */ js.Any
  
  var rule: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-rule'] */ js.Any
  
  var state: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-state'] */ js.Any
  
  var tool: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool'] */ js.Any
  
  var updated_at: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-updated-at'] */ js.Any
  ] = js.undefined
  
  var url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-url'] */ js.Any
}
object Rule {
  
  inline def apply(
    created_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-created-at'] */ js.Any,
    dismissed_at: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-dismissed-at'] */ js.Any,
    dismissed_by: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any,
    dismissed_reason: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-dismissed-reason'] */ js.Any,
    html_url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-html-url'] */ js.Any,
    instances_url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-instances-url'] */ js.Any,
    most_recent_instance: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-instance'] */ js.Any,
    number: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-number'] */ js.Any,
    rule: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-rule'] */ js.Any,
    state: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-state'] */ js.Any,
    tool: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool'] */ js.Any,
    url: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-url'] */ js.Any
  ): Rule = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], dismissed_at = dismissed_at.asInstanceOf[js.Any], dismissed_by = dismissed_by.asInstanceOf[js.Any], dismissed_reason = dismissed_reason.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], instances_url = instances_url.asInstanceOf[js.Any], most_recent_instance = most_recent_instance.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tool = tool.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setCreated_at(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-created-at'] */ js.Any
    ): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_at(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-dismissed-at'] */ js.Any
    ): Self = StObject.set(x, "dismissed_at", value.asInstanceOf[js.Any])
    
    inline def setDismissed_by(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['nullable-simple-user'] */ js.Any
    ): Self = StObject.set(x, "dismissed_by", value.asInstanceOf[js.Any])
    
    inline def setDismissed_comment(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-dismissed-comment'] */ js.Any
    ): Self = StObject.set(x, "dismissed_comment", value.asInstanceOf[js.Any])
    
    inline def setDismissed_commentUndefined: Self = StObject.set(x, "dismissed_comment", js.undefined)
    
    inline def setDismissed_reason(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-dismissed-reason'] */ js.Any
    ): Self = StObject.set(x, "dismissed_reason", value.asInstanceOf[js.Any])
    
    inline def setFixed_at(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-fixed-at'] */ js.Any
    ): Self = StObject.set(x, "fixed_at", value.asInstanceOf[js.Any])
    
    inline def setFixed_atUndefined: Self = StObject.set(x, "fixed_at", js.undefined)
    
    inline def setHtml_url(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-html-url'] */ js.Any
    ): Self = StObject.set(x, "html_url", value.asInstanceOf[js.Any])
    
    inline def setInstances_url(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-instances-url'] */ js.Any
    ): Self = StObject.set(x, "instances_url", value.asInstanceOf[js.Any])
    
    inline def setMost_recent_instance(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-instance'] */ js.Any
    ): Self = StObject.set(x, "most_recent_instance", value.asInstanceOf[js.Any])
    
    inline def setNumber(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-number'] */ js.Any
    ): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setRule(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-rule'] */ js.Any
    ): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setState(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-alert-state'] */ js.Any
    ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTool(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['code-scanning-analysis-tool'] */ js.Any
    ): Self = StObject.set(x, "tool", value.asInstanceOf[js.Any])
    
    inline def setUpdated_at(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-updated-at'] */ js.Any
    ): Self = StObject.set(x, "updated_at", value.asInstanceOf[js.Any])
    
    inline def setUpdated_atUndefined: Self = StObject.set(x, "updated_at", js.undefined)
    
    inline def setUrl(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['alert-url'] */ js.Any
    ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
