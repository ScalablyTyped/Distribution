package typings.pixiJs.anon

import typings.pixiJs.PIXI.SCALE_MODES
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleMode extends StObject {
  
  var scaleMode: js.UndefOr[SCALE_MODES] = js.undefined
}
object ScaleMode {
  
  inline def apply(): ScaleMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScaleMode]
  }
  
  extension [Self <: ScaleMode](x: Self) {
    
    inline def setScaleMode(value: SCALE_MODES): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
    
    inline def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
  }
}
