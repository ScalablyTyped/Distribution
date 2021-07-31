package typings.mockFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object symlinkMod {
  
  @JSImport("mock-fs/lib/symlink", JSImport.Namespace)
  @js.native
  class ^ () extends SymbolicLink
  
  @js.native
  trait SymbolicLink
    extends typings.mockFs.itemMod.^ {
    
    /** Get the path (relative) to the source. */
    def getPath(): String = js.native
    
    /** Sets the path (relative) to the source. */
    def setPath(pathname: String): Unit = js.native
  }
}
