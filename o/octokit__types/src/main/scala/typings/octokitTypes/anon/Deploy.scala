package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deploy extends StObject {
  
  var deploy: String
}
object Deploy {
  
  inline def apply(deploy: String): Deploy = {
    val __obj = js.Dynamic.literal(deploy = deploy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deploy]
  }
  
  extension [Self <: Deploy](x: Self) {
    
    inline def setDeploy(value: String): Self = StObject.set(x, "deploy", value.asInstanceOf[js.Any])
  }
}
