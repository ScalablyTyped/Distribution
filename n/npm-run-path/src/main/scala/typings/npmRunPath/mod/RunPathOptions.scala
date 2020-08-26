package typings.npmRunPath.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunPathOptions extends js.Object {
  /**
  		Working directory.
  		@default process.cwd()
  		*/
  val cwd: js.UndefOr[String] = js.native
  /**
  		Path to the Node.js executable to use in child processes if that is different from the current one. Its directory is pushed to the front of PATH.
  		This can be either an absolute path or a path relative to the `cwd` option.
  		@default process.execPath
  		*/
  val execPath: js.UndefOr[String] = js.native
  /**
  		PATH to be appended. Default: [`PATH`](https://github.com/sindresorhus/path-key).
  		Set it to an empty string to exclude the default PATH.
  		*/
  val path: js.UndefOr[String] = js.native
}

object RunPathOptions {
  @scala.inline
  def apply(): RunPathOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunPathOptions]
  }
  @scala.inline
  implicit class RunPathOptionsOps[Self <: RunPathOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCwd: Self = this.set("cwd", js.undefined)
    @scala.inline
    def setExecPath(value: String): Self = this.set("execPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecPath: Self = this.set("execPath", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

