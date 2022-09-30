package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeContentsArray extends StObject {
  
  var safeContents: js.Array[Any]
}
object SafeContentsArray {
  
  inline def apply(safeContents: js.Array[Any]): SafeContentsArray = {
    val __obj = js.Dynamic.literal(safeContents = safeContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeContentsArray]
  }
  
  extension [Self <: SafeContentsArray](x: Self) {
    
    inline def setSafeContents(value: js.Array[Any]): Self = StObject.set(x, "safeContents", value.asInstanceOf[js.Any])
    
    inline def setSafeContentsVarargs(value: Any*): Self = StObject.set(x, "safeContents", js.Array(value*))
  }
}
