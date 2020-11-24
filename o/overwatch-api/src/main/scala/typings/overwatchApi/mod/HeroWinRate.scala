package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeroWinRate extends Hero {
  
  var win_rate: String = js.native
}
object HeroWinRate {
  
  @scala.inline
  def apply(hero: String, img: String, win_rate: String): HeroWinRate = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], win_rate = win_rate.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroWinRate]
  }
  
  @scala.inline
  implicit class HeroWinRateOps[Self <: HeroWinRate] (val x: Self) extends AnyVal {
    
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
    def setWin_rate(value: String): Self = this.set("win_rate", value.asInstanceOf[js.Any])
  }
}
