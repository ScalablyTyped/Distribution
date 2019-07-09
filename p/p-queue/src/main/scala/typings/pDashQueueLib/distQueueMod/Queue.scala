package typings
package pDashQueueLib.distQueueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue[Options] extends js.Object {
  var size: scala.Double = js.native
  def dequeue(): js.UndefOr[RunFunction] = js.native
  def enqueue(run: RunFunction): scala.Unit = js.native
  def enqueue(run: RunFunction, options: Options): scala.Unit = js.native
}

