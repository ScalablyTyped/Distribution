package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `578` extends StObject {
  
  var secrets: js.Array[NameSelectedrepositoriesurl]
  
  var total_count: Double
}
object `578` {
  
  inline def apply(secrets: js.Array[NameSelectedrepositoriesurl], total_count: Double): `578` = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`578`]
  }
  
  extension [Self <: `578`](x: Self) {
    
    inline def setSecrets(value: js.Array[NameSelectedrepositoriesurl]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsVarargs(value: NameSelectedrepositoriesurl*): Self = StObject.set(x, "secrets", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
