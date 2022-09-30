package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECNamedCurve extends StObject {
  
  /**
    * The curve ASN.1 object identifier
    */
  var id: String
  
  /**
    * The name of the curve
    */
  var name: String
  
  /**
    * The coordinate length in bytes
    */
  var size: Double
}
object ECNamedCurve {
  
  inline def apply(id: String, name: String, size: Double): ECNamedCurve = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECNamedCurve]
  }
  
  extension [Self <: ECNamedCurve](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
