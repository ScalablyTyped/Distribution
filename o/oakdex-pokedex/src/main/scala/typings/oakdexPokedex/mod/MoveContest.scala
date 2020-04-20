package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveContest extends js.Object {
  var appeal: Double
  var condition: String
  var contest: String
  var jam: Double
}

object MoveContest {
  @scala.inline
  def apply(appeal: Double, condition: String, contest: String, jam: Double): MoveContest = {
    val __obj = js.Dynamic.literal(appeal = appeal.asInstanceOf[js.Any], condition = condition.asInstanceOf[js.Any], contest = contest.asInstanceOf[js.Any], jam = jam.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveContest]
  }
}

