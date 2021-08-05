package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Account
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `24` extends StObject {
  
  var data: js.Array[Account]
}
object `24` {
  
  inline def apply(data: js.Array[Account]): `24` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`24`]
  }
  
  extension [Self <: `24`](x: Self) {
    
    inline def setData(value: js.Array[Account]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Account*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
