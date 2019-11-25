package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RmDirAsyncOptions extends RmDirOptions {
  /**
    * If an `EMFILE` error is encountered, Node.js will
    * retry the operation with a linear backoff of 1ms longer on each try until the
    * timeout duration passes this limit. This option is ignored if the `recursive`
    * option is not `true`.
    * @default 1000
    */
  var emfileWait: js.UndefOr[Double] = js.undefined
  /**
    * If an `EBUSY`, `ENOTEMPTY`, or `EPERM` error is
    * encountered, Node.js will retry the operation with a linear backoff wait of
    * 100ms longer on each try. This option represents the number of retries. This
    * option is ignored if the `recursive` option is not `true`.
    * @default 3
    */
  var maxBusyTries: js.UndefOr[Double] = js.undefined
}

object RmDirAsyncOptions {
  @scala.inline
  def apply(
    emfileWait: Int | Double = null,
    maxBusyTries: Int | Double = null,
    recursive: js.UndefOr[Boolean] = js.undefined
  ): RmDirAsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (emfileWait != null) __obj.updateDynamic("emfileWait")(emfileWait.asInstanceOf[js.Any])
    if (maxBusyTries != null) __obj.updateDynamic("maxBusyTries")(maxBusyTries.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmDirAsyncOptions]
  }
}

