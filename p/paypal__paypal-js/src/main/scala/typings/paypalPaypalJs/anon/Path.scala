package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsStrings.remove
import typings.paypalPaypalJs.typesApisOrdersMod.UpdateOrderOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path
  extends StObject
     with UpdateOrderOperation {
  
  var op: remove
  
  var path: String
}
object Path {
  
  inline def apply(path: String): Path = {
    val __obj = js.Dynamic.literal(op = "remove", path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
    
    inline def setOp(value: remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
