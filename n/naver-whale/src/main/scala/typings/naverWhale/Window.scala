package typings.naverWhale

import typings.naverWhale.anon.Typeofwhale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var whale: Typeofwhale
}
object Window {
  
  inline def apply(whale: Typeofwhale): Window = {
    val __obj = js.Dynamic.literal(whale = whale.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setWhale(value: Typeofwhale): Self = StObject.set(x, "whale", value.asInstanceOf[js.Any])
  }
}
