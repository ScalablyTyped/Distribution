package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerOptions extends js.Object {
  var config: js.UndefOr[js.Any] = js.undefined
  var n: js.UndefOr[scala.Double] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var workers: js.UndefOr[js.Array[OpenPGPWorker]] = js.undefined
}

object WorkerOptions {
  @scala.inline
  def apply(
    config: js.Any = null,
    n: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    workers: js.Array[OpenPGPWorker] = null
  ): WorkerOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config)
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (workers != null) __obj.updateDynamic("workers")(workers)
    __obj.asInstanceOf[WorkerOptions]
  }
}

