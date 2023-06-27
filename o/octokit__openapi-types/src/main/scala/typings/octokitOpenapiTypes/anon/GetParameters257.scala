package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters257 extends StObject {
  
  /**
    * Get the combined status for a specific reference
    * @description Users with pull access in a repository can access a combined view of commit statuses for a given ref. The ref can be a SHA, a branch name, or a tag name.
    *
    *
    * Additionally, a combined `state` is returned. The `state` is one of:
    *
    * *   **failure** if any of the contexts report as `error` or `failure`
    * *   **pending** if there are no statuses or a context is `pending`
    * *   **success** if the latest status for all contexts is `success`
    */
  var get: Parameters257
}
object GetParameters257 {
  
  inline def apply(get: Parameters257): GetParameters257 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters257]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters257] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters257): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
