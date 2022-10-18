package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationsTotalcount extends StObject {
  
  var organizations: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['organization-simple'] */ js.Any
  ]
  
  var total_count: Double
}
object OrganizationsTotalcount {
  
  inline def apply(
    organizations: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['organization-simple'] */ js.Any
    ],
    total_count: Double
  ): OrganizationsTotalcount = {
    val __obj = js.Dynamic.literal(organizations = organizations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationsTotalcount]
  }
  
  extension [Self <: OrganizationsTotalcount](x: Self) {
    
    inline def setOrganizations(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['organization-simple'] */ js.Any
        ]
    ): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['organization-simple'] */ js.Any)*
    ): Self = StObject.set(x, "organizations", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
