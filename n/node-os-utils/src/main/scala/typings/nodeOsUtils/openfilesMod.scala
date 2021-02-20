package typings.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openfilesMod {
  
  @JSImport("node-os-utils/lib/openfiles", JSImport.Default)
  @js.native
  class default () extends OpenFiles
  
  @js.native
  trait OpenFiles extends StObject {
    
    def openFd(): js.Promise[Double] = js.native
  }
  object OpenFiles {
    
    @scala.inline
    def apply(openFd: () => js.Promise[Double]): OpenFiles = {
      val __obj = js.Dynamic.literal(openFd = js.Any.fromFunction0(openFd))
      __obj.asInstanceOf[OpenFiles]
    }
    
    @scala.inline
    implicit class OpenFilesMutableBuilder[Self <: OpenFiles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpenFd(value: () => js.Promise[Double]): Self = StObject.set(x, "openFd", js.Any.fromFunction0(value))
    }
  }
}
