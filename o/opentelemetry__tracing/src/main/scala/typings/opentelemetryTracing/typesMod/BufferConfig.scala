package typings.opentelemetryTracing.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BufferConfig extends js.Object {
  
  /** Maximum size of a buffer. */
  var bufferSize: js.UndefOr[Double] = js.native
  
  /** Max time for a buffer can wait before being sent */
  var bufferTimeout: js.UndefOr[Double] = js.native
}
object BufferConfig {
  
  @scala.inline
  def apply(): BufferConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BufferConfig]
  }
  
  @scala.inline
  implicit class BufferConfigOps[Self <: BufferConfig] (val x: Self) extends AnyVal {
    
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
    def setBufferSize(value: Double): Self = this.set("bufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferSize: Self = this.set("bufferSize", js.undefined)
    
    @scala.inline
    def setBufferTimeout(value: Double): Self = this.set("bufferTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferTimeout: Self = this.set("bufferTimeout", js.undefined)
  }
}
