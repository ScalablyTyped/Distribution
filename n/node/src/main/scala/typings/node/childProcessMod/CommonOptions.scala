package typings.node.childProcessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonOptions
  extends StObject
     with ProcessEnvOptions {
  
  /**
    * @default 0
    */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /**
    * @default false
    */
  var windowsHide: js.UndefOr[Boolean] = js.undefined
}
object CommonOptions {
  
  inline def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CommonOptions] (val x: Self) extends AnyVal {
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWindowsHide(value: Boolean): Self = StObject.set(x, "windowsHide", value.asInstanceOf[js.Any])
    
    inline def setWindowsHideUndefined: Self = StObject.set(x, "windowsHide", js.undefined)
  }
}
