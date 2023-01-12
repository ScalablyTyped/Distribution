package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressTaskProgressStatusMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/progress/TaskProgressStatus", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TaskProgressStatus {
    
    /* CompleteClass */
    var completedWork: Double = js.native
    
    /* CompleteClass */
    var indeterminate: Boolean = js.native
    
    /* CompleteClass */
    var index: Double = js.native
    
    /* CompleteClass */
    var startTime: js.Date = js.native
    
    /* CompleteClass */
    var taskName: String = js.native
    
    /* CompleteClass */
    var totalWork: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/progress/TaskProgressStatus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait TaskProgressStatus extends StObject {
    
    var completedWork: Double
    
    var indeterminate: Boolean
    
    var index: Double
    
    var startTime: js.Date
    
    var taskName: String
    
    var totalWork: Double
  }
  object TaskProgressStatus {
    
    inline def apply(
      completedWork: Double,
      indeterminate: Boolean,
      index: Double,
      startTime: js.Date,
      taskName: String,
      totalWork: Double
    ): TaskProgressStatus = {
      val __obj = js.Dynamic.literal(completedWork = completedWork.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], taskName = taskName.asInstanceOf[js.Any], totalWork = totalWork.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskProgressStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TaskProgressStatus] (val x: Self) extends AnyVal {
      
      inline def setCompletedWork(value: Double): Self = StObject.set(x, "completedWork", value.asInstanceOf[js.Any])
      
      inline def setIndeterminate(value: Boolean): Self = StObject.set(x, "indeterminate", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setTaskName(value: String): Self = StObject.set(x, "taskName", value.asInstanceOf[js.Any])
      
      inline def setTotalWork(value: Double): Self = StObject.set(x, "totalWork", value.asInstanceOf[js.Any])
    }
  }
}
