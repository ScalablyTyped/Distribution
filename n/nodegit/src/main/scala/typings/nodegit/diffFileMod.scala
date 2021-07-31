package typings.nodegit

import typings.nodegit.oidMod.Oid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffFileMod {
  
  @JSImport("nodegit/diff-file", "DiffFile")
  @js.native
  class DiffFile () extends StObject {
    
    /**
      * Returns the file's flags
      */
    def flags(): Double = js.native
    
    /**
      * Returns the file's Oid
      */
    def id(): Oid = js.native
    
    /**
      * Returns the file's mode
      */
    def mode(): Double = js.native
    
    /**
      * Returns the file's path
      */
    def path(): String = js.native
    
    /**
      * Returns the file's size
      */
    def size(): Double = js.native
  }
}
