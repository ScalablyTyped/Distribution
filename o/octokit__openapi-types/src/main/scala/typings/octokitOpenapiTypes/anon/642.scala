package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `642` extends StObject {
  
  var secrets: js.Array[NameUpdatedat]
  
  var total_count: Double
}
object `642` {
  
  inline def apply(secrets: js.Array[NameUpdatedat], total_count: Double): `642` = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`642`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `642`] (val x: Self) extends AnyVal {
    
    inline def setSecrets(value: js.Array[NameUpdatedat]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsVarargs(value: NameUpdatedat*): Self = StObject.set(x, "secrets", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
