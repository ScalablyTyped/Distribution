package typings.mkdirp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fs: js.UndefOr[FsImplementation] = js.undefined
  var mode: js.UndefOr[Mode] = js.undefined
}

object Options {
  @scala.inline
  def apply(fs: FsImplementation = null, mode: Mode = null): Options = {
    val __obj = js.Dynamic.literal()
    if (fs != null) __obj.updateDynamic("fs")(fs.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

