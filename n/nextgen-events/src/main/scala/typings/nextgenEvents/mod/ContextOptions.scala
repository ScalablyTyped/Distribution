package typings.nextgenEvents.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextOptions extends js.Object {
  var nice: js.UndefOr[Double] = js.native
  var ready: Boolean = js.native
  var scopes: StringDictionary[Scope] = js.native
  var serial: js.UndefOr[js.Any] = js.native
  var status: js.UndefOr[js.Any] = js.native
}

object ContextOptions {
  @scala.inline
  def apply(ready: Boolean, scopes: StringDictionary[Scope]): ContextOptions = {
    val __obj = js.Dynamic.literal(ready = ready.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextOptions]
  }
  @scala.inline
  implicit class ContextOptionsOps[Self <: ContextOptions] (val x: Self) extends AnyVal {
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
    def setReady(value: Boolean): Self = this.set("ready", value.asInstanceOf[js.Any])
    @scala.inline
    def setScopes(value: StringDictionary[Scope]): Self = this.set("scopes", value.asInstanceOf[js.Any])
    @scala.inline
    def setNice(value: Double): Self = this.set("nice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNice: Self = this.set("nice", js.undefined)
    @scala.inline
    def setSerial(value: js.Any): Self = this.set("serial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSerial: Self = this.set("serial", js.undefined)
    @scala.inline
    def setStatus(value: js.Any): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

