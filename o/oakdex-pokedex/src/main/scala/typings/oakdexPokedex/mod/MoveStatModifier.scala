package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveStatModifier extends js.Object {
  
  var affects_user: js.UndefOr[Boolean] = js.native
  
  var change_by: Double = js.native
  
  var stat: String = js.native
}
object MoveStatModifier {
  
  @scala.inline
  def apply(change_by: Double, stat: String): MoveStatModifier = {
    val __obj = js.Dynamic.literal(change_by = change_by.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveStatModifier]
  }
  
  @scala.inline
  implicit class MoveStatModifierOps[Self <: MoveStatModifier] (val x: Self) extends AnyVal {
    
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
    def setChange_by(value: Double): Self = this.set("change_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(value: String): Self = this.set("stat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffects_user(value: Boolean): Self = this.set("affects_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffects_user: Self = this.set("affects_user", js.undefined)
  }
}
