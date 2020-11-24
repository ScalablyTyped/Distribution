package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerStreamResponseOptions extends js.Object {
  
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
  implicit class ServerStreamResponseOptionsOps[Self <: ServerStreamResponseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndStream(value: Boolean): Self = this.set("endStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndStream: Self = this.set("endStream", js.undefined)
    
    @scala.inline
    def setWaitForTrailers(value: Boolean): Self = this.set("waitForTrailers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForTrailers: Self = this.set("waitForTrailers", js.undefined)
  }
}
