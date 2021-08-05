package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Createdat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var data: js.Array[Createdat]
}
object `4` {
  
  inline def apply(data: js.Array[Createdat]): `4` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setData(value: js.Array[Createdat]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Createdat*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
