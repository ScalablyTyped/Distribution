package typings.parseGitignore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var patterns: js.Array[String] = js.native
  var sections: js.Array[Section] = js.native
}

object State {
  @scala.inline
  def apply(patterns: js.Array[String], sections: js.Array[Section]): State = {
    val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
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
    def setPatternsVarargs(value: String*): Self = this.set("patterns", js.Array(value :_*))
    @scala.inline
    def setPatterns(value: js.Array[String]): Self = this.set("patterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setSectionsVarargs(value: Section*): Self = this.set("sections", js.Array(value :_*))
    @scala.inline
    def setSections(value: js.Array[Section]): Self = this.set("sections", value.asInstanceOf[js.Any])
  }
  
}

