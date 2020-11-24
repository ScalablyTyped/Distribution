package typings.mysql2.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamOptions extends js.Object {
  
  /**
    * Sets the max buffer size in objects of a stream
    */
  var highWaterMark: js.UndefOr[Double] = js.native
  
  /**
    * The object mode of the stream (Default: true)
    */
  var objectMode: js.UndefOr[js.Any] = js.native
}
object StreamOptions {
  
  @scala.inline
  def apply(): StreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamOptions]
  }
  
  @scala.inline
  implicit class StreamOptionsOps[Self <: StreamOptions] (val x: Self) extends AnyVal {
    
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
    def setHighWaterMark(value: Double): Self = this.set("highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighWaterMark: Self = this.set("highWaterMark", js.undefined)
    
    @scala.inline
    def setObjectMode(value: js.Any): Self = this.set("objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectMode: Self = this.set("objectMode", js.undefined)
  }
}
