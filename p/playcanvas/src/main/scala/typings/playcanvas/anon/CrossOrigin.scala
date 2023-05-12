package typings.playcanvas.anon

import typings.playcanvas.playcanvasStrings.`use-credentials`
import typings.playcanvas.playcanvasStrings.anonymous
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossOrigin extends StObject {
  
  var crossOrigin: js.UndefOr[anonymous | `use-credentials` | Null] = js.undefined
}
object CrossOrigin {
  
  inline def apply(): CrossOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossOrigin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrossOrigin] (val x: Self) extends AnyVal {
    
    inline def setCrossOrigin(value: anonymous | `use-credentials`): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
  }
}
