package typings.node.childProcessMod

import typings.node.nodeStrings.ignore
import typings.node.nodeStrings.inherit
import typings.node.nodeStrings.ipc
import typings.node.nodeStrings.pipe
import typings.node.streamMod.Stream
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
  
  @scala.inline
  def apply(): ForkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForkOptions]
  }
  
  @scala.inline
  implicit class ForkOptionsMutableBuilder[Self <: ForkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
    
    @scala.inline
    def setExecArgv(value: js.Array[String]): Self = StObject.set(x, "execArgv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecArgvUndefined: Self = StObject.set(x, "execArgv", js.undefined)
    
    @scala.inline
    def setExecArgvVarargs(value: String*): Self = StObject.set(x, "execArgv", js.Array(value :_*))
    
    @scala.inline
    def setExecPath(value: String): Self = StObject.set(x, "execPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecPathUndefined: Self = StObject.set(x, "execPath", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    @scala.inline
    def setStdioVarargs(value: (js.UndefOr[pipe | ipc | ignore | inherit | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value :_*))
    
    @scala.inline
    def setWindowsVerbatimArguments(value: Boolean): Self = StObject.set(x, "windowsVerbatimArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowsVerbatimArgumentsUndefined: Self = StObject.set(x, "windowsVerbatimArguments", js.undefined)
  }
}
