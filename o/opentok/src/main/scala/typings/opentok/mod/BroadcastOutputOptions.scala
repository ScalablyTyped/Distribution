package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BroadcastOutputOptions extends StObject {
  
  var hls: js.UndefOr[js.Object] = js.native
  
  var rtmp: js.UndefOr[js.Array[BroadcastOutputOptionsRtmp]] = js.native
}
object BroadcastOutputOptions {
  
  @scala.inline
  def apply(): BroadcastOutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BroadcastOutputOptions]
  }
  
  @scala.inline
  implicit class BroadcastOutputOptionsMutableBuilder[Self <: BroadcastOutputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHls(value: js.Object): Self = StObject.set(x, "hls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHlsUndefined: Self = StObject.set(x, "hls", js.undefined)
    
    @scala.inline
    def setRtmp(value: js.Array[BroadcastOutputOptionsRtmp]): Self = StObject.set(x, "rtmp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRtmpUndefined: Self = StObject.set(x, "rtmp", js.undefined)
    
    @scala.inline
    def setRtmpVarargs(value: BroadcastOutputOptionsRtmp*): Self = StObject.set(x, "rtmp", js.Array(value :_*))
  }
}
