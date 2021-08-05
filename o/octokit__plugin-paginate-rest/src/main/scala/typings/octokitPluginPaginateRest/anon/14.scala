package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.After
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var data: js.Array[After]
}
object `14` {
  
  inline def apply(data: js.Array[After]): `14` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setData(value: js.Array[After]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: After*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
