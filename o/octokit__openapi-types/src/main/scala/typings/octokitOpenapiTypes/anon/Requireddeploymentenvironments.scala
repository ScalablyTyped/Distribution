package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Requireddeploymentenvironments extends StObject {
  
  /** @description The environments that must be successfully deployed to before branches can be merged. */
  var required_deployment_environments: js.Array[String]
}
object Requireddeploymentenvironments {
  
  inline def apply(required_deployment_environments: js.Array[String]): Requireddeploymentenvironments = {
    val __obj = js.Dynamic.literal(required_deployment_environments = required_deployment_environments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Requireddeploymentenvironments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Requireddeploymentenvironments] (val x: Self) extends AnyVal {
    
    inline def setRequired_deployment_environments(value: js.Array[String]): Self = StObject.set(x, "required_deployment_environments", value.asInstanceOf[js.Any])
    
    inline def setRequired_deployment_environmentsVarargs(value: String*): Self = StObject.set(x, "required_deployment_environments", js.Array(value*))
  }
}
