package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Billableowner extends StObject {
  
  var billable_owner: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
  ] = js.undefined
  
  var defaults: js.UndefOr[Devcontainerpath] = js.undefined
}
object Billableowner {
  
  inline def apply(): Billableowner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Billableowner]
  }
  
  extension [Self <: Billableowner](x: Self) {
    
    inline def setBillable_owner(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['simple-user'] */ js.Any
    ): Self = StObject.set(x, "billable_owner", value.asInstanceOf[js.Any])
    
    inline def setBillable_ownerUndefined: Self = StObject.set(x, "billable_owner", js.undefined)
    
    inline def setDefaults(value: Devcontainerpath): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
  }
}
