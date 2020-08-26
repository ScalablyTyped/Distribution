package typings.pollyjsNodeServer.anon

import typings.cors.mod.CorsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@pollyjs/node-server.@pollyjs/node-server.ServerConfig> */
@js.native
trait PartialServerConfig extends js.Object {
  var apiNamespace: js.UndefOr[String] = js.native
  var corsOptions: js.UndefOr[CorsOptions] = js.native
  var port: js.UndefOr[Double] = js.native
  var quiet: js.UndefOr[Boolean] = js.native
  var recordingSizeLimit: js.UndefOr[String] = js.native
  var recordingsDir: js.UndefOr[String] = js.native
}

object PartialServerConfig {
  @scala.inline
  def apply(): PartialServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServerConfig]
  }
  @scala.inline
  implicit class PartialServerConfigOps[Self <: PartialServerConfig] (val x: Self) extends AnyVal {
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
    def deleteApiNamespace: Self = this.set("apiNamespace", js.undefined)
    @scala.inline
    def setCorsOptions(value: CorsOptions): Self = this.set("corsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorsOptions: Self = this.set("corsOptions", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    @scala.inline
    def setRecordingSizeLimit(value: String): Self = this.set("recordingSizeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordingSizeLimit: Self = this.set("recordingSizeLimit", js.undefined)
    @scala.inline
    def setRecordingsDir(value: String): Self = this.set("recordingsDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordingsDir: Self = this.set("recordingsDir", js.undefined)
  }
  
}

