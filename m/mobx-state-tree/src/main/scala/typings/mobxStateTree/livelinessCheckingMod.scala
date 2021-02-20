package typings.mobxStateTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object livelinessCheckingMod {
  
  @JSImport("mobx-state-tree/dist/core/node/livelinessChecking", "getLivelinessChecking")
  @js.native
  def getLivelinessChecking(): LivelinessMode = js.native
  
  @JSImport("mobx-state-tree/dist/core/node/livelinessChecking", "setLivelinessChecking")
  @js.native
  def setLivelinessChecking(mode: LivelinessMode): Unit = js.native
  
  @JSImport("mobx-state-tree/dist/core/node/livelinessChecking", "setLivelynessChecking")
  @js.native
  def setLivelynessChecking(mode: LivelinessMode): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobxStateTree.mobxStateTreeStrings.warn
    - typings.mobxStateTree.mobxStateTreeStrings.error
    - typings.mobxStateTree.mobxStateTreeStrings.ignore
  */
  trait LivelinessMode extends StObject
  object LivelinessMode {
    
    @scala.inline
    def error: typings.mobxStateTree.mobxStateTreeStrings.error = "error".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.error]
    
    @scala.inline
    def ignore: typings.mobxStateTree.mobxStateTreeStrings.ignore = "ignore".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.ignore]
    
    @scala.inline
    def warn: typings.mobxStateTree.mobxStateTreeStrings.warn = "warn".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.warn]
  }
  
  type LivelynessMode = LivelinessMode
}
