package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParameters27 extends StObject {
  
  /** We delay the public events feed by five minutes, which means the most recent event returned by the public events API actually occurred at least five minutes ago. */
  var get: Parameters27
}
object GetParameters27 {
  
  inline def apply(get: Parameters27): GetParameters27 = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameters27]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParameters27] (val x: Self) extends AnyVal {
    
    inline def setGet(value: Parameters27): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
