package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Touch extends StObject {
  
  var radialMenu: TouchRadialMenu
}
object Touch {
  
  inline def apply(radialMenu: TouchRadialMenu): Touch = {
    val __obj = js.Dynamic.literal(radialMenu = radialMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch]
  }
  
  extension [Self <: Touch](x: Self) {
    
    inline def setRadialMenu(value: TouchRadialMenu): Self = StObject.set(x, "radialMenu", value.asInstanceOf[js.Any])
  }
}
