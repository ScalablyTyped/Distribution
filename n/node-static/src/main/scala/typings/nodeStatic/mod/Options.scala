package typings.nodeStatic.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cache: js.UndefOr[Double | Boolean] = js.native
  var `cache-control`: js.UndefOr[String] = js.native
  var headers: js.UndefOr[Headers] = js.native
  var indexFile: js.UndefOr[String] = js.native
  var server: js.UndefOr[String] = js.native
  var serverInfo: js.UndefOr[Buffer] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setCache(value: Double | Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def `setCache-control`(value: String): Self = this.set("cache-control", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCache-control`: Self = this.set("cache-control", js.undefined)
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIndexFile(value: String): Self = this.set("indexFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndexFile: Self = this.set("indexFile", js.undefined)
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    @scala.inline
    def setServerInfo(value: Buffer): Self = this.set("serverInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerInfo: Self = this.set("serverInfo", js.undefined)
  }
  
}

