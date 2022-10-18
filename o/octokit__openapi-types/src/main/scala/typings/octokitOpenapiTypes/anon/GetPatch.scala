package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPatch extends StObject {
  
  var delete: Responses275
  
  var get: ParametersPath273
  
  /** Allows you to update or delete a gist file and rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged. */
  var patch: Responses200274404
}
object GetPatch {
  
  inline def apply(delete: Responses275, get: ParametersPath273, patch: Responses200274404): GetPatch = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPatch]
  }
  
  extension [Self <: GetPatch](x: Self) {
    
    inline def setDelete(value: Responses275): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPath273): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses200274404): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
