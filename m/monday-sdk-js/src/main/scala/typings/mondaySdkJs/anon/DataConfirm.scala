package typings.mondaySdkJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataConfirm extends StObject {
  
  var data: Confirm
}
object DataConfirm {
  
  inline def apply(data: Confirm): DataConfirm = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataConfirm]
  }
  
  extension [Self <: DataConfirm](x: Self) {
    
    inline def setData(value: Confirm): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
