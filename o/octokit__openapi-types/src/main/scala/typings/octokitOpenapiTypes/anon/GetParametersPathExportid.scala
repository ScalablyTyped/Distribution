package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathExportid extends StObject {
  
  /**
    * Gets information about an export of a codespace.
    *
    * You must authenticate using a personal access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  var get: ParametersPathExportid
}
object GetParametersPathExportid {
  
  inline def apply(get: ParametersPathExportid): GetParametersPathExportid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathExportid]
  }
  
  extension [Self <: GetParametersPathExportid](x: Self) {
    
    inline def setGet(value: ParametersPathExportid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
