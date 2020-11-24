package typings.overwatchApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Draw extends js.Object {
  
  var draw: Double = js.native
  
  var lost: Double = js.native
  
  var played: Double = js.native
  
  var win_rate: Double = js.native
  
  var won: Double = js.native
}
object Draw {
  
  @scala.inline
  def apply(draw: Double, lost: Double, played: Double, win_rate: Double, won: Double): Draw = {
    val __obj = js.Dynamic.literal(draw = draw.asInstanceOf[js.Any], lost = lost.asInstanceOf[js.Any], played = played.asInstanceOf[js.Any], win_rate = win_rate.asInstanceOf[js.Any], won = won.asInstanceOf[js.Any])
    __obj.asInstanceOf[Draw]
  }
  
  @scala.inline
  implicit class DrawOps[Self <: Draw] (val x: Self) extends AnyVal {
    
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
    def setDraw(value: Double): Self = this.set("draw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLost(value: Double): Self = this.set("lost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayed(value: Double): Self = this.set("played", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWin_rate(value: Double): Self = this.set("win_rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWon(value: Double): Self = this.set("won", value.asInstanceOf[js.Any])
  }
}
