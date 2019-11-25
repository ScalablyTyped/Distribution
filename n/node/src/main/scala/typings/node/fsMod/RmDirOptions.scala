package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RmDirOptions extends js.Object {
  /**
    * If `true`, perform a recursive directory removal. In
    * recursive mode, errors are not reported if `path` does not exist, and
    * operations are retried on failure.
    * @experimental
    * @default false
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object RmDirOptions {
  @scala.inline
  def apply(recursive: js.UndefOr[Boolean] = js.undefined): RmDirOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[RmDirOptions]
  }
}

