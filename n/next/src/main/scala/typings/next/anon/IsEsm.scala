package typings.next.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsEsm extends StObject {
  
  var isEsm: Unit
  
  var localRes: Any
  
  var res: Unit
}
object IsEsm {
  
  inline def apply(isEsm: Unit, localRes: Any, res: Unit): IsEsm = {
    val __obj = js.Dynamic.literal(isEsm = isEsm.asInstanceOf[js.Any], localRes = localRes.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsEsm]
  }
  
  extension [Self <: IsEsm](x: Self) {
    
    inline def setIsEsm(value: Unit): Self = StObject.set(x, "isEsm", value.asInstanceOf[js.Any])
    
    inline def setLocalRes(value: Any): Self = StObject.set(x, "localRes", value.asInstanceOf[js.Any])
    
    inline def setRes(value: Unit): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
  }
}
