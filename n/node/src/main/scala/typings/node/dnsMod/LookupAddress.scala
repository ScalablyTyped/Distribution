package typings.node.dnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupAddress extends StObject {
  
  var address: String = js.native
  
  var family: Double = js.native
}
object LookupAddress {
  
  @scala.inline
  def apply(address: String, family: Double): LookupAddress = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], family = family.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupAddress]
  }
  
  @scala.inline
  implicit class LookupAddressMutableBuilder[Self <: LookupAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
  }
}
