package typings.phaser.Phaser.Types.Core

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardInputConfig extends StObject {
  
  /**
    * `preventDefault` will be called on every non-modified key which has a key code in this array. By default it is empty.
    */
  var capture: js.UndefOr[js.Array[integer]] = js.undefined
  
  /**
    * Where the Keyboard Manager listens for keyboard input events.
    */
  var target: js.UndefOr[js.Any] = js.undefined
}
object KeyboardInputConfig {
  
  @scala.inline
  def apply(): KeyboardInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardInputConfig]
  }
  
  @scala.inline
  implicit class KeyboardInputConfigMutableBuilder[Self <: KeyboardInputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapture(value: js.Array[integer]): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    @scala.inline
    def setCaptureVarargs(value: integer*): Self = StObject.set(x, "capture", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
