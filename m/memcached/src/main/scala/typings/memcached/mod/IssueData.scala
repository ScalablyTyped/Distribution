package typings.memcached.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IssueData extends js.Object {
  var failures: js.UndefOr[Double] = js.native
  var messages: js.Array[String] = js.native
  var server: String = js.native
  var tokens: js.Tuple2[String, String] = js.native
  var totalDownTime: js.UndefOr[Double] = js.native
  var totalFailures: js.UndefOr[Double] = js.native
  var totalReconnectsAttempted: js.UndefOr[Double] = js.native
  var totalReconnectsFailed: js.UndefOr[Double] = js.native
  var totalReconnectsSuccess: js.UndefOr[Double] = js.native
}

object IssueData {
  @scala.inline
  def apply(messages: js.Array[String], server: String, tokens: js.Tuple2[String, String]): IssueData = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueData]
  }
  @scala.inline
  implicit class IssueDataOps[Self <: IssueData] (val x: Self) extends AnyVal {
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
    def setMessagesVarargs(value: String*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[String]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokens(value: js.Tuple2[String, String]): Self = this.set("tokens", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailures(value: Double): Self = this.set("failures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailures: Self = this.set("failures", js.undefined)
    @scala.inline
    def setTotalDownTime(value: Double): Self = this.set("totalDownTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalDownTime: Self = this.set("totalDownTime", js.undefined)
    @scala.inline
    def setTotalFailures(value: Double): Self = this.set("totalFailures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalFailures: Self = this.set("totalFailures", js.undefined)
    @scala.inline
    def setTotalReconnectsAttempted(value: Double): Self = this.set("totalReconnectsAttempted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalReconnectsAttempted: Self = this.set("totalReconnectsAttempted", js.undefined)
    @scala.inline
    def setTotalReconnectsFailed(value: Double): Self = this.set("totalReconnectsFailed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalReconnectsFailed: Self = this.set("totalReconnectsFailed", js.undefined)
    @scala.inline
    def setTotalReconnectsSuccess(value: Double): Self = this.set("totalReconnectsSuccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalReconnectsSuccess: Self = this.set("totalReconnectsSuccess", js.undefined)
  }
  
}

