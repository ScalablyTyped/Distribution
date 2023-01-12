package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpriteComponentData extends StObject {
  
  var enabled: Boolean
}
object SpriteComponentData {
  
  inline def apply(enabled: Boolean): SpriteComponentData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpriteComponentData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpriteComponentData] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
