package typings.onfleetNodeOnfleet.tasksMod

import typings.onfleetNodeOnfleet.anon.CompleteAfter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloneTaskOptions extends js.Object {
  var includeBarCodes: Boolean = js.native
  var includeDependencies: Boolean = js.native
  var includeMetadata: Boolean = js.native
  var overrides: js.UndefOr[CompleteAfter] = js.native
}

object CloneTaskOptions {
  @scala.inline
  def apply(includeBarCodes: Boolean, includeDependencies: Boolean, includeMetadata: Boolean): CloneTaskOptions = {
    val __obj = js.Dynamic.literal(includeBarCodes = includeBarCodes.asInstanceOf[js.Any], includeDependencies = includeDependencies.asInstanceOf[js.Any], includeMetadata = includeMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneTaskOptions]
  }
  @scala.inline
  implicit class CloneTaskOptionsOps[Self <: CloneTaskOptions] (val x: Self) extends AnyVal {
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
    def setIncludeBarCodes(value: Boolean): Self = this.set("includeBarCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeDependencies(value: Boolean): Self = this.set("includeDependencies", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeMetadata(value: Boolean): Self = this.set("includeMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverrides(value: CompleteAfter): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
  
}

