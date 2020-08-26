package typings.nodeHueApi.mod

import typings.nodeHueApi.anon.Api
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBridgeVersion extends js.Object {
  var name: String = js.native
  var version: Api = js.native
}

object IBridgeVersion {
  @scala.inline
  def apply(name: String, version: Api): IBridgeVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBridgeVersion]
  }
  @scala.inline
  implicit class IBridgeVersionOps[Self <: IBridgeVersion] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Api): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

