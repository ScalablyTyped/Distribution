package typings.nodecredstash.anon

import typings.nodecredstash.mod.CredstashContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartsWith extends js.Object {
  var context: js.UndefOr[CredstashContext] = js.native
  var startsWith: js.UndefOr[String] = js.native
  var version: js.UndefOr[Double] = js.native
}

object StartsWith {
  @scala.inline
  def apply(): StartsWith = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartsWith]
  }
  @scala.inline
  implicit class StartsWithOps[Self <: StartsWith] (val x: Self) extends AnyVal {
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
    def setContext(value: CredstashContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setStartsWith(value: String): Self = this.set("startsWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartsWith: Self = this.set("startsWith", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

