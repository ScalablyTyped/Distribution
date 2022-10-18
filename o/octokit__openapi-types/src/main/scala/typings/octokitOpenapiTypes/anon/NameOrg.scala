package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameOrg extends StObject {
  
  /** The name of a self-hosted runner's custom label. */
  var name: String
  
  /** The organization name. The name is not case sensitive. */
  @JSName("org")
  var org_ : String
  
  /** Unique identifier of the self-hosted runner. */
  var runner_id: Double
}
object NameOrg {
  
  inline def apply(name: String, org_ : String, runner_id: Double): NameOrg = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], runner_id = runner_id.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameOrg]
  }
  
  extension [Self <: NameOrg](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
    
    inline def setRunner_id(value: Double): Self = StObject.set(x, "runner_id", value.asInstanceOf[js.Any])
  }
}
