package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters328 extends StObject {
  
  /**
    * List issue events
    * @description Lists all events for an issue.
    */
  var get: Parameters328
}
object GetParameters328 {
  
  inline def apply(get: Parameters328): GetParameters328 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters328]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters328] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters328): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
