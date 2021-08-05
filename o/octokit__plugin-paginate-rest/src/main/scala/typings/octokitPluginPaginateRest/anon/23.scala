package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Organizationsurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `23` extends StObject {
  
  var data: js.Array[Organizationsurl]
}
object `23` {
  
  inline def apply(data: js.Array[Organizationsurl]): `23` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  extension [Self <: `23`](x: Self) {
    
    inline def setData(value: js.Array[Organizationsurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Organizationsurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
