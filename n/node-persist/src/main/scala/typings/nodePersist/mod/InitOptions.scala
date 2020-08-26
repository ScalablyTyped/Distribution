package typings.nodePersist.mod

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitOptions extends js.Object {
  var dir: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[BufferEncoding] = js.native
  var expiredInterval: js.UndefOr[Milliseconds] = js.native
  var forgiveParseErrors: js.UndefOr[Boolean] = js.native
  var logging: js.UndefOr[(js.Function1[/* repeated */ js.Any, Unit]) | Boolean] = js.native
  var parse: js.UndefOr[js.Function1[/* str */ String, _]] = js.native
  var stringify: js.UndefOr[js.Function1[/* data */ js.Any, String]] = js.native
  var ttl: js.UndefOr[Milliseconds] = js.native
}

object InitOptions {
  @scala.inline
  def apply(): InitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitOptions]
  }
  @scala.inline
  implicit class InitOptionsOps[Self <: InitOptions] (val x: Self) extends AnyVal {
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
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDir: Self = this.set("dir", js.undefined)
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    @scala.inline
    def setExpiredInterval(value: Milliseconds): Self = this.set("expiredInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiredInterval: Self = this.set("expiredInterval", js.undefined)
    @scala.inline
    def setForgiveParseErrors(value: Boolean): Self = this.set("forgiveParseErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForgiveParseErrors: Self = this.set("forgiveParseErrors", js.undefined)
    @scala.inline
    def setLoggingFunction1(value: /* repeated */ js.Any => Unit): Self = this.set("logging", js.Any.fromFunction1(value))
    @scala.inline
    def setLogging(value: (js.Function1[/* repeated */ js.Any, Unit]) | Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    @scala.inline
    def setParse(value: /* str */ String => _): Self = this.set("parse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteParse: Self = this.set("parse", js.undefined)
    @scala.inline
    def setStringify(value: /* data */ js.Any => String): Self = this.set("stringify", js.Any.fromFunction1(value))
    @scala.inline
    def deleteStringify: Self = this.set("stringify", js.undefined)
    @scala.inline
    def setTtl(value: Milliseconds): Self = this.set("ttl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
  }
  
}

