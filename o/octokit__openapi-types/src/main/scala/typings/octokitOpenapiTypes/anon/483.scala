package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `483` extends StObject {
  
  var secrets: js.Array[CreatedatName]
  
  var total_count: Double
}
object `483` {
  
  inline def apply(secrets: js.Array[CreatedatName], total_count: Double): `483` = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`483`]
  }
  
  extension [Self <: `483`](x: Self) {
    
    inline def setSecrets(value: js.Array[CreatedatName]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsVarargs(value: CreatedatName*): Self = StObject.set(x, "secrets", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
