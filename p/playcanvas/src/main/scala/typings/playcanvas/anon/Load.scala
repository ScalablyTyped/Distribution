package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Load extends StObject {
  
  var load: js.UndefOr[String] = js.undefined
  
  var original: js.UndefOr[String] = js.undefined
}
object Load {
  
  inline def apply(): Load = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Load]
  }
  
  extension [Self <: Load](x: Self) {
    
    inline def setLoad(value: String): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setOriginal(value: String): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setOriginalUndefined: Self = StObject.set(x, "original", js.undefined)
  }
}
