package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `788` extends StObject {
  
  var secrets: js.Array[SelectedrepositoriesurlUpdatedat]
  
  var total_count: Double
}
object `788` {
  
  inline def apply(secrets: js.Array[SelectedrepositoriesurlUpdatedat], total_count: Double): `788` = {
    val __obj = js.Dynamic.literal(secrets = secrets.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[`788`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `788`] (val x: Self) extends AnyVal {
    
    inline def setSecrets(value: js.Array[SelectedrepositoriesurlUpdatedat]): Self = StObject.set(x, "secrets", value.asInstanceOf[js.Any])
    
    inline def setSecretsVarargs(value: SelectedrepositoriesurlUpdatedat*): Self = StObject.set(x, "secrets", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
