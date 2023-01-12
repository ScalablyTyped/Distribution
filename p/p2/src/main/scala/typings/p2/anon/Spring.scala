package typings.p2.anon

import typings.p2.p2Strings.addSpring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spring extends StObject {
  
  var spring: typings.p2.mod.Spring
  
  var `type`: addSpring
}
object Spring {
  
  inline def apply(spring: typings.p2.mod.Spring): Spring = {
    val __obj = js.Dynamic.literal(spring = spring.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("addSpring")
    __obj.asInstanceOf[Spring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Spring] (val x: Self) extends AnyVal {
    
    inline def setSpring(value: typings.p2.mod.Spring): Self = StObject.set(x, "spring", value.asInstanceOf[js.Any])
    
    inline def setType(value: addSpring): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
