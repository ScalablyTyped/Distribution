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
    maxRetries: Int | Double = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    retryDelay: Int | Double = null
  ): RmDirAsyncOptions = {
    val __obj = js.Dynamic.literal()
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (retryDelay != null) __obj.updateDynamic("retryDelay")(retryDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmDirAsyncOptions]
  }
}

