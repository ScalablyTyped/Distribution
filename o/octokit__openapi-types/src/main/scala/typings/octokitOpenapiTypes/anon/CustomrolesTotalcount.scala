package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomrolesTotalcount extends StObject {
  
  var custom_roles: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['organization-custom-repository-role'] */ js.Any
    ]
  ] = js.undefined
  
  /**
    * @description The number of custom roles in this organization
    * @example 3
    */
  var total_count: js.UndefOr[Double] = js.undefined
}
object CustomrolesTotalcount {
  
  inline def apply(): CustomrolesTotalcount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomrolesTotalcount]
  }
  
  extension [Self <: CustomrolesTotalcount](x: Self) {
    
    inline def setCustom_roles(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['organization-custom-repository-role'] */ js.Any
        ]
    ): Self = StObject.set(x, "custom_roles", value.asInstanceOf[js.Any])
    
    inline def setCustom_rolesUndefined: Self = StObject.set(x, "custom_roles", js.undefined)
    
    inline def setCustom_rolesVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['organization-custom-repository-role'] */ js.Any)*
    ): Self = StObject.set(x, "custom_roles", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_countUndefined: Self = StObject.set(x, "total_count", js.undefined)
  }
}
