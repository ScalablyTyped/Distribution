package typings.npmUserPackages.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bugs extends js.Object {
  var bugs: js.UndefOr[String] = js.native
  var homepage: js.UndefOr[String] = js.native
  var npm: String = js.native
  var repository: js.UndefOr[String] = js.native
}

object Bugs {
  @scala.inline
  def apply(npm: String): Bugs = {
    val __obj = js.Dynamic.literal(npm = npm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bugs]
  }
  @scala.inline
  implicit class BugsOps[Self <: Bugs] (val x: Self) extends AnyVal {
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
    def setNpm(value: String): Self = this.set("npm", value.asInstanceOf[js.Any])
    @scala.inline
    def setBugs(value: String): Self = this.set("bugs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBugs: Self = this.set("bugs", js.undefined)
    @scala.inline
    def setHomepage(value: String): Self = this.set("homepage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomepage: Self = this.set("homepage", js.undefined)
    @scala.inline
    def setRepository(value: String): Self = this.set("repository", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepository: Self = this.set("repository", js.undefined)
  }
  
}

