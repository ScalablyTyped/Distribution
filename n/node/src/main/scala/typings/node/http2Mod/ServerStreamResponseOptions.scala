package typings.node.http2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerStreamResponseOptions extends StObject {
  
  var endStream: js.UndefOr[Boolean] = js.native
  
  var waitForTrailers: js.UndefOr[Boolean] = js.native
}
object ServerStreamResponseOptions {
  
  @scala.inline
  def apply(): ServerStreamResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerStreamResponseOptions]
  }
  
  @scala.inline
  implicit class ServerStreamResponseOptionsMutableBuilder[Self <: ServerStreamResponseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndStream(value: Boolean): Self = StObject.set(x, "endStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndStreamUndefined: Self = StObject.set(x, "endStream", js.undefined)
    
    @scala.inline
    def setWaitForTrailers(value: Boolean): Self = StObject.set(x, "waitForTrailers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForTrailersUndefined: Self = StObject.set(x, "waitForTrailers", js.undefined)
  }
}
