package typings.opentok.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenOptions extends StObject {
  
  var data: js.UndefOr[String] = js.undefined
  
  var expireTime: js.UndefOr[Double] = js.undefined
  
  var initialLayoutClassList: js.UndefOr[js.Array[String]] = js.undefined
  
  var role: js.UndefOr[Role] = js.undefined
}
object TokenOptions {
  
  inline def apply(): TokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TokenOptions]
  }
  
  extension [Self <: TokenOptions](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setExpireTime(value: Double): Self = StObject.set(x, "expireTime", value.asInstanceOf[js.Any])
    
    inline def setExpireTimeUndefined: Self = StObject.set(x, "expireTime", js.undefined)
    
    inline def setInitialLayoutClassList(value: js.Array[String]): Self = StObject.set(x, "initialLayoutClassList", value.asInstanceOf[js.Any])
    
    inline def setInitialLayoutClassListUndefined: Self = StObject.set(x, "initialLayoutClassList", js.undefined)
    
    inline def setInitialLayoutClassListVarargs(value: String*): Self = StObject.set(x, "initialLayoutClassList", js.Array(value*))
    
    inline def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
