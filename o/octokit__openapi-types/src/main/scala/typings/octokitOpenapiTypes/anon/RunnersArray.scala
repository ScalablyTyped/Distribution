package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunnersArray extends StObject {
  
  /** @description List of runner IDs to add to the runner group. */
  var runners: js.Array[Double]
}
object RunnersArray {
  
  inline def apply(runners: js.Array[Double]): RunnersArray = {
    val __obj = js.Dynamic.literal(runners = runners.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnersArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunnersArray] (val x: Self) extends AnyVal {
    
    inline def setRunners(value: js.Array[Double]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    inline def setRunnersVarargs(value: Double*): Self = StObject.set(x, "runners", js.Array(value*))
  }
}
