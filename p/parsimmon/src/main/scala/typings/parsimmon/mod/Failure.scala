package typings.parsimmon.mod

import typings.parsimmon.parsimmonBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Failure
  extends Result[js.Any] {
  var expected: js.Array[String] = js.native
  var index: Index_ = js.native
  var status: `false` = js.native
}

object Failure {
  @scala.inline
  def apply(expected: js.Array[String], index: Index_, status: `false`): Failure = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Failure]
  }
  @scala.inline
  implicit class FailureOps[Self <: Failure] (val x: Self) extends AnyVal {
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
    def setExpectedVarargs(value: String*): Self = this.set("expected", js.Array(value :_*))
    @scala.inline
    def setExpected(value: js.Array[String]): Self = this.set("expected", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Index_): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: `false`): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

