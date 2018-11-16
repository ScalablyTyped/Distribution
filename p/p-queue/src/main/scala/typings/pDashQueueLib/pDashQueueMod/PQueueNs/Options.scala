package typings
package pDashQueueLib.pDashQueueMod.PQueueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Options[O /* <: QueueAddOptions */] extends js.Object {
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
  var concurrency: js.UndefOr[scala.Double] = js.undefined
  var queueClass: js.UndefOr[QueueClassConstructor[O]] = js.undefined
}

