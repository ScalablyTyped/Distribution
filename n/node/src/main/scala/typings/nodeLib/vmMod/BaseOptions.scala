package typings
package nodeLib.vmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseOptions extends js.Object {
  /**
    * Specifies the column number offset that is displayed in stack traces produced by this script.
    * Default: `0`
    */
  var columnOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies the filename used in stack traces produced by this script.
    * Default: `''`.
    */
  var filename: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the line number offset that is displayed in stack traces produced by this script.
    * Default: `0`.
    */
  var lineOffset: js.UndefOr[scala.Double] = js.undefined
}

object BaseOptions {
  @scala.inline
  def apply(
    columnOffset: scala.Int | scala.Double = null,
    filename: java.lang.String = null,
    lineOffset: scala.Int | scala.Double = null
  ): BaseOptions = {
    val __obj = js.Dynamic.literal()
    if (columnOffset != null) __obj.updateDynamic("columnOffset")(columnOffset.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (lineOffset != null) __obj.updateDynamic("lineOffset")(lineOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOptions]
  }
}

