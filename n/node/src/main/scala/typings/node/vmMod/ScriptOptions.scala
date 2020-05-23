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
    columnOffset: js.UndefOr[Double] = js.undefined,
    displayErrors: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    lineOffset: js.UndefOr[Double] = js.undefined,
    produceCachedData: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): ScriptOptions = {
    val __obj = js.Dynamic.literal()
    if (cachedData != null) __obj.updateDynamic("cachedData")(cachedData.asInstanceOf[js.Any])
    if (!js.isUndefined(columnOffset)) __obj.updateDynamic("columnOffset")(columnOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayErrors)) __obj.updateDynamic("displayErrors")(displayErrors.get.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(lineOffset)) __obj.updateDynamic("lineOffset")(lineOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(produceCachedData)) __obj.updateDynamic("produceCachedData")(produceCachedData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptOptions]
  }
}

