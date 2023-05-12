package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Strictrequiredstatuscheckspolicy extends StObject {
  
  /** @description Status checks that are required. */
  var required_status_checks: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule-params-status-check-configuration'] */ js.Any
  ]
  
  /** @description Whether pull requests targeting a matching branch must be tested with the latest code. This setting will not take effect unless at least one status check is enabled. */
  var strict_required_status_checks_policy: Boolean
}
object Strictrequiredstatuscheckspolicy {
  
  inline def apply(
    required_status_checks: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule-params-status-check-configuration'] */ js.Any
    ],
    strict_required_status_checks_policy: Boolean
  ): Strictrequiredstatuscheckspolicy = {
    val __obj = js.Dynamic.literal(required_status_checks = required_status_checks.asInstanceOf[js.Any], strict_required_status_checks_policy = strict_required_status_checks_policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Strictrequiredstatuscheckspolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Strictrequiredstatuscheckspolicy] (val x: Self) extends AnyVal {
    
    inline def setRequired_status_checks(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule-params-status-check-configuration'] */ js.Any
        ]
    ): Self = StObject.set(x, "required_status_checks", value.asInstanceOf[js.Any])
    
    inline def setRequired_status_checksVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['repository-rule-params-status-check-configuration'] */ js.Any)*
    ): Self = StObject.set(x, "required_status_checks", js.Array(value*))
    
    inline def setStrict_required_status_checks_policy(value: Boolean): Self = StObject.set(x, "strict_required_status_checks_policy", value.asInstanceOf[js.Any])
  }
}
