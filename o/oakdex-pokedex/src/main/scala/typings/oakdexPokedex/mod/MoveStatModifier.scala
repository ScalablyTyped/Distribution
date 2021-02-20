package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MoveStatModifier extends StObject {
  
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
  implicit class MoveStatModifierMutableBuilder[Self <: MoveStatModifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffects_user(value: Boolean): Self = StObject.set(x, "affects_user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffects_userUndefined: Self = StObject.set(x, "affects_user", js.undefined)
    
    @scala.inline
    def setChange_by(value: Double): Self = StObject.set(x, "change_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStat(value: String): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
  }
}
