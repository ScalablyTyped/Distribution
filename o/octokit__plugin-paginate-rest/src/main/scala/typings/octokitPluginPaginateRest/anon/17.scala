package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Giturl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `17` extends StObject {
  
  var data: js.Array[Giturl]
}
object `17` {
  
  inline def apply(data: js.Array[Giturl]): `17` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`17`]
  }
  
  extension [Self <: `17`](x: Self) {
    
    inline def setData(value: js.Array[Giturl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Giturl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
