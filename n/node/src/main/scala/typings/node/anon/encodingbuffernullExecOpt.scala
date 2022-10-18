package typings.node.anon

import typings.node.AbortSignal
import typings.node.nodeColonurlMod.URL
import typings.node.nodeStrings.buffer_
import typings.node.processMod.global.NodeJS.ProcessEnv
import typings.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  encoding :'buffer' | null} & node.child_process.ExecOptions */
trait encodingbuffernullExecOpt extends StObject {
  
  var cwd: js.UndefOr[String | URL] = js.undefined
  
  var encoding: buffer_ | Null
  
  var env: js.UndefOr[ProcessEnv] = js.undefined
  
  var gid: js.UndefOr[Double] = js.undefined
  
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  
  var maxBuffer: js.UndefOr[Double] = js.undefined
  
  var shell: js.UndefOr[String] = js.undefined
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * @default 0
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  var uid: js.UndefOr[Double] = js.undefined
  
  /**
    * @default true
    */
  var windowsHide: js.UndefOr[Boolean] = js.undefined
}
object encodingbuffernullExecOpt {
  
  inline def apply(): encodingbuffernullExecOpt = {
    val __obj = js.Dynamic.literal(encoding = null)
    __obj.asInstanceOf[encodingbuffernullExecOpt]
  }
  
  extension [Self <: encodingbuffernullExecOpt](x: Self) {
    
    inline def setCwd(value: String | URL): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setEncoding(value: buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEnv(value: ProcessEnv): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    
    inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
    
    inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    
    inline def setShellUndefined: Self = StObject.set(x, "shell", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
    
    inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
  }
}
