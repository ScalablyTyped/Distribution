package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enterpriseororg extends StObject {
  
  /** The slug version of the enterprise name or the login of an organization. */
  var enterprise_or_org: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise-or-org'] */ js.Any
}
object Enterpriseororg {
  
  inline def apply(
    enterprise_or_org: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise-or-org'] */ js.Any
  ): Enterpriseororg = {
    val __obj = js.Dynamic.literal(enterprise_or_org = enterprise_or_org.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enterpriseororg]
  }
  
  extension [Self <: Enterpriseororg](x: Self) {
    
    inline def setEnterprise_or_org(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise-or-org'] */ js.Any
    ): Self = StObject.set(x, "enterprise_or_org", value.asInstanceOf[js.Any])
  }
}
