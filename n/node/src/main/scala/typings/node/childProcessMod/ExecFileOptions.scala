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
  
  @scala.inline
  def apply(): ExecFileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecFileOptions]
  }
  
  @scala.inline
  implicit class ExecFileOptionsMutableBuilder[Self <: ExecFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    @scala.inline
    def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
    
    @scala.inline
    def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    @scala.inline
    def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
  }
}
