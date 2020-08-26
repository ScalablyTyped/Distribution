package typings.parse.mod.global.Parse.Cloud

import typings.parse.mod.global.Parse.Attributes
import typings.parse.mod.global.Parse.File
import typings.parse.mod.global.Parse.Object
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileTriggerRequest extends TriggerRequest {
  var contentLength: Double = js.native
  var file: File = js.native
  var fileSize: Double = js.native
}

object FileTriggerRequest {
  @scala.inline
  def apply(
    contentLength: Double,
    file: File,
    fileSize: Double,
    headers: js.Any,
    ip: String,
    log: js.Any,
    `object`: Object[Attributes],
    triggerName: String
  ): FileTriggerRequest = {
    val __obj = js.Dynamic.literal(contentLength = contentLength.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileTriggerRequest]
  }
  @scala.inline
  implicit class FileTriggerRequestOps[Self <: FileTriggerRequest] (val x: Self) extends AnyVal {
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
    def setContentLength(value: Double): Self = this.set("contentLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
  }
  
}

