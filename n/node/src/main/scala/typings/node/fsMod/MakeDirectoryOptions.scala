package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeDirectoryOptions extends js.Object {
  /**
    * A file mode. If a string is passed, it is parsed as an octal integer. If not specified
    * @default 0o777.
    */
  var mode: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether parent folders should be created.
    * @default false
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object MakeDirectoryOptions {
  @scala.inline
  def apply(mode: Int | Double = null, recursive: js.UndefOr[Boolean] = js.undefined): MakeDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[MakeDirectoryOptions]
  }
}

