package typings
package nodeLib.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrotliOptions extends js.Object {
  /**
    * @default 16*1024
    */
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * @default constants.BROTLI_OPERATION_FINISH
    */
  var finishFlush: js.UndefOr[scala.Double] = js.undefined
  /**
    * @default constants.BROTLI_OPERATION_PROCESS
    */
  var flush: js.UndefOr[scala.Double] = js.undefined
  var params: /**
    * Each key is a `constants.BROTLI_*` constant.
    */
  js.UndefOr[
    /**
    * Each key is a `constants.BROTLI_*` constant.
    */
  org.scalablytyped.runtime.NumberDictionary[scala.Boolean | scala.Double]
  ] = js.undefined
}

object BrotliOptions {
  @scala.inline
  def apply(
    chunkSize: scala.Int | scala.Double = null,
    finishFlush: scala.Int | scala.Double = null,
    flush: scala.Int | scala.Double = null,
    params: /**
    * Each key is a `constants.BROTLI_*` constant.
    */
  org.scalablytyped.runtime.NumberDictionary[scala.Boolean | scala.Double] = null
  ): BrotliOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[BrotliOptions]
  }
}

