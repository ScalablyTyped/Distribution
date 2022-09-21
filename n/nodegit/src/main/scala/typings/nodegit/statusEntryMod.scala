package typings.nodegit

import typings.nodegit.diffDeltaMod.DiffDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statusEntryMod {
  
  @JSImport("nodegit/status-entry", "StatusEntry")
  @js.native
  open class StatusEntry () extends StObject {
    
    def headToIndex(): DiffDelta = js.native
    
    def indexToWorkdir(): DiffDelta = js.native
    
    def status(): Double = js.native
  }
}
