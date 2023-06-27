package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters494 extends StObject {
  
  /**
    * List repositories starred by a user
    * @description Lists repositories a user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  var get: Parameters494
}
object GetParameters494 {
  
  inline def apply(get: Parameters494): GetParameters494 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters494]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters494] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters494): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
