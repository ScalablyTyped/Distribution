package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersPathEventid extends StObject {
  
  /**
    * Get an issue event
    * @description Gets a single event by the event id.
    */
  var get: ParametersPathEventid
}
object GetParametersPathEventid {
  
  inline def apply(get: ParametersPathEventid): GetParametersPathEventid = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersPathEventid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersPathEventid] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersPathEventid): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
