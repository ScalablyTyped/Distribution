package typings
package nodeLib.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibOptions extends js.Object {
  /**
    * @default 16*1024
    */
  var chunkSize: js.UndefOr[scala.Double] = js.undefined
   // compression only
  var dictionary: js.UndefOr[nodeLib.NodeJSNs.TypedArray | stdLib.DataView | stdLib.ArrayBuffer] = js.undefined
  /**
    * @default constants.Z_FINISH
    */
  var finishFlush: js.UndefOr[scala.Double] = js.undefined
  /**
    * @default constants.Z_NO_FLUSH
    */
  var flush: js.UndefOr[scala.Double] = js.undefined
  var level: js.UndefOr[scala.Double] = js.undefined
   // compression only
  var memLevel: js.UndefOr[scala.Double] = js.undefined
   // compression only
  var strategy: js.UndefOr[scala.Double] = js.undefined
  var windowBits: js.UndefOr[scala.Double] = js.undefined
}

object ZlibOptions {
  @scala.inline
  def apply(
    chunkSize: scala.Int | scala.Double = null,
    dictionary: nodeLib.NodeJSNs.TypedArray | stdLib.DataView | stdLib.ArrayBuffer = null,
    finishFlush: scala.Int | scala.Double = null,
    flush: scala.Int | scala.Double = null,
    level: scala.Int | scala.Double = null,
    memLevel: scala.Int | scala.Double = null,
    strategy: scala.Int | scala.Double = null,
    windowBits: scala.Int | scala.Double = null
  ): ZlibOptions = {
    val __obj = js.Dynamic.literal()
    if (chunkSize != null) __obj.updateDynamic("chunkSize")(chunkSize.asInstanceOf[js.Any])
    if (dictionary != null) __obj.updateDynamic("dictionary")(dictionary.asInstanceOf[js.Any])
    if (finishFlush != null) __obj.updateDynamic("finishFlush")(finishFlush.asInstanceOf[js.Any])
    if (flush != null) __obj.updateDynamic("flush")(flush.asInstanceOf[js.Any])
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (memLevel != null) __obj.updateDynamic("memLevel")(memLevel.asInstanceOf[js.Any])
    if (strategy != null) __obj.updateDynamic("strategy")(strategy.asInstanceOf[js.Any])
    if (windowBits != null) __obj.updateDynamic("windowBits")(windowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZlibOptions]
  }
}

