package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalRes extends StObject {
  
  var isEsm: Boolean
  
  var localRes: Unit
  
  var res: String | Null
}
object LocalRes {
  
  inline def apply(isEsm: Boolean, localRes: Unit): LocalRes = {
    val __obj = js.Dynamic.literal(isEsm = isEsm.asInstanceOf[js.Any], localRes = localRes.asInstanceOf[js.Any], res = null)
    __obj.asInstanceOf[LocalRes]
  }
  
  extension [Self <: LocalRes](x: Self) {
    
    inline def setIsEsm(value: Boolean): Self = StObject.set(x, "isEsm", value.asInstanceOf[js.Any])
    
    inline def setLocalRes(value: Unit): Self = StObject.set(x, "localRes", value.asInstanceOf[js.Any])
    
    inline def setRes(value: String): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
    
    inline def setResNull: Self = StObject.set(x, "res", null)
  }
}
