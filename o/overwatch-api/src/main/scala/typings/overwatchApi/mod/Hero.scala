package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hero extends js.Object {
  
  var hero: String = js.native
  
  var img: String = js.native
}
object Hero {
  
  @scala.inline
  def apply(hero: String, img: String): Hero = {
    val __obj = js.Dynamic.literal(hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hero]
  }
  
  @scala.inline
  implicit class HeroOps[Self <: Hero] (val x: Self) extends AnyVal {
    
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
    def setHero(value: String): Self = this.set("hero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImg(value: String): Self = this.set("img", value.asInstanceOf[js.Any])
  }
}
