package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossOrigin extends StObject {
  
  var crossOrigin: js.UndefOr[Boolean] = js.undefined
}
object CrossOrigin {
  
  inline def apply(): CrossOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossOrigin]
  }
  
  extension [Self <: CrossOrigin](x: Self) {
    
    inline def setCrossOrigin(value: Boolean): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
  }
}
