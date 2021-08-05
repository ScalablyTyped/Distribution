package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Runnersurl extends StObject {
  
  var default: Boolean
  
  var id: Double
  
  var name: String
  
  var runners_url: String
  
  var selected_organizations_url: String
  
  var visibility: String
}
object Runnersurl {
  
  inline def apply(
    default: Boolean,
    id: Double,
    name: String,
    runners_url: String,
    selected_organizations_url: String,
    visibility: String
  ): Runnersurl = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], runners_url = runners_url.asInstanceOf[js.Any], selected_organizations_url = selected_organizations_url.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[Runnersurl]
  }
  
  extension [Self <: Runnersurl](x: Self) {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRunners_url(value: String): Self = StObject.set(x, "runners_url", value.asInstanceOf[js.Any])
    
    inline def setSelected_organizations_url(value: String): Self = StObject.set(x, "selected_organizations_url", value.asInstanceOf[js.Any])
    
    inline def setVisibility(value: String): Self = StObject.set(x, "visibility", value.asInstanceOf[js.Any])
  }
}
