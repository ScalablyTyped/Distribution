package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathThreadid extends StObject {
  
  /**
    * Get a thread
    * @description Gets information about a notification thread.
    */
  var get: ParametersPathThreadid
  
  /**
    * Mark a thread as read
    * @description Marks a thread as "read." Marking a thread as "read" is equivalent to clicking a notification in your notification inbox on GitHub: https://github.com/notifications.
    */
  var patch: Responses48
}
object GetParametersPathThreadid {
  
  inline def apply(get: ParametersPathThreadid, patch: Responses48): GetParametersPathThreadid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathThreadid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathThreadid] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathThreadid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: Responses48): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
  }
}
