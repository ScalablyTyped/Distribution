package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatObject extends js.Object {
  var atk: Double
  var `def`: Double
  var hp: Double
  var sp_atk: Double
  var sp_def: Double
  var speed: Double
}

object StatObject {
  @scala.inline
  def apply(atk: Double, `def`: Double, hp: Double, sp_atk: Double, sp_def: Double, speed: Double): StatObject = {
    val __obj = js.Dynamic.literal(atk = atk.asInstanceOf[js.Any], hp = hp.asInstanceOf[js.Any], sp_atk = sp_atk.asInstanceOf[js.Any], sp_def = sp_def.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
    __obj.updateDynamic("def")(`def`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatObject]
  }
}

