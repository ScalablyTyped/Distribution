package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  var data: js.Array[Name]
}
object `11` {
  
  inline def apply(data: js.Array[Name]): `11` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setData(value: js.Array[Name]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Name*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
