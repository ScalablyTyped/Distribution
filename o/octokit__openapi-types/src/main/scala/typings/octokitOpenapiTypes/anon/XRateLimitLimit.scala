package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRateLimitLimit extends StObject {
  
  var `X-RateLimit-Limit`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-rate-limit-limit'] */ js.Any
  
  var `X-RateLimit-Remaining`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-rate-limit-remaining'] */ js.Any
  
  var `X-RateLimit-Reset`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-rate-limit-reset'] */ js.Any
}
object XRateLimitLimit {
  
  inline def apply(
    `X-RateLimit-Limit`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-rate-limit-limit'] */ js.Any,
    `X-RateLimit-Remaining`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-rate-limit-remaining'] */ js.Any,
    `X-RateLimit-Reset`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-rate-limit-reset'] */ js.Any
  ): XRateLimitLimit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("X-RateLimit-Limit")(`X-RateLimit-Limit`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-RateLimit-Remaining")(`X-RateLimit-Remaining`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-RateLimit-Reset")(`X-RateLimit-Reset`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRateLimitLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRateLimitLimit] (val x: Self) extends AnyVal {
    
    inline def `setX-RateLimit-Limit`(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-rate-limit-limit'] */ js.Any
    ): Self = StObject.set(x, "X-RateLimit-Limit", value.asInstanceOf[js.Any])
    
    inline def `setX-RateLimit-Remaining`(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-rate-limit-remaining'] */ js.Any
    ): Self = StObject.set(x, "X-RateLimit-Remaining", value.asInstanceOf[js.Any])
    
    inline def `setX-RateLimit-Reset`(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-rate-limit-reset'] */ js.Any
    ): Self = StObject.set(x, "X-RateLimit-Reset", value.asInstanceOf[js.Any])
  }
}
