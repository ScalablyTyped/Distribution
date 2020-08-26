package typings.parsimmon.mod

import typings.parsimmon.parsimmonBooleans.`false`
import typings.parsimmon.parsimmonNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureReply
  extends Reply[js.Any] {
  var expected: js.Array[String] = js.native
  var furthest: Double = js.native
  var index: `-1` = js.native
  var status: `false` = js.native
  var value: Null = js.native
}

object FailureReply {
  @scala.inline
  def apply(expected: js.Array[String], furthest: Double, index: `-1`, status: `false`, value: Null): FailureReply = {
    val __obj = js.Dynamic.literal(expected = expected.asInstanceOf[js.Any], furthest = furthest.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureReply]
  }
  @scala.inline
  implicit class FailureReplyOps[Self <: FailureReply] (val x: Self) extends AnyVal {
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
    def setFurthest(value: Double): Self = this.set("furthest", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: `-1`): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: `false`): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Null): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

