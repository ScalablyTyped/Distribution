package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpiryLimit extends StObject {
  
  var expiry: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['interaction-expiry'] */ js.Any
  ] = js.undefined
  
  var limit: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['interaction-group'] */ js.Any
}
object ExpiryLimit {
  
  inline def apply(
    limit: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['interaction-group'] */ js.Any
  ): ExpiryLimit = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpiryLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpiryLimit] (val x: Self) extends AnyVal {
    
    inline def setExpiry(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['interaction-expiry'] */ js.Any
    ): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setLimit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['schemas']['interaction-group'] */ js.Any
    ): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
  }
}
