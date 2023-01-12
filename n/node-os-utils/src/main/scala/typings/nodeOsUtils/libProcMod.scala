package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcMod {
  
  @JSImport("node-os-utils/lib/proc", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Proc {
    
    /* CompleteClass */
    override def totalProcesses(): js.Promise[Double | String] = js.native
    
    /* CompleteClass */
    override def zombieProcesses(): js.Promise[Double | String] = js.native
  }
  
  trait Proc extends StObject {
    
    def totalProcesses(): js.Promise[Double | String]
    
    def zombieProcesses(): js.Promise[Double | String]
  }
  object Proc {
    
    inline def apply(
      totalProcesses: () => js.Promise[Double | String],
      zombieProcesses: () => js.Promise[Double | String]
    ): Proc = {
      val __obj = js.Dynamic.literal(totalProcesses = js.Any.fromFunction0(totalProcesses), zombieProcesses = js.Any.fromFunction0(zombieProcesses))
      __obj.asInstanceOf[Proc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Proc] (val x: Self) extends AnyVal {
      
      inline def setTotalProcesses(value: () => js.Promise[Double | String]): Self = StObject.set(x, "totalProcesses", js.Any.fromFunction0(value))
      
      inline def setZombieProcesses(value: () => js.Promise[Double | String]): Self = StObject.set(x, "zombieProcesses", js.Any.fromFunction0(value))
    }
  }
}
