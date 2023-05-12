package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceAndAppManagementData extends StObject {
  
  // Not yet documented
  var content: js.UndefOr[NullableOption[Any]] = js.undefined
}
object DeviceAndAppManagementData {
  
  inline def apply(): DeviceAndAppManagementData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceAndAppManagementData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeviceAndAppManagementData] (val x: Self) extends AnyVal {
    
    inline def setContent(value: NullableOption[Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
