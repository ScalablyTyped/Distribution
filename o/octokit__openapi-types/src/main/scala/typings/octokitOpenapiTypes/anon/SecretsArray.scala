package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecretsArray extends StObject {
  
  var secrets: js.Array[Visibility]
  
  var total_count: Double
}
object SecretsArray {
  
  inline def apply(secrets: js.Array[Visibility], total_count: Double): SecretsArray = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecretsArray]
  }
  
  extension [Self <: SecretsArray](x: Self) {
    
    inline def setSecrets(value: js.Array[Visibility]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsVarargs(value: Visibility*): Self = StObject.set(x, "secrets", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
