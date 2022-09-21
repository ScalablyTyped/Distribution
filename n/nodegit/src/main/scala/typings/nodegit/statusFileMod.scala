package typings.nodegit

import typings.nodegit.diffDeltaMod.DiffDelta
import typings.nodegit.statusFileOptionsMod.StatusFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusFileMod {
  
  @JSImport("nodegit/status-file", "StatusFile")
  @js.native
  open class StatusFile protected () extends StObject {
    def this(args: StatusFileOptions) = this()
    
    def headToIndex(): DiffDelta = js.native
    
    def inIndex(): Boolean = js.native
    
    def inWorkingTree(): Boolean = js.native
    
    def indexToWorkdir(): DiffDelta = js.native
    
    def isConflicted(): Boolean = js.native
    
    def isDeleted(): Boolean = js.native
    
    def isIgnored(): Boolean = js.native
    
    def isModified(): Boolean = js.native
    
    def isNew(): Boolean = js.native
    
    def isRenamed(): Boolean = js.native
    
    def isTypechange(): Boolean = js.native
    
    def path(): String = js.native
    
    def status(): js.Array[String] = js.native
    
    def statusBit(): Double = js.native
  }
}
