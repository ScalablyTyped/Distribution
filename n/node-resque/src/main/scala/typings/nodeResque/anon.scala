package typings.nodeResque

import typings.nodeResque.mod.Job
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Args extends StObject {
    
    var args: js.Array[_] = js.native
    
    var `class`: String = js.native
    
    var queue: String = js.native
  }
  object Args {
    
    @scala.inline
    def apply(args: js.Array[_], `class`: String, queue: String): Args = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit class ArgsMutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RTimestamp extends StObject {
    
    var rTimestamp: Double = js.native
    
    var tasks: js.Array[Job[_]] = js.native
  }
  object RTimestamp {
    
    @scala.inline
    def apply(rTimestamp: Double, tasks: js.Array[Job[_]]): RTimestamp = {
      val __obj = js.Dynamic.literal(rTimestamp = rTimestamp.asInstanceOf[js.Any], tasks = tasks.asInstanceOf[js.Any])
      __obj.asInstanceOf[RTimestamp]
    }
    
    @scala.inline
    implicit class RTimestampMutableBuilder[Self <: RTimestamp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRTimestamp(value: Double): Self = StObject.set(x, "rTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasks(value: js.Array[Job[_]]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTasksVarargs(value: Job[js.Any]*): Self = StObject.set(x, "tasks", js.Array(value :_*))
    }
  }
}
