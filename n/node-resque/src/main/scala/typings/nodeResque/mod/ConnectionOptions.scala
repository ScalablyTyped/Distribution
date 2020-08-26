package typings.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionOptions extends js.Object {
  var database: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var looping: js.UndefOr[Boolean] = js.native
  var namespace: js.UndefOr[String] = js.native
  var options: js.UndefOr[js.Any] = js.native
  var pkg: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var redis: js.UndefOr[js.Any] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
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
    def setDatabase(value: Double): Self = this.set("database", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabase: Self = this.set("database", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLooping(value: Boolean): Self = this.set("looping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLooping: Self = this.set("looping", js.undefined)
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPkg(value: String): Self = this.set("pkg", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePkg: Self = this.set("pkg", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setRedis(value: js.Any): Self = this.set("redis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedis: Self = this.set("redis", js.undefined)
  }
  
}

