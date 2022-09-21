package typings.nginstackWebFramework.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseRawData extends StObject {
  
  var name: String
  
  var processKey: Double
  
  var useRawData: Boolean
}
object UseRawData {
  
  inline def apply(name: String, processKey: Double, useRawData: Boolean): UseRawData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], processKey = processKey.asInstanceOf[js.Any], useRawData = useRawData.asInstanceOf[js.Any])
    __obj.asInstanceOf[UseRawData]
  }
  
  extension [Self <: UseRawData](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProcessKey(value: Double): Self = StObject.set(x, "processKey", value.asInstanceOf[js.Any])
    
    inline def setUseRawData(value: Boolean): Self = StObject.set(x, "useRawData", value.asInstanceOf[js.Any])
  }
}
