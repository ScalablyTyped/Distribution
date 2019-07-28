package typings.memcached.memcachedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueData extends js.Object {
  var failures: js.UndefOr[Double] = js.undefined
  var messages: js.Array[String]
  var server: String
  var tokens: js.Tuple2[String, String]
  var totalDownTime: js.UndefOr[Double] = js.undefined
  var totalFailures: js.UndefOr[Double] = js.undefined
  var totalReconnectsAttempted: js.UndefOr[Double] = js.undefined
  var totalReconnectsFailed: js.UndefOr[Double] = js.undefined
  var totalReconnectsSuccess: js.UndefOr[Double] = js.undefined
}

object IssueData {
  @scala.inline
  def apply(
    messages: js.Array[String],
    server: String,
    tokens: js.Tuple2[String, String],
    failures: Int | Double = null,
    totalDownTime: Int | Double = null,
    totalFailures: Int | Double = null,
    totalReconnectsAttempted: Int | Double = null,
    totalReconnectsFailed: Int | Double = null,
    totalReconnectsSuccess: Int | Double = null
  ): IssueData = {
    val __obj = js.Dynamic.literal(messages = messages, server = server, tokens = tokens)
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (totalDownTime != null) __obj.updateDynamic("totalDownTime")(totalDownTime.asInstanceOf[js.Any])
    if (totalFailures != null) __obj.updateDynamic("totalFailures")(totalFailures.asInstanceOf[js.Any])
    if (totalReconnectsAttempted != null) __obj.updateDynamic("totalReconnectsAttempted")(totalReconnectsAttempted.asInstanceOf[js.Any])
    if (totalReconnectsFailed != null) __obj.updateDynamic("totalReconnectsFailed")(totalReconnectsFailed.asInstanceOf[js.Any])
    if (totalReconnectsSuccess != null) __obj.updateDynamic("totalReconnectsSuccess")(totalReconnectsSuccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueData]
  }
}

