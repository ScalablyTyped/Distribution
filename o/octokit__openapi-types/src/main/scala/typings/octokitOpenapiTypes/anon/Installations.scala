package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Installations extends StObject {
  
  var installations: js.Array[Appslug]
  
  var total_count: Double
}
object Installations {
  
  inline def apply(installations: js.Array[Appslug], total_count: Double): Installations = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Installations]
  }
  
  extension [Self <: Installations](x: Self) {
    
    inline def setInstallations(value: js.Array[Appslug]): Self = StObject.set(x, "installations", value.asInstanceOf[js.Any])
    
    inline def setInstallationsVarargs(value: Appslug*): Self = StObject.set(x, "installations", js.Array(value*))
    
    inline def setTotal_count(value: Double): Self = StObject.set(x, "total_count", value.asInstanceOf[js.Any])
  }
}
