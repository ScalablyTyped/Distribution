package typings.prettier.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Negate extends StObject {
  
  var groupId: js.Symbol
  
  var negate: js.UndefOr[Boolean] = js.undefined
}
object Negate {
  
  inline def apply(groupId: js.Symbol): Negate = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Negate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Negate] (val x: Self) extends AnyVal {
    
    inline def setGroupId(value: js.Symbol): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setNegate(value: Boolean): Self = StObject.set(x, "negate", value.asInstanceOf[js.Any])
    
    inline def setNegateUndefined: Self = StObject.set(x, "negate", js.undefined)
  }
}
