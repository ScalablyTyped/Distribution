package typings.nodeInsights.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var accountId: String = js.native
  var defaultEventType: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var gzip: js.UndefOr[Boolean] = js.native
  var insertKey: String = js.native
  var maxPending: js.UndefOr[Double] = js.native
  var queryKey: String = js.native
  var timerInterval: js.UndefOr[Double] = js.native
}

object Config {
  @scala.inline
  def apply(accountId: String, insertKey: String, queryKey: String): Config = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], insertKey = insertKey.asInstanceOf[js.Any], queryKey = queryKey.asInstanceOf[js.Any])
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setInsertKey(value: String): Self = this.set("insertKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryKey(value: String): Self = this.set("queryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultEventType(value: String): Self = this.set("defaultEventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultEventType: Self = this.set("defaultEventType", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setGzip(value: Boolean): Self = this.set("gzip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGzip: Self = this.set("gzip", js.undefined)
    @scala.inline
    def setMaxPending(value: Double): Self = this.set("maxPending", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPending: Self = this.set("maxPending", js.undefined)
    @scala.inline
    def setTimerInterval(value: Double): Self = this.set("timerInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimerInterval: Self = this.set("timerInterval", js.undefined)
  }
  
}

