package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19` extends StObject {
  
  var data: js.Array[Labels]
}
object `19` {
  
  inline def apply(data: js.Array[Labels]): `19` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  
  extension [Self <: `19`](x: Self) {
    
    inline def setData(value: js.Array[Labels]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Labels*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
