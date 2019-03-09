package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MoveContest extends js.Object {
  var appeal: scala.Double
  var condition: java.lang.String
  var contest: java.lang.String
  var jam: scala.Double
}

object MoveContest {
  @scala.inline
  def apply(appeal: scala.Double, condition: java.lang.String, contest: java.lang.String, jam: scala.Double): MoveContest = {
    val __obj = js.Dynamic.literal(appeal = appeal, condition = condition, contest = contest, jam = jam)
  
    __obj.asInstanceOf[MoveContest]
  }
}

