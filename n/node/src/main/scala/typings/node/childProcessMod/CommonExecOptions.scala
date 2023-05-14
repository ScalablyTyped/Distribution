package typings.node.childProcessMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.bufferMod.global.BufferEncoding
import typings.node.nodeColonstreamMod.Stream
import typings.node.nodeStrings.buffer_
import typings.node.nodeStrings.ipc
import typings.node.processMod.global.NodeJS.Signals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonExecOptions
  extends StObject
     with CommonOptions {
  
  var encoding: js.UndefOr[BufferEncoding | buffer_ | Null] = js.undefined
  
  var input: js.UndefOr[String | ArrayBufferView] = js.undefined
  
  var killSignal: js.UndefOr[Signals | Double] = js.undefined
  
  var maxBuffer: js.UndefOr[Double] = js.undefined
  
  /**
    * Can be set to 'pipe', 'inherit, or 'ignore', or an array of these strings.
    * If passed as an array, the first element is used for `stdin`, the second for
    * `stdout`, and the third for `stderr`. A fourth element can be used to
    * specify the `stdio` behavior beyond the standard streams. See
    * {@link ChildProcess.stdio} for more information.
    *
    * @default 'pipe'
    */
  var stdio: js.UndefOr[StdioOptions] = js.undefined
}
object CommonExecOptions {
  
  inline def apply(): CommonExecOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonExecOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonExecOptions] (val x: Self) extends AnyVal {
    
    inline def setEncoding(value: BufferEncoding | buffer_): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingNull: Self = StObject.set(x, "encoding", null)
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setInput(value: String | ArrayBufferView): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setKillSignal(value: Signals | Double): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    inline def setMaxBuffer(value: Double): Self = StObject.set(x, "maxBuffer", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferUndefined: Self = StObject.set(x, "maxBuffer", js.undefined)
    
    inline def setStdio(value: StdioOptions): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
    
    inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
    
    inline def setStdioVarargs(value: (js.UndefOr[IOType | ipc | Stream | Double | Null])*): Self = StObject.set(x, "stdio", js.Array(value*))
  }
}
