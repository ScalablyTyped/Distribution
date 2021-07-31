package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseInputConfig extends StObject {
  
  /**
    * Whether mouse input events have `preventDefault` called on them.
    */
  var capture: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Where the Mouse Manager listens for mouse input events. The default is the game canvas.
    */
  var target: js.UndefOr[js.Any] = js.undefined
}
object MouseInputConfig {
  
  @scala.inline
  def apply(): MouseInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseInputConfig]
  }
  
  @scala.inline
  implicit class MouseInputConfigMutableBuilder[Self <: MouseInputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
