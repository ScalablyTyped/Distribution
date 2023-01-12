package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BroadcastUrlsResponse extends StObject {
  
  var hls: js.UndefOr[String] = js.undefined
  
  var rtmp: js.UndefOr[js.Array[BroadcastOutputOptionsRtmp]] = js.undefined
}
object BroadcastUrlsResponse {
  
  inline def apply(): BroadcastUrlsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastUrlsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BroadcastUrlsResponse] (val x: Self) extends AnyVal {
    
    inline def setHls(value: String): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    inline def setHlsUndefined: Self = StObject.set(x, "hls", js.undefined)
    
    inline def setRtmp(value: js.Array[BroadcastOutputOptionsRtmp]): Self = StObject.set(x, "rtmp", value.asInstanceOf[js.Any])
    
    inline def setRtmpUndefined: Self = StObject.set(x, "rtmp", js.undefined)
    
    inline def setRtmpVarargs(value: BroadcastOutputOptionsRtmp*): Self = StObject.set(x, "rtmp", js.Array(value*))
  }
}
