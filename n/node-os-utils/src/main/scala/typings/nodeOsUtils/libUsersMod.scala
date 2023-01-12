package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUsersMod {
  
  @JSImport("node-os-utils/lib/users", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Users {
    
    /* CompleteClass */
    override def openedCount(): js.Promise[Double | String] = js.native
  }
  
  trait Users extends StObject {
    
    def openedCount(): js.Promise[Double | String]
  }
  object Users {
    
    inline def apply(openedCount: () => js.Promise[Double | String]): Users = {
      val __obj = js.Dynamic.literal(openedCount = js.Any.fromFunction0(openedCount))
      __obj.asInstanceOf[Users]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Users] (val x: Self) extends AnyVal {
      
      inline def setOpenedCount(value: () => js.Promise[Double | String]): Self = StObject.set(x, "openedCount", js.Any.fromFunction0(value))
    }
  }
}
