package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libOpenfilesMod {
  
  @JSImport("node-os-utils/lib/openfiles", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with OpenFiles {
    
    /* CompleteClass */
    override def openFd(): js.Promise[Double] = js.native
  }
  
  trait OpenFiles extends StObject {
    
    def openFd(): js.Promise[Double]
  }
  object OpenFiles {
    
    inline def apply(openFd: () => js.Promise[Double]): OpenFiles = {
      val __obj = js.Dynamic.literal(openFd = js.Any.fromFunction0(openFd))
      __obj.asInstanceOf[OpenFiles]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenFiles] (val x: Self) extends AnyVal {
      
      inline def setOpenFd(value: () => js.Promise[Double]): Self = StObject.set(x, "openFd", js.Any.fromFunction0(value))
    }
  }
}
