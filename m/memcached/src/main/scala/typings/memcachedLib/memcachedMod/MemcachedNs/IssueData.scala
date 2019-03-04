package typings
package memcachedLib.memcachedMod.MemcachedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IssueData extends js.Object {
  var failures: js.UndefOr[scala.Double] = js.undefined
  var messages: js.Array[java.lang.String]
  var server: java.lang.String
  var tokens: js.Tuple2[java.lang.String, java.lang.String]
  var totalDownTime: js.UndefOr[scala.Double] = js.undefined
  var totalFailures: js.UndefOr[scala.Double] = js.undefined
  var totalReconnectsAttempted: js.UndefOr[scala.Double] = js.undefined
  var totalReconnectsFailed: js.UndefOr[scala.Double] = js.undefined
  var totalReconnectsSuccess: js.UndefOr[scala.Double] = js.undefined
}

object IssueData {
  @scala.inline
  def apply(
    messages: js.Array[java.lang.String],
    server: java.lang.String,
    tokens: js.Tuple2[java.lang.String, java.lang.String],
    failures: scala.Int | scala.Double = null,
    totalDownTime: scala.Int | scala.Double = null,
    totalFailures: scala.Int | scala.Double = null,
    totalReconnectsAttempted: scala.Int | scala.Double = null,
    totalReconnectsFailed: scala.Int | scala.Double = null,
    totalReconnectsSuccess: scala.Int | scala.Double = null
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

