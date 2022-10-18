package typings.paypalPaypalJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /** The portable international postal address. */
  var address: typings.paypalPaypalJs.typesApisCommonsMod.Address
  
  /** The name of the party. */
  var name: js.UndefOr[Fullname] = js.undefined
  
  /**
    * An array of shipping options that the payee or merchant offers to the payer to ship or pick up their items.
    * @maxItems 10
    */
  var options: js.UndefOr[js.Array[Amount]] = js.undefined
  
  /** The method by which the payer wants to get their items from the payee e.g shipping,
    * in-person pickup. Either type or options but not both may be present. */
  var `type`: js.UndefOr[String] = js.undefined
}
object Address {
  
  inline def apply(address: typings.paypalPaypalJs.typesApisCommonsMod.Address): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  
  extension [Self <: Address](x: Self) {
    
    inline def setAddress(value: typings.paypalPaypalJs.typesApisCommonsMod.Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setName(value: Fullname): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOptions(value: js.Array[Amount]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: Amount*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
