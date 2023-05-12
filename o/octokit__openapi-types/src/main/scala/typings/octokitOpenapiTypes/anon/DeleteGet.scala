package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGet extends StObject {
  
  /** Delete a gist */
  var delete: Responses304403404
  
  /** Get a gist */
  var get: ParametersPathGistid
  
  /**
    * Update a gist
    * @description Allows you to update a gist's description and to update, delete, or rename gist files. Files from the previous version of the gist that aren't explicitly changed during an edit are unchanged.
    */
  var patch: RequestBodyContent21
}
object DeleteGet {
  
  inline def apply(delete: Responses304403404, get: ParametersPathGistid, patch: RequestBodyContent21): DeleteGet = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteGet] (val x: Self) extends AnyVal {
    
    inline def setDelete(value: Responses304403404): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: ParametersPathGistid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: RequestBodyContent21): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
