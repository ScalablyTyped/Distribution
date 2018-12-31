package typings
package nodeDashResqueLib.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerOptions extends js.Object {
  var connection: js.UndefOr[ConnectionOptions] = js.undefined
  var looping: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var queues: js.Array[java.lang.String]
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

