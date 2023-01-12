package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait F extends StObject {
  
  var f: Boolean
  
  var t: Boolean
  
  var valueOne: Null
  
  var valueTwo: Unit
}
object F {
  
  inline def apply(f: Boolean, t: Boolean, valueOne: Null, valueTwo: Unit): F = {
    val __obj = js.Dynamic.literal(f = f.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], valueOne = valueOne.asInstanceOf[js.Any], valueTwo = valueTwo.asInstanceOf[js.Any])
    __obj.asInstanceOf[F]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: F] (val x: Self) extends AnyVal {
    
    inline def setF(value: Boolean): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
    
    inline def setT(value: Boolean): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    inline def setValueOne(value: Null): Self = StObject.set(x, "valueOne", value.asInstanceOf[js.Any])
    
    inline def setValueTwo(value: Unit): Self = StObject.set(x, "valueTwo", value.asInstanceOf[js.Any])
  }
}
