package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsCardTypeData extends StObject {
  
  var eligible: Boolean
  
  var valuable: Boolean
}
object HostedFieldsCardTypeData {
  
  inline def apply(eligible: Boolean, valuable: Boolean): HostedFieldsCardTypeData = {
    val __obj = js.Dynamic.literal(eligible = eligible.asInstanceOf[js.Any], valuable = valuable.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsCardTypeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostedFieldsCardTypeData] (val x: Self) extends AnyVal {
    
    inline def setEligible(value: Boolean): Self = StObject.set(x, "eligible", value.asInstanceOf[js.Any])
    
    inline def setValuable(value: Boolean): Self = StObject.set(x, "valuable", value.asInstanceOf[js.Any])
  }
}
