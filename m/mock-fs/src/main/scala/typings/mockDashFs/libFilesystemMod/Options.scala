package typings.mockDashFs.libFilesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Create a directory for `process.cwd()`. This is `true` by default.
    */
  var createCwd: js.UndefOr[Boolean] = js.undefined
  /**
    * Create a directory for `os.tmpdir()`. This is `true` by default.
    */
  var createTmp: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(createCwd: js.UndefOr[Boolean] = js.undefined, createTmp: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(createCwd)) __obj.updateDynamic("createCwd")(createCwd)
    if (!js.isUndefined(createTmp)) __obj.updateDynamic("createTmp")(createTmp)
    __obj.asInstanceOf[Options]
  }
}

