package typings.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressTaskProgressStatusArrayMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/progress/TaskProgressStatusArray", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with TaskProgressStatusArray {
    
    /* CompleteClass */
    override def item(index: Double): TaskProgressStatus = js.native
    
    /* CompleteClass */
    var length: Double = js.native
  }
  @JSImport("@nginstack/engine/lib/progress/TaskProgressStatusArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type TaskProgressStatus = typings.nginstackEngine.libProgressTaskProgressStatusMod.^
  
  trait TaskProgressStatusArray extends StObject {
    
    def item(index: Double): TaskProgressStatus
    
    var length: Double
  }
  object TaskProgressStatusArray {
    
    inline def apply(item: Double => TaskProgressStatus, length: Double): TaskProgressStatusArray = {
      val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[TaskProgressStatusArray]
    }
    
    extension [Self <: TaskProgressStatusArray](x: Self) {
      
      inline def setItem(value: Double => TaskProgressStatus): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
}
