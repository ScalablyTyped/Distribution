package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters480 extends StObject {
  
  /**
    * List repositories starred by the authenticated user
    * @description Lists repositories the authenticated user has starred.
    *
    * You can also find out _when_ stars were created by passing the following custom [media type](https://docs.github.com/rest/overview/media-types/) via the `Accept` header: `application/vnd.github.star+json`.
    */
  var get: Parameters480
}
object GetParameters480 {
  
  inline def apply(get: Parameters480): GetParameters480 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters480]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters480] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters480): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
