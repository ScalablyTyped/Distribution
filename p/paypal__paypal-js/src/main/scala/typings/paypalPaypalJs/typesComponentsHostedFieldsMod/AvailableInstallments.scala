package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailableInstallments extends StObject {
  
  var configuration_owner_account: String
  
  var financing_options: js.Array[Record[String, Any]]
}
object AvailableInstallments {
  
  inline def apply(configuration_owner_account: String, financing_options: js.Array[Record[String, Any]]): AvailableInstallments = {
    val __obj = js.Dynamic.literal(configuration_owner_account = configuration_owner_account.asInstanceOf[js.Any], financing_options = financing_options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailableInstallments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailableInstallments] (val x: Self) extends AnyVal {
    
    inline def setConfiguration_owner_account(value: String): Self = StObject.set(x, "configuration_owner_account", value.asInstanceOf[js.Any])
    
    inline def setFinancing_options(value: js.Array[Record[String, Any]]): Self = StObject.set(x, "financing_options", value.asInstanceOf[js.Any])
    
    inline def setFinancing_optionsVarargs(value: (Record[String, Any])*): Self = StObject.set(x, "financing_options", js.Array(value*))
  }
}
