package typings.memcached.mod

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
    failures: js.UndefOr[Double] = js.undefined,
    totalDownTime: js.UndefOr[Double] = js.undefined,
    totalFailures: js.UndefOr[Double] = js.undefined,
    totalReconnectsAttempted: js.UndefOr[Double] = js.undefined,
    totalReconnectsFailed: js.UndefOr[Double] = js.undefined,
    totalReconnectsSuccess: js.UndefOr[Double] = js.undefined
  ): IssueData = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
    if (!js.isUndefined(failures)) __obj.updateDynamic("failures")(failures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalDownTime)) __obj.updateDynamic("totalDownTime")(totalDownTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalFailures)) __obj.updateDynamic("totalFailures")(totalFailures.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalReconnectsAttempted)) __obj.updateDynamic("totalReconnectsAttempted")(totalReconnectsAttempted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalReconnectsFailed)) __obj.updateDynamic("totalReconnectsFailed")(totalReconnectsFailed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalReconnectsSuccess)) __obj.updateDynamic("totalReconnectsSuccess")(totalReconnectsSuccess.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssueData]
  }
}

