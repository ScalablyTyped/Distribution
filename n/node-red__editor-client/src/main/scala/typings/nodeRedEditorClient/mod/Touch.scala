package typings.nodeRedEditorClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Touch extends StObject {
  
  var radialMenu: TouchRadialMenu = js.native
}
object Touch {
  
  @scala.inline
  def apply(radialMenu: TouchRadialMenu): Touch = {
    val __obj = js.Dynamic.literal(radialMenu = radialMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[Touch]
  }
  
  @scala.inline
  implicit class TouchMutableBuilder[Self <: Touch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRadialMenu(value: TouchRadialMenu): Self = StObject.set(x, "radialMenu", value.asInstanceOf[js.Any])
  }
}
