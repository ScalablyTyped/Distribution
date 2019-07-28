package typings.node.vmMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptOptions extends BaseOptions {
  var cachedData: js.UndefOr[Buffer] = js.undefined
  var displayErrors: js.UndefOr[Boolean] = js.undefined
  var produceCachedData: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ScriptOptions {
  @scala.inline
  def apply(
    cachedData: Buffer = null,
    columnOffset: Int | Double = null,
    displayErrors: js.UndefOr[Boolean] = js.undefined,
    filename: java.lang.String = null,
    lineOffset: Int | Double = null,
    produceCachedData: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
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

