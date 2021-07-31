package typings.nodegit

import typings.nodegit.diffLineMod.DiffLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convenientHunkMod {
  
  @JSImport("nodegit/convenient-hunk", "ConvenientHunk")
  @js.native
  class ConvenientHunk () extends StObject {
    
    /**
      * Diff header string that represents the context of this hunk
      * of the diff. Something like `@@ -169,14 +167,12 @@ ...`
      */
    def header(): String = js.native
    
    /**
      * The length of the header
      */
    def headerLen(): Double = js.native
    
    /**
      * The lines in this hunk
      */
    def lines(): js.Promise[js.Array[DiffLine]] = js.native
    
    /**
      * The number of new lines in the hunk
      */
    def newLines(): Double = js.native
    
    /**
      * The starting offset of the first new line in the file
      */
    def newStart(): Double = js.native
    
    /**
      * The number of old lines in the hunk
      */
    def oldLines(): Double = js.native
    
    /**
      * The starting offset of the first old line in the file
      */
    def oldStart(): Double = js.native
    
    /**
      * Number of lines in this hunk
      */
    def size(): Double = js.native
  }
}
