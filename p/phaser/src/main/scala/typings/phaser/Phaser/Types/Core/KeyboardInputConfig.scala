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
  
  inline def apply(): KeyboardInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyboardInputConfig]
  }
  
  extension [Self <: KeyboardInputConfig](x: Self) {
    
    inline def setCapture(value: js.Array[integer]): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
    
    inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
    
    inline def setCaptureVarargs(value: integer*): Self = StObject.set(x, "capture", js.Array(value :_*))
    
    inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
