package typings.parse5.distCommonTokenMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenBase extends StObject {
  
  var location: Location | Null
  
  val `type`: TokenType
}
object TokenBase {
  
  inline def apply(`type`: TokenType): TokenBase = {
    val __obj = js.Dynamic.literal(location = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenBase] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setType(value: TokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
