package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromNumber extends StObject {
  
  var from: Double
}
object FromNumber {
  
  inline def apply(from: Double): FromNumber = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromNumber] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
  }
}
