package typings.openui5.anon

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ATypes extends StObject {
  
  var aTypes: js.Array[String]
  
  def fnCheck(p1: Event): Boolean
  
  var sName: String
}
object ATypes {
  
  inline def apply(aTypes: js.Array[String], fnCheck: Event => Boolean, sName: String): ATypes = {
    val __obj = js.Dynamic.literal(aTypes = aTypes.asInstanceOf[js.Any], fnCheck = js.Any.fromFunction1(fnCheck), sName = sName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ATypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ATypes] (val x: Self) extends AnyVal {
    
    inline def setATypes(value: js.Array[String]): Self = StObject.set(x, "aTypes", value.asInstanceOf[js.Any])
    
    inline def setATypesVarargs(value: String*): Self = StObject.set(x, "aTypes", js.Array(value*))
    
    inline def setFnCheck(value: Event => Boolean): Self = StObject.set(x, "fnCheck", js.Any.fromFunction1(value))
    
    inline def setSName(value: String): Self = StObject.set(x, "sName", value.asInstanceOf[js.Any])
  }
}
