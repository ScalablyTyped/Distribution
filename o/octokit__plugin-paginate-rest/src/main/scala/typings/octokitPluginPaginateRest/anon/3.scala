package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Allowmergecommit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var data: js.Array[Allowmergecommit]
}
object `3` {
  
  inline def apply(data: js.Array[Allowmergecommit]): `3` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setData(value: js.Array[Allowmergecommit]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Allowmergecommit*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
