package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `600` extends StObject {
  
  var secrets: js.Array[NameSelectedrepositoriesurl]
  
  var total_count: Double
}
object `600` {
  
  inline def apply(secrets: js.Array[NameSelectedrepositoriesurl], total_count: Double): `600` = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`600`]
  }
  
  extension [Self <: `600`](x: Self) {
    
    inline def setSecrets(value: js.Array[NameSelectedrepositoriesurl]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsVarargs(value: NameSelectedrepositoriesurl*): Self = StObject.set(x, "secrets", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
