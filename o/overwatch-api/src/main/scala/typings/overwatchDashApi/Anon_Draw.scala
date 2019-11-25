package typings.overwatchDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Draw extends js.Object {
  var draw: Double
  var lost: Double
  var played: Double
  var win_rate: Double
  var won: Double
}

object Anon_Draw {
  @scala.inline
  def apply(draw: Double, lost: Double, played: Double, win_rate: Double, won: Double): Anon_Draw = {
    val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any], lost = lost.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], win_rate = win_rate.asInstanceOf[js.Any], won = won.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Draw]
  }
}

