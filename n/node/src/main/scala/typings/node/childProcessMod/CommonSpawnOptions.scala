package typings.node.childProcessMod

import typings.node.eventsMod.Abortable
import typings.node.nodeColonstreamMod.Stream
import typings.node.nodeStrings.ipc
import typings.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.node.childProcessMod.MessagingOptions because var conflicts: timeout. Inlined serialization, killSignal */ trait CommonSpawnOptions
  extends StObject
     with CommonOptions
     with Abortable {
  
  var argv0: js.UndefOr[String] = js.undefined
  
  /**
    * The signal value to be used when the spawned process will be killed by the abort signal.
    * @default 'SIGTERM'
    */
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  
  /**
    * Specify the kind of serialization used for sending messages between processes.
    * @default 'json'
    */
  var serialization: js.UndefOr[SerializationType] = js.undefined
  
  var shell: js.UndefOr[Boolean | String] = js.undefined
  
  var stdio: js.UndefOr[StdioOptions] = js.undefined
  
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}
object CommonSpawnOptions {
  
  inline def apply(): CommonSpawnOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonSpawnOptions]
  }
  
  extension [Self <: CommonSpawnOptions](x: Self) {
    
    inline def setArgv0(value: String): Self = StObject.set(x, "argv0", value.asInstanceOf[js.Any])
    
    inline def setArgv0Undefined: Self = StObject.set(x, "argv0", js.undefined)
    
    inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    inline def setSerialization(value: SerializationType): Self = StObject.set(x, "serialization", value.asInstanceOf[js.Any])
    
    inline def setSerializationUndefined: Self = StObject.set(x, "serialization", js.undefined)
    
    inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    inline def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    inline def setStdioVarargs(value: (js.UndefOr[IOType | ipc | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value*))
    
    inline def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
    
    inline def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
  }
}
