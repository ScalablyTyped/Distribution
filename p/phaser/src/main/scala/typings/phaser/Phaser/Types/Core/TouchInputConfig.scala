package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchInputConfig extends StObject {
  
  /**
    * Whether touch input events have preventDefault() called on them.
    */
  var capture: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Where the Touch Manager listens for touch input events. The default is the game canvas.
    */
  var target: js.UndefOr[Any] = js.undefined
}
object TouchInputConfig {
  
  inline def apply(): TouchInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TouchInputConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchInputConfig] (val x: Self) extends AnyVal {
    
    inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
