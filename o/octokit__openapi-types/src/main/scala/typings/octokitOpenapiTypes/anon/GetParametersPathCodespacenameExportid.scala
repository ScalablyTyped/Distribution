package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathCodespacenameExportid extends StObject {
  
  /**
    * Gets information about an export of a codespace.
    *
    * You must authenticate using a personal access token with the `codespace` scope to use this endpoint.
    *
    * GitHub Apps must have read access to the `codespaces_lifecycle_admin` repository permission to use this endpoint.
    */
  var get: ParametersPathCodespacenameExportid
}
object GetParametersPathCodespacenameExportid {
  
  inline def apply(get: ParametersPathCodespacenameExportid): GetParametersPathCodespacenameExportid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathCodespacenameExportid]
  }
  
  extension [Self <: GetParametersPathCodespacenameExportid](x: Self) {
    
    inline def setGet(value: ParametersPathCodespacenameExportid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
