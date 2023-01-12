package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AUndefined extends StObject {
  
  var a: Unit
}
object AUndefined {
  
  inline def apply(a: Unit): AUndefined = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUndefined]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AUndefined] (val x: Self) extends AnyVal {
    
    inline def setA(value: Unit): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
  }
}
