package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HideTabBarArgs extends AsyncCallback[Unit] {
  
  /**
    * Need animation effect or not, none by default.
    */
  var animation: js.UndefOr[Boolean] = js.native
}
object HideTabBarArgs {
  
  @scala.inline
  def apply(): HideTabBarArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideTabBarArgs]
  }
  
  @scala.inline
  implicit class HideTabBarArgsMutableBuilder[Self <: HideTabBarArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
  }
}
