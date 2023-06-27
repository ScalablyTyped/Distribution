package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters429 extends StObject {
  
  /**
    * Get repository clones
    * @description Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday.
    */
  var get: Parameters429
}
object GetParameters429 {
  
  inline def apply(get: Parameters429): GetParameters429 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters429]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters429] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters429): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
