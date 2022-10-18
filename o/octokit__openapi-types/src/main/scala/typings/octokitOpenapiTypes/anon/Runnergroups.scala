package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runnergroups extends StObject {
  
  var runner_groups: js.Array[Allowspublicrepositories]
  
  var total_count: Double
}
object Runnergroups {
  
  inline def apply(runner_groups: js.Array[Allowspublicrepositories], total_count: Double): Runnergroups = {
    val __obj = js.Dynamic.literal(runner_groups = runner_groups.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runnergroups]
  }
  
  extension [Self <: Runnergroups](x: Self) {
    
    inline def setRunner_groups(value: js.Array[Allowspublicrepositories]): Self = StObject.set(x, "runner_groups", value.asInstanceOf[js.Any])
    
    inline def setRunner_groupsVarargs(value: Allowspublicrepositories*): Self = StObject.set(x, "runner_groups", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
