package typings.nodeResque

import typings.nodeResque.mod.Job
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Args extends StObject {
    
    var args: js.Array[js.Any]
    
    var `class`: String
    
    var queue: String
  }
  object Args {
    
    inline def apply(args: js.Array[js.Any], `class`: String, queue: String): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setArgs(value: js.Array[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  trait RTimestamp extends StObject {
    
    var rTimestamp: Double
    
    var tasks: js.Array[Job[js.Any]]
  }
  object RTimestamp {
    
    inline def apply(rTimestamp: Double, tasks: js.Array[Job[js.Any]]): RTimestamp = {
      val __obj = js.Dynamic.literal(rTimestamp = rTimestamp.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTimestamp]
    }
    
    extension [Self <: RTimestamp](x: Self) {
      
      inline def setRTimestamp(value: Double): Self = StObject.set(x, "rTimestamp", value.asInstanceOf[js.Any])
      
      inline def setTasks(value: js.Array[Job[js.Any]]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksVarargs(value: Job[js.Any]*): Self = StObject.set(x, "tasks", js.Array(value :_*))
    }
  }
}
