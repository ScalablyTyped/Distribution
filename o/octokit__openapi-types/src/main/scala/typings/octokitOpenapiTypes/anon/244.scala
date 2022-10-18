package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `244` extends StObject {
  
  /** The slug version of the enterprise name or the login of an organization. */
  var enterprise_or_org: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise-or-org'] */ js.Any
}
object `244` {
  
  inline def apply(
    enterprise_or_org: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise-or-org'] */ js.Any
  ): `244` = {
    val __obj = js.Dynamic.literal(enterprise_or_org = enterprise_or_org.asInstanceOf[js.Any])
    __obj.asInstanceOf[`244`]
  }
  
  extension [Self <: `244`](x: Self) {
    
    inline def setEnterprise_or_org(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['parameters']['enterprise-or-org'] */ js.Any
    ): Self = StObject.set(x, "enterprise_or_org", value.asInstanceOf[js.Any])
  }
}
