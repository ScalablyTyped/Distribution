package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pad extends StObject {
  
  var pad: js.UndefOr[js.Any] = js.undefined
}
object Pad {
  
  inline def apply(): Pad = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pad]
  }
  
  extension [Self <: Pad](x: Self) {
    
    inline def setPad(value: js.Any): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
