package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RmDirAsyncOptions extends RmDirOptions {
  /**
    * If an `EBUSY`, `EMFILE`, `ENFILE`, `ENOTEMPTY`, or
    * `EPERM` error is encountered, Node.js will retry the operation with a linear
    * backoff wait of `retryDelay` ms longer on each try. This option represents the
    * number of retries. This option is ignored if the `recursive` option is not
    * `true`.
    * @default 0
    */
  var maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * The amount of time in milliseconds to wait between retries.
    * This option is ignored if the `recursive` option is not `true`.
    * @default 100
    */
  var retryDelay: js.UndefOr[Double] = js.undefined
}

object RmDirAsyncOptions {
  @scala.inline
  def apply(
    maxRetries: js.UndefOr[Double] = js.undefined,
    recursive: js.UndefOr[Boolean] = js.undefined,
    retryDelay: js.UndefOr[Double] = js.undefined
  ): RmDirAsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(retryDelay)) __obj.updateDynamic("retryDelay")(retryDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmDirAsyncOptions]
  }
}

