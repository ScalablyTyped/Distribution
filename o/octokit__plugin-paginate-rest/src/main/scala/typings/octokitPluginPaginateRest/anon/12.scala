package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Badgeurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `12` extends StObject {
  
  var data: js.Array[Badgeurl]
}
object `12` {
  
  inline def apply(data: js.Array[Badgeurl]): `12` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  extension [Self <: `12`](x: Self) {
    
    inline def setData(value: js.Array[Badgeurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Badgeurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
