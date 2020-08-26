package typings.pollyjsNodeServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var apiNamespace: String = js.native
  var port: Double = js.native
  var quiet: Boolean = js.native
  var recordingSizeLimit: String = js.native
  var recordingsDir: String = js.native
}

object Config {
  @scala.inline
  def apply(
    apiNamespace: String,
    port: Double,
    quiet: Boolean,
    recordingSizeLimit: String,
    recordingsDir: String
  ): Config = {
    val __obj = js.Dynamic.literal(apiNamespace = apiNamespace.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], recordingSizeLimit = recordingSizeLimit.asInstanceOf[js.Any], recordingsDir = recordingsDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setApiNamespace(value: String): Self = this.set("apiNamespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordingSizeLimit(value: String): Self = this.set("recordingSizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordingsDir(value: String): Self = this.set("recordingsDir", value.asInstanceOf[js.Any])
  }
  
}

