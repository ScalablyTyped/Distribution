package typings
package nodeLib.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptOptions extends BaseOptions {
  var cachedData: js.UndefOr[nodeLib.Buffer] = js.undefined
  var displayErrors: js.UndefOr[scala.Boolean] = js.undefined
  var produceCachedData: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object ScriptOptions {
  @scala.inline
  def apply(
    cachedData: nodeLib.Buffer = null,
    columnOffset: scala.Int | scala.Double = null,
    displayErrors: js.UndefOr[scala.Boolean] = js.undefined,
    filename: java.lang.String = null,
    lineOffset: scala.Int | scala.Double = null,
    produceCachedData: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): ScriptOptions = {
    val __obj = js.Dynamic.literal()
    if (cachedData != null) __obj.updateDynamic("cachedData")(cachedData)
    if (columnOffset != null) __obj.updateDynamic("columnOffset")(columnOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(displayErrors)) __obj.updateDynamic("displayErrors")(displayErrors)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (lineOffset != null) __obj.updateDynamic("lineOffset")(lineOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(produceCachedData)) __obj.updateDynamic("produceCachedData")(produceCachedData)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptOptions]
  }
}

