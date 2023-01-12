package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastOutputOptions extends StObject {
  
  var hls: js.UndefOr[js.Object] = js.undefined
  
  var rtmp: js.UndefOr[js.Array[BroadcastOutputOptionsRtmp]] = js.undefined
}
object BroadcastOutputOptions {
  
  inline def apply(): BroadcastOutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastOutputOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BroadcastOutputOptions] (val x: Self) extends AnyVal {
    
    inline def setHls(value: js.Object): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    inline def setHlsUndefined: Self = StObject.set(x, "hls", js.undefined)
    
    inline def setRtmp(value: js.Array[BroadcastOutputOptionsRtmp]): Self = StObject.set(x, "rtmp", value.asInstanceOf[js.Any])
    
    inline def setRtmpUndefined: Self = StObject.set(x, "rtmp", js.undefined)
    
    inline def setRtmpVarargs(value: BroadcastOutputOptionsRtmp*): Self = StObject.set(x, "rtmp", js.Array(value*))
  }
}
