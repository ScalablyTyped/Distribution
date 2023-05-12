package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrgRunnerid extends StObject {
  
  @JSName("org")
  var org_ : String
  
  var runner_id: Double
}
object OrgRunnerid {
  
  inline def apply(org_ : String, runner_id: Double): OrgRunnerid = {
    val __obj = js.Dynamic.literal(runner_id = runner_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgRunnerid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrgRunnerid] (val x: Self) extends AnyVal {
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRunner_id(value: Double): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
  }
}
