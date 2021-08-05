package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mechanism extends StObject {
  
  var mechanism: Double
  
  var parameter: js.UndefOr[Buffer | IParams] = js.undefined
}
object Mechanism {
  
  inline def apply(mechanism: Double): Mechanism = {
    val __obj = js.Dynamic.literal(mechanism = mechanism.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mechanism]
  }
  
  extension [Self <: Mechanism](x: Self) {
    
    inline def setMechanism(value: Double): Self = StObject.set(x, "mechanism", value.asInstanceOf[js.Any])
    
    inline def setParameter(value: Buffer | IParams): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
  }
}
