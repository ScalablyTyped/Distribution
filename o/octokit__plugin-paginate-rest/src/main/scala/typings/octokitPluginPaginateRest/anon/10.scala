package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Checkrunurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  var data: js.Array[Checkrunurl]
}
object `10` {
  
  inline def apply(data: js.Array[Checkrunurl]): `10` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setData(value: js.Array[Checkrunurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Checkrunurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
