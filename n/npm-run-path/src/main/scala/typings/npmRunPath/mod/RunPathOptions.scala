package typings.npmRunPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunPathOptions extends js.Object {
  /**
  		Working directory.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.undefined
  /**
  		PATH to be appended. Default: [`PATH`](https://github.com/sindresorhus/path-key).
  		Set it to an empty string to exclude the default PATH.
  		*/
  val path: js.UndefOr[String] = js.undefined
}

object RunPathOptions {
  @scala.inline
  def apply(cwd: String = null, path: String = null): RunPathOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunPathOptions]
  }
}

