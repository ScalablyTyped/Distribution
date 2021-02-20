package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenX extends StObject {
  
  var screenX: Double = js.native
  
  var screenY: Double = js.native
}
object ScreenX {
  
  @scala.inline
  def apply(screenX: Double, screenY: Double): ScreenX = {
    val __obj = js.Dynamic.literal(screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenX]
  }
  
  @scala.inline
  implicit class ScreenXMutableBuilder[Self <: ScreenX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
  }
}
