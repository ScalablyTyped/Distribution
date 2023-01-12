package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallationsTotalcount extends StObject {
  
  var installations: js.Array[Contactemail]
  
  var total_count: Double
}
object InstallationsTotalcount {
  
  inline def apply(installations: js.Array[Contactemail], total_count: Double): InstallationsTotalcount = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallationsTotalcount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallationsTotalcount] (val x: Self) extends AnyVal {
    
    inline def setInstallations(value: js.Array[Contactemail]): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
    
    inline def setInstallationsVarargs(value: Contactemail*): Self = StObject.set(x, "installations", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
