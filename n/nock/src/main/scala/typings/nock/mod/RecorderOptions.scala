package typings.nock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecorderOptions extends js.Object {
  
  var dont_print: js.UndefOr[Boolean] = js.native
  
  var enable_reqheaders_recording: js.UndefOr[Boolean] = js.native
  
  var logging: js.UndefOr[js.Function1[/* content */ String, Unit]] = js.native
  
  var output_objects: js.UndefOr[Boolean] = js.native
  
  var use_separator: js.UndefOr[Boolean] = js.native
}
object RecorderOptions {
  
  @scala.inline
  def apply(): RecorderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecorderOptions]
  }
  
  @scala.inline
  implicit class RecorderOptionsOps[Self <: RecorderOptions] (val x: Self) extends AnyVal {
    
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
    def setDont_print(value: Boolean): Self = this.set("dont_print", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDont_print: Self = this.set("dont_print", js.undefined)
    
    @scala.inline
    def setEnable_reqheaders_recording(value: Boolean): Self = this.set("enable_reqheaders_recording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable_reqheaders_recording: Self = this.set("enable_reqheaders_recording", js.undefined)
    
    @scala.inline
    def setLogging(value: /* content */ String => Unit): Self = this.set("logging", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setOutput_objects(value: Boolean): Self = this.set("output_objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput_objects: Self = this.set("output_objects", js.undefined)
    
    @scala.inline
    def setUse_separator(value: Boolean): Self = this.set("use_separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUse_separator: Self = this.set("use_separator", js.undefined)
  }
}
