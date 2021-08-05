package typings.pkcs11js.Pkcs11Js

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Crypto parameters
trait IParams extends StObject {
  
  /**
    * Type of crypto param. Uses constants CK_PARAMS_*
    *
    * @type {number}
    */
  var `type`: Double
}
object IParams {
  
  inline def apply(`type`: Double): IParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParams]
  }
  
  extension [Self <: IParams](x: Self) {
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
