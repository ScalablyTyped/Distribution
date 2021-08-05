package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideTabBarArgs
  extends StObject
     with AsyncCallback[Unit] {
  
  /**
    * Need animation effect or not, none by default.
    */
  var animation: js.UndefOr[Boolean] = js.undefined
}
object HideTabBarArgs {
  
  inline def apply(): HideTabBarArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideTabBarArgs]
  }
  
  extension [Self <: HideTabBarArgs](x: Self) {
    
    inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
  }
}
