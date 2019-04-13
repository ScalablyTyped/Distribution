package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerOptions extends js.Object {
  /**
    * number of workers to initialize
    */
  var n: js.UndefOr[scala.Double] = js.undefined
  /**
    * relative path to the worker scripts, default: 'openpgp.worker.js'
    */
  var path: java.lang.String
  /**
    * alternative to path parameter: web workers initialized with 'openpgp.worker.js'
    */
  var workers: js.UndefOr[js.Array[_]] = js.undefined
}

object WorkerOptions {
  @scala.inline
  def apply(path: java.lang.String, n: scala.Int | scala.Double = null, workers: js.Array[_] = null): WorkerOptions = {
    val __obj = js.Dynamic.literal(path = path)
    if (n != null) __obj.updateDynamic("n")(n.asInstanceOf[js.Any])
    if (workers != null) __obj.updateDynamic("workers")(workers)
    __obj.asInstanceOf[WorkerOptions]
  }
}

