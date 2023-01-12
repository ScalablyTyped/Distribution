package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllOwner extends StObject {
  
  var all: js.Array[Double]
  
  var owner: js.Array[Double]
}
object AllOwner {
  
  inline def apply(all: js.Array[Double], owner: js.Array[Double]): AllOwner = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllOwner]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllOwner] (val x: Self) extends AnyVal {
    
    inline def setAll(value: js.Array[Double]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    
    inline def setAllVarargs(value: Double*): Self = StObject.set(x, "all", js.Array(value*))
    
    inline def setOwner(value: js.Array[Double]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerVarargs(value: Double*): Self = StObject.set(x, "owner", js.Array(value*))
  }
}
