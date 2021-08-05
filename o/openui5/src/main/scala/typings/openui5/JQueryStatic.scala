package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var sap: JquerySap
}
object JQueryStatic {
  
  inline def apply(sap: JquerySap): JQueryStatic = {
    val __obj = js.Dynamic.literal(sap = sap.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setSap(value: JquerySap): Self = StObject.set(x, "sap", value.asInstanceOf[js.Any])
  }
}
