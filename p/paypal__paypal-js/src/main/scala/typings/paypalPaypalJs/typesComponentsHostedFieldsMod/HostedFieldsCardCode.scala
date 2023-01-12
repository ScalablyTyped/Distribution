package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsCardCode extends StObject {
  
  var name: String
  
  var size: Double
}
object HostedFieldsCardCode {
  
  inline def apply(name: String, size: Double): HostedFieldsCardCode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsCardCode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostedFieldsCardCode] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
