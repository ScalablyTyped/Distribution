package typings.mondaySdkJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  var instance: GetItem
}
object Instance {
  
  inline def apply(instance: GetItem): Instance = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setInstance(value: GetItem): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
  }
}
