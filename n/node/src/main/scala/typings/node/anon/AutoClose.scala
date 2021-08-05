package typings.node.anon

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoClose extends StObject {
  
  var autoClose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @default false
    */
  var emitClose: js.UndefOr[Boolean] = js.undefined
  
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  
  var end: js.UndefOr[Double] = js.undefined
  
  var fd: js.UndefOr[Double] = js.undefined
  
  var flags: js.UndefOr[String] = js.undefined
  
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[Double] = js.undefined
  
  var start: js.UndefOr[Double] = js.undefined
}
object AutoClose {
  
  inline def apply(): AutoClose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoClose]
  }
  
  extension [Self <: AutoClose](x: Self) {
    
    inline def setAutoClose(value: Boolean): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
    
    inline def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
    
    inline def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
    
    inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
    
    inline def setFdUndefined: Self = StObject.set(x, "fd", js.undefined)
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
