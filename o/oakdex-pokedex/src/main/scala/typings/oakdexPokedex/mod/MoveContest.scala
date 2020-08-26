package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MoveContest extends js.Object {
  var appeal: Double = js.native
  var condition: String = js.native
  var contest: String = js.native
  var jam: Double = js.native
}

object MoveContest {
  @scala.inline
  def apply(appeal: Double, condition: String, contest: String, jam: Double): MoveContest = {
    val __obj = js.Dynamic.literal(appeal = appeal.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], contest = contest.asInstanceOf[js.Any], jam = jam.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveContest]
  }
  @scala.inline
  implicit class MoveContestOps[Self <: MoveContest] (val x: Self) extends AnyVal {
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
    def setAppeal(value: Double): Self = this.set("appeal", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: String): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setContest(value: String): Self = this.set("contest", value.asInstanceOf[js.Any])
    @scala.inline
    def setJam(value: Double): Self = this.set("jam", value.asInstanceOf[js.Any])
  }
  
}

