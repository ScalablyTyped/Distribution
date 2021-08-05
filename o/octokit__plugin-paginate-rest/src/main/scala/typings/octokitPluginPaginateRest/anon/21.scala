package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Defaultbranch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var data: js.Array[Defaultbranch]
}
object `21` {
  
  inline def apply(data: js.Array[Defaultbranch]): `21` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  
  extension [Self <: `21`](x: Self) {
    
    inline def setData(value: js.Array[Defaultbranch]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Defaultbranch*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
