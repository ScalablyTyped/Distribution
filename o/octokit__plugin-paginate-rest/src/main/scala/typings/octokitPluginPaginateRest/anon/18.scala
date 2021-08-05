package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Parents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var data: js.Array[Parents]
}
object `18` {
  
  inline def apply(data: js.Array[Parents]): `18` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  
  extension [Self <: `18`](x: Self) {
    
    inline def setData(value: js.Array[Parents]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Parents*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
