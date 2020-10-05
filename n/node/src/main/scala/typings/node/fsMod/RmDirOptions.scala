package typings.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RmDirOptions extends js.Object {
  /**
    * If `true`, perform a recursive directory removal. In
    * recursive mode, errors are not reported if `path` does not exist, and
    * operations are retried on failure.
    * @experimental
    * @default false
    */
  var recursive: js.UndefOr[Boolean] = js.native
}

object RmDirOptions {
  @scala.inline
  def apply(): RmDirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RmDirOptions]
  }
  @scala.inline
  implicit class RmDirOptionsOps[Self <: RmDirOptions] (val x: Self) extends AnyVal {
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
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecursive: Self = this.set("recursive", js.undefined)
  }
  
}

