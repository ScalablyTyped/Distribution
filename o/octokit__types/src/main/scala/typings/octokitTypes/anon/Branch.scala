package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Branch extends js.Object {
  var branch: String = js.native
  var directory: String = js.native
}

object Branch {
  @scala.inline
  def apply(branch: String, directory: String): Branch = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], directory = directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Branch]
  }
  @scala.inline
  implicit class BranchOps[Self <: Branch] (val x: Self) extends AnyVal {
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
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
  }
  
}

