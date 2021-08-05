package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var data: js.Array[Permissions]
}
object `6` {
  
  inline def apply(data: js.Array[Permissions]): `6` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setData(value: js.Array[Permissions]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Permissions*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
