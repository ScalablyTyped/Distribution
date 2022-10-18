package typings.nextSeo.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Place
  extends StObject
     with Location {
  
  var address: Address
  
  var name: String
  
  var sameAs: js.UndefOr[String] = js.undefined
}
object Place {
  
  inline def apply(address: Address, name: String): Place = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Place]
  }
  
  extension [Self <: Place](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSameAs(value: String): Self = StObject.set(x, "sameAs", value.asInstanceOf[js.Any])
    
    inline def setSameAsUndefined: Self = StObject.set(x, "sameAs", js.undefined)
  }
}
