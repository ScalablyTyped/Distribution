package typings.nodegit

import typings.nodegit.diffFileMod.DiffFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffDeltaMod {
  
  @JSImport("nodegit/diff-delta", "DiffDelta")
  @js.native
  open class DiffDelta () extends StObject {
    
    def flags(): Double = js.native
    
    def newFile(): DiffFile = js.native
    
    def nfiles(): Double = js.native
    
    def oldFile(): DiffFile = js.native
    
    def similarity(): Double = js.native
    
    def status(): Double = js.native
  }
}
