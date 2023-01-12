package typings.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoveStatModifier extends StObject {
  
  var affects_user: js.UndefOr[Boolean] = js.undefined
  
  var change_by: Double
  
  var stat: String
}
object MoveStatModifier {
  
  inline def apply(change_by: Double, stat: String): MoveStatModifier = {
    val __obj = js.Dynamic.literal(change_by = change_by.asInstanceOf[js.Any], stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[MoveStatModifier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoveStatModifier] (val x: Self) extends AnyVal {
    
    inline def setAffects_user(value: Boolean): Self = StObject.set(x, "affects_user", value.asInstanceOf[js.Any])
    
    inline def setAffects_userUndefined: Self = StObject.set(x, "affects_user", js.undefined)
    
    inline def setChange_by(value: Double): Self = StObject.set(x, "change_by", value.asInstanceOf[js.Any])
    
    inline def setStat(value: String): Self = StObject.set(x, "stat", value.asInstanceOf[js.Any])
  }
}
