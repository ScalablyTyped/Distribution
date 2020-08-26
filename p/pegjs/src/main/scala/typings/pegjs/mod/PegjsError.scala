package typings.pegjs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PegjsError extends Error {
  var expected: js.UndefOr[js.Array[ExpectedItem]] = js.native
  var found: js.UndefOr[js.Any] = js.native
  var location: LocationRange = js.native
  @JSName("stack")
  var stack_PegjsError: js.UndefOr[js.Any] = js.native
}

object PegjsError {
  @scala.inline
  def apply(location: LocationRange, message: String, name: String): PegjsError = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PegjsError]
  }
  @scala.inline
  implicit class PegjsErrorOps[Self <: PegjsError] (val x: Self) extends AnyVal {
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
    def setLocation(value: LocationRange): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpectedVarargs(value: ExpectedItem*): Self = this.set("expected", js.Array(value :_*))
    @scala.inline
    def setExpected(value: js.Array[ExpectedItem]): Self = this.set("expected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpected: Self = this.set("expected", js.undefined)
    @scala.inline
    def setFound(value: js.Any): Self = this.set("found", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFound: Self = this.set("found", js.undefined)
    @scala.inline
    def setStack(value: js.Any): Self = this.set("stack", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStack: Self = this.set("stack", js.undefined)
  }
  
}

