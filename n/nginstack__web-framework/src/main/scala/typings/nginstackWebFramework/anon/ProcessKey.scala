package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessKey extends StObject {
  
  var name: String
  
  var processKey: Double
}
object ProcessKey {
  
  inline def apply(name: String, processKey: Double): ProcessKey = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], processKey = processKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessKey]
  }
  
  extension [Self <: ProcessKey](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProcessKey(value: Double): Self = StObject.set(x, "processKey", value.asInstanceOf[js.Any])
  }
}
