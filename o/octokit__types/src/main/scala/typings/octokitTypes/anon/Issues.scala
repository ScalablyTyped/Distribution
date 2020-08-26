package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issues extends js.Object {
  var contents: String = js.native
  var issues: String = js.native
  var metadata: String = js.native
  var single_file: String = js.native
}

object Issues {
  @scala.inline
  def apply(contents: String, issues: String, metadata: String, single_file: String): Issues = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], issues = issues.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], single_file = single_file.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issues]
  }
  @scala.inline
  implicit class IssuesOps[Self <: Issues] (val x: Self) extends AnyVal {
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
    def setContents(value: String): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssues(value: String): Self = this.set("issues", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setSingle_file(value: String): Self = this.set("single_file", value.asInstanceOf[js.Any])
  }
  
}

