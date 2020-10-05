package typings.node.processMod.global.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProcessRelease extends js.Object {
  var headersUrl: js.UndefOr[String] = js.native
  var libUrl: js.UndefOr[String] = js.native
  var lts: js.UndefOr[String] = js.native
  var name: String = js.native
  var sourceUrl: js.UndefOr[String] = js.native
}

object ProcessRelease {
  @scala.inline
  def apply(name: String): ProcessRelease = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRelease]
  }
  @scala.inline
  implicit class ProcessReleaseOps[Self <: ProcessRelease] (val x: Self) extends AnyVal {
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
    def setHeadersUrl(value: String): Self = this.set("headersUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadersUrl: Self = this.set("headersUrl", js.undefined)
    @scala.inline
    def setLibUrl(value: String): Self = this.set("libUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLibUrl: Self = this.set("libUrl", js.undefined)
    @scala.inline
    def setLts(value: String): Self = this.set("lts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLts: Self = this.set("lts", js.undefined)
    @scala.inline
    def setSourceUrl(value: String): Self = this.set("sourceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceUrl: Self = this.set("sourceUrl", js.undefined)
  }
  
}

