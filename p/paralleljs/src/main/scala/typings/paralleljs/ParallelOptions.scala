package typings.paralleljs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParallelOptions extends js.Object {
  /**
    * This is the path to the file eval.js.  This is required when running in node, and required for some browsers (IE 10) in order to work around cross-domain restrictions for web workers.  Defaults to the same location as parallel.js in node environments, and null in the browser.
    **/
  var evalPath: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of permitted worker threads.  This will default to 4, or the number of cpus on your computer if you're running node.
    **/
  var maxWorkers: js.UndefOr[Double] = js.undefined
  /**
    * If webworkers are not available, whether or not to fall back to synchronous processing using setTimeout.  Defaults to true.
    **/
  var synchronous: js.UndefOr[Boolean] = js.undefined
}

object ParallelOptions {
  @scala.inline
  def apply(
    evalPath: String = null,
    maxWorkers: js.UndefOr[Double] = js.undefined,
    synchronous: js.UndefOr[Boolean] = js.undefined
  ): ParallelOptions = {
    val __obj = js.Dynamic.literal()
    if (evalPath != null) __obj.updateDynamic("evalPath")(evalPath.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWorkers)) __obj.updateDynamic("maxWorkers")(maxWorkers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelOptions]
  }
}

