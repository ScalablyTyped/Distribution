package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Advisory extends StObject {
  
  var data: Any
  
  var kind: AdvisoryKind
}
object Advisory {
  
  inline def apply(data: Any, kind: AdvisoryKind): Advisory = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Advisory]
  }
  
  extension [Self <: Advisory](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setKind(value: AdvisoryKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
