package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devcontainers extends StObject {
  
  var devcontainers: js.Array[NamePath]
  
  var total_count: Double
}
object Devcontainers {
  
  inline def apply(devcontainers: js.Array[NamePath], total_count: Double): Devcontainers = {
    val __obj = js.Dynamic.literal(devcontainers = devcontainers.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devcontainers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Devcontainers] (val x: Self) extends AnyVal {
    
    inline def setDevcontainers(value: js.Array[NamePath]): Self = StObject.set(x, "devcontainers", value.asInstanceOf[js.Any])
    
    inline def setDevcontainersVarargs(value: NamePath*): Self = StObject.set(x, "devcontainers", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
