package typings.node.childProcessMod

import typings.node.nodeColonstreamMod.Stream
import typings.node.nodeStrings.ipc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForkOptions
  extends StObject
     with ProcessEnvOptions
     with MessagingOptions {
  
  var detached: js.UndefOr[Boolean] = js.undefined
  
  var execArgv: js.UndefOr[js.Array[String]] = js.undefined
  
  var execPath: js.UndefOr[String] = js.undefined
  
  var silent: js.UndefOr[Boolean] = js.undefined
  
  var stdio: js.UndefOr[StdioOptions] = js.undefined
  
  var windowsVerbatimArguments: js.UndefOr[Boolean] = js.undefined
}
object ForkOptions {
  
  inline def apply(): ForkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForkOptions]
  }
  
  extension [Self <: ForkOptions](x: Self) {
    
    inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    inline def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
    
    inline def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
    
    inline def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value*))
    
    inline def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
    
    inline def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    inline def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    inline def setStdioVarargs(value: (js.UndefOr[IOType | ipc | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value*))
    
    inline def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
    
    inline def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
  }
}
