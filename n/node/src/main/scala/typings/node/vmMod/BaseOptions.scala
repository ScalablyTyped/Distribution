package typings.node.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
    * Specifies the column number offset that is displayed in stack traces produced by this script.
    * Default: `0`
    */
  var columnOffset: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the filename used in stack traces produced by this script.
    * Default: `''`.
    */
  var filename: js.UndefOr[String] = js.undefined
  /**
    * Specifies the line number offset that is displayed in stack traces produced by this script.
    * Default: `0`.
    */
  var lineOffset: js.UndefOr[Double] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    columnOffset: js.UndefOr[Double] = js.undefined,
    filename: String = null,
    lineOffset: js.UndefOr[Double] = js.undefined
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columnOffset)) __obj.updateDynamic("columnOffset")(columnOffset.get.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (!js.isUndefined(lineOffset)) __obj.updateDynamic("lineOffset")(lineOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

