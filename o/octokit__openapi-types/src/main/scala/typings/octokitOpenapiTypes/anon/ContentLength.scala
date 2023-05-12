package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentLength extends StObject {
  
  /** @example 279 */
  var `Content-Length`: js.UndefOr[String] = js.undefined
  
  var `Content-Type`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['content-type'] */ js.Any
  
  var `X-CommonMarker-Version`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-common-marker-version'] */ js.Any
}
object ContentLength {
  
  inline def apply(
    `Content-Type`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['content-type'] */ js.Any,
    `X-CommonMarker-Version`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-common-marker-version'] */ js.Any
  ): ContentLength = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Content-Type")(`Content-Type`.asInstanceOf[js.Any])
    __obj.updateDynamic("X-CommonMarker-Version")(`X-CommonMarker-Version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentLength] (val x: Self) extends AnyVal {
    
    inline def `setContent-Length`(value: String): Self = StObject.set(x, "Content-Length", value.asInstanceOf[js.Any])
    
    inline def `setContent-LengthUndefined`: Self = StObject.set(x, "Content-Length", js.undefined)
    
    inline def `setContent-Type`(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['content-type'] */ js.Any
    ): Self = StObject.set(x, "Content-Type", value.asInstanceOf[js.Any])
    
    inline def `setX-CommonMarker-Version`(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-common-marker-version'] */ js.Any
    ): Self = StObject.set(x, "X-CommonMarker-Version", value.asInstanceOf[js.Any])
  }
}
