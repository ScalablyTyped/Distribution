package typings.node.zlibMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrotliOptions extends js.Object {
  /**
    * @default 16*1024
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
  /**
    * @default constants.BROTLI_OPERATION_FINISH
    */
  var finishFlush: js.UndefOr[Double] = js.undefined
  /**
    * @default constants.BROTLI_OPERATION_PROCESS
    */
  var flush: js.UndefOr[Double] = js.undefined
  var params: js.UndefOr[
    /**
    * Each key is a `constants.BROTLI_*` constant.
    */
  NumberDictionary[Boolean | Double]
  ] = js.undefined
}

object BrotliOptions {
  @scala.inline
  def apply(
    chunkSize: js.UndefOr[Double] = js.undefined,
    finishFlush: js.UndefOr[Double] = js.undefined,
    flush: js.UndefOr[Double] = js.undefined,
    params: /**
    * Each key is a `constants.BROTLI_*` constant.
    */
  NumberDictionary[Boolean | Double] = null
  ): BrotliOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(finishFlush)) __obj.updateDynamic("finishFlush")(finishFlush.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flush)) __obj.updateDynamic("flush")(flush.get.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrotliOptions]
  }
}

