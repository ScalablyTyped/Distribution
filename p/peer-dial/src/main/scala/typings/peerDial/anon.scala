package typings.peerDial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Icon extends StObject {
    
    var icon: js.Object
  }
  object Icon {
    
    inline def apply(icon: js.Object): Icon = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Icon]
    }
    
    extension [Self <: Icon](x: Self) {
      
      inline def setIcon(value: js.Object): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
}
