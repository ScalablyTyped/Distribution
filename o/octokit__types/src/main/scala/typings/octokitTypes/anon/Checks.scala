package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Checks extends js.Object {
  var checks: String = js.native
  var contents: String = js.native
  var metadata: String = js.native
}

object Checks {
  @scala.inline
  def apply(checks: String, contents: String, metadata: String): Checks = {
    val __obj = js.Dynamic.literal(checks = checks.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checks]
  }
  @scala.inline
  implicit class ChecksOps[Self <: Checks] (val x: Self) extends AnyVal {
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
    def setChecks(value: String): Self = this.set("checks", value.asInstanceOf[js.Any])
    @scala.inline
    def setContents(value: String): Self = this.set("contents", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: String): Self = this.set("metadata", value.asInstanceOf[js.Any])
  }
  
}

