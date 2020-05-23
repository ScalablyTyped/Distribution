package typings.node.zlibMod

import typings.node.NodeJS.ArrayBufferView
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibOptions extends js.Object {
  /**
    * @default 16*1024
    */
  var chunkSize: js.UndefOr[Double] = js.undefined
   // compression only
  var dictionary: js.UndefOr[ArrayBufferView | ArrayBuffer] = js.undefined
  /**
    * @default constants.Z_FINISH
    */
  var finishFlush: js.UndefOr[Double] = js.undefined
  /**
    * @default constants.Z_NO_FLUSH
    */
  var flush: js.UndefOr[Double] = js.undefined
  var level: js.UndefOr[Double] = js.undefined
   // compression only
  var memLevel: js.UndefOr[Double] = js.undefined
   // compression only
  var strategy: js.UndefOr[Double] = js.undefined
  var windowBits: js.UndefOr[Double] = js.undefined
}

object ZlibOptions {
  @scala.inline
  def apply(
    chunkSize: js.UndefOr[Double] = js.undefined,
    dictionary: ArrayBufferView | ArrayBuffer = null,
    finishFlush: js.UndefOr[Double] = js.undefined,
    flush: js.UndefOr[Double] = js.undefined,
    level: js.UndefOr[Double] = js.undefined,
    memLevel: js.UndefOr[Double] = js.undefined,
    strategy: js.UndefOr[Double] = js.undefined,
    windowBits: js.UndefOr[Double] = js.undefined
  ): ZlibOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chunkSize)) __obj.updateDynamic("chunkSize")(chunkSize.get.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (!js.isUndefined(finishFlush)) __obj.updateDynamic("finishFlush")(finishFlush.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flush)) __obj.updateDynamic("flush")(flush.get.asInstanceOf[js.Any])
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(memLevel)) __obj.updateDynamic("memLevel")(memLevel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strategy)) __obj.updateDynamic("strategy")(strategy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(windowBits)) __obj.updateDynamic("windowBits")(windowBits.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZlibOptions]
  }
}

