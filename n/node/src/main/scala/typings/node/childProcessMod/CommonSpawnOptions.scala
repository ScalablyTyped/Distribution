package typings.node.childProcessMod

import typings.node.nodeStrings.ignore
import typings.node.nodeStrings.inherit
import typings.node.nodeStrings.ipc
import typings.node.nodeStrings.pipe
import typings.node.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonSpawnOptions
  extends StObject
     with CommonOptions
     with MessagingOptions {
  
  var argv0: js.UndefOr[String] = js.undefined
  
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
    
    inline def setShell(value: Boolean | String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    inline def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    inline def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
    
    inline def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
    
    inline def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
  }
}
