package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runners extends StObject {
  
  var runners: js.Array[Os]
  
  var total_count: Double
}
object Runners {
  
  inline def apply(runners: js.Array[Os], total_count: Double): Runners = {
    val __obj = js.Dynamic.literal(runners = runners.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runners]
  }
  
  extension [Self <: Runners](x: Self) {
    
    inline def setRunners(value: js.Array[Os]): Self = StObject.set(x, "runners", value.asInstanceOf[js.Any])
    
    inline def setRunnersVarargs(value: Os*): Self = StObject.set(x, "runners", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
