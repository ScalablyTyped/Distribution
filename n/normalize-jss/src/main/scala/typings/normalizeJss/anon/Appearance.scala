package typings.normalizeJss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Appearance extends js.Object {
  
  var appearance: String = js.native
  
  var font: String = js.native
}
object Appearance {
  
  @scala.inline
  def apply(appearance: String, font: String): Appearance = {
    val __obj = js.Dynamic.literal(appearance = appearance.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appearance]
  }
  
  @scala.inline
  implicit class AppearanceOps[Self <: Appearance] (val x: Self) extends AnyVal {
    
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
    def setAppearance(value: String): Self = this.set("appearance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFont(value: String): Self = this.set("font", value.asInstanceOf[js.Any])
  }
}
