package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersQueryPer extends StObject {
  
  /** Get the total number of clones and breakdown per day or week for the last 14 days. Timestamps are aligned to UTC midnight of the beginning of the day or week. Week begins on Monday. */
  var get: ParametersQueryPer
}
object GetParametersQueryPer {
  
  inline def apply(get: ParametersQueryPer): GetParametersQueryPer = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersQueryPer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersQueryPer] (val x: Self) extends AnyVal {
    
    inline def setGet(value: ParametersQueryPer): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
  }
}
