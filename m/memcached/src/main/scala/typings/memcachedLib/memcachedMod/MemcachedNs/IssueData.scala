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

