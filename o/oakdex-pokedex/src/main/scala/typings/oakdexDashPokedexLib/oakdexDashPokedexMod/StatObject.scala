package typings
package oakdexDashPokedexLib.oakdexDashPokedexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatObject extends js.Object {
  var atk: scala.Double
  var `def`: scala.Double
  var hp: scala.Double
  var sp_atk: scala.Double
  var sp_def: scala.Double
  var speed: scala.Double
}

object StatObject {
  @scala.inline
  def apply(
    atk: scala.Double,
    `def`: scala.Double,
    hp: scala.Double,
    sp_atk: scala.Double,
    sp_def: scala.Double,
    speed: scala.Double
  ): StatObject = {
    val __obj = js.Dynamic.literal(atk = atk, hp = hp, sp_atk = sp_atk, sp_def = sp_def, speed = speed)
    __obj.updateDynamic("def")(`def`)
    __obj.asInstanceOf[StatObject]
  }
}

