package typings.nightwatch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Build extends js.Object {
  var build: Revision = js.native
  var status: Arch = js.native
}

object Build {
  @scala.inline
  def apply(build: Revision, status: Arch): Build = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Build]
  }
  @scala.inline
  implicit class BuildOps[Self <: Build] (val x: Self) extends AnyVal {
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
    def setBuild(value: Revision): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Arch): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

