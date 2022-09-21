package typings.phaser.Phaser.Types.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseInputConfig extends StObject {
  
  /**
    * If `true` the DOM `mousedown` event will have `preventDefault` set.
    */
  var preventDefaultDown: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true` the DOM `mousemove` event will have `preventDefault` set.
    */
  var preventDefaultMove: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true` the DOM `mouseup` event will have `preventDefault` set.
    */
  var preventDefaultUp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true` the DOM `wheel` event will have `preventDefault` set.
    */
  var preventDefaultWheel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Where the Mouse Manager listens for mouse input events. The default is the game canvas.
    */
  var target: js.UndefOr[Any] = js.undefined
}
object MouseInputConfig {
  
  inline def apply(): MouseInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseInputConfig]
  }
  
  extension [Self <: MouseInputConfig](x: Self) {
    
    inline def setPreventDefaultDown(value: Boolean): Self = StObject.set(x, "preventDefaultDown", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultDownUndefined: Self = StObject.set(x, "preventDefaultDown", js.undefined)
    
    inline def setPreventDefaultMove(value: Boolean): Self = StObject.set(x, "preventDefaultMove", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultMoveUndefined: Self = StObject.set(x, "preventDefaultMove", js.undefined)
    
    inline def setPreventDefaultUp(value: Boolean): Self = StObject.set(x, "preventDefaultUp", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUpUndefined: Self = StObject.set(x, "preventDefaultUp", js.undefined)
    
    inline def setPreventDefaultWheel(value: Boolean): Self = StObject.set(x, "preventDefaultWheel", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultWheelUndefined: Self = StObject.set(x, "preventDefaultWheel", js.undefined)
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
