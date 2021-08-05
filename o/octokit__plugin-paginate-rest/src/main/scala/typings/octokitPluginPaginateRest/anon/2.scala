package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var data: js.Array[Default]
}
object `2` {
  
  inline def apply(data: js.Array[Default]): `2` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setData(value: js.Array[Default]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Default*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
