package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameOrgRunnerid extends StObject {
  
  var name: String
  
  @JSName("org")
  var org_ : String
  
  var runner_id: Double
}
object NameOrgRunnerid {
  
  inline def apply(name: String, org_ : String, runner_id: Double): NameOrgRunnerid = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameOrgRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NameOrgRunnerid] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRunner_id(value: Double): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
  }
}
