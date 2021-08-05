package typings.node.childProcessMod

import typings.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecFileOptions
  extends StObject
     with CommonOptions {
  
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  
  var maxBuffer: js.UndefOr[Double] = js.undefined
  
  var shell: js.UndefOr[Boolean | String] = js.undefined
  
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}
object ExecFileOptions {
  
  inline def apply(): ExecFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecFileOptions]
  }
  
  extension [Self <: ExecFileOptions](x: Self) {
    
    inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
    
    inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    inline def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
    
    inline def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
  }
}
