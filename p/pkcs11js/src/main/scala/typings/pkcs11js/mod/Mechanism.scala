package typings.pkcs11js.mod

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A structure that specifies a particular mechanism and any parameters it requires
  */
trait Mechanism extends StObject {
  
  /**
    * The type of mechanism
    */
  var mechanism: Double
  
  /**
    * The parameter if required by the mechanism
    */
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
