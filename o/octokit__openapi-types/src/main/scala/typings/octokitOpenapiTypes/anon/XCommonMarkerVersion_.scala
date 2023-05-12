package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCommonMarkerVersion_ extends StObject {
  
  var `X-CommonMarker-Version`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-common-marker-version'] */ js.Any
}
object XCommonMarkerVersion_ {
  
  inline def apply(
    `X-CommonMarker-Version`: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-common-marker-version'] */ js.Any
  ): XCommonMarkerVersion_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("X-CommonMarker-Version")(`X-CommonMarker-Version`.asInstanceOf[js.Any])
    __obj.asInstanceOf[XCommonMarkerVersion_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XCommonMarkerVersion_] (val x: Self) extends AnyVal {
    
    inline def `setX-CommonMarker-Version`(
      value: /* import warning: importer.ImportType#apply Failed type conversion: @octokit/openapi-types.@octokit/openapi-types.components['headers']['x-common-marker-version'] */ js.Any
    ): Self = StObject.set(x, "X-CommonMarker-Version", value.asInstanceOf[js.Any])
  }
}
