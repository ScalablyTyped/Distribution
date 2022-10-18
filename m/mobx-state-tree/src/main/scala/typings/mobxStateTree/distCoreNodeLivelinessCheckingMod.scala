package typings.mobxStateTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreNodeLivelinessCheckingMod {
  
  @JSImport("mobx-state-tree/dist/core/node/livelinessChecking", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getLivelinessChecking(): LivelinessMode = ^.asInstanceOf[js.Dynamic].applyDynamic("getLivelinessChecking")().asInstanceOf[LivelinessMode]
  
  inline def setLivelinessChecking(mode: LivelinessMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLivelinessChecking")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setLivelynessChecking(mode: LivelinessMode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLivelynessChecking")(mode.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobxStateTree.mobxStateTreeStrings.warn
    - typings.mobxStateTree.mobxStateTreeStrings.error
    - typings.mobxStateTree.mobxStateTreeStrings.ignore
  */
  trait LivelinessMode extends StObject
  object LivelinessMode {
    
    inline def error: typings.mobxStateTree.mobxStateTreeStrings.error = "error".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.error]
    
    inline def ignore: typings.mobxStateTree.mobxStateTreeStrings.ignore = "ignore".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.ignore]
    
    inline def warn: typings.mobxStateTree.mobxStateTreeStrings.warn = "warn".asInstanceOf[typings.mobxStateTree.mobxStateTreeStrings.warn]
  }
  
  type LivelynessMode = LivelinessMode
}
