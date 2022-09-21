package typings.pixiCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IRendererOptionsAuto
  extends StObject
     with IRendererOptions {
  
  var forceCanvas: js.UndefOr[Boolean] = js.undefined
}
object IRendererOptionsAuto {
  
  inline def apply(): IRendererOptionsAuto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRendererOptionsAuto]
  }
  
  extension [Self <: IRendererOptionsAuto](x: Self) {
    
    inline def setForceCanvas(value: Boolean): Self = StObject.set(x, "forceCanvas", value.asInstanceOf[js.Any])
    
    inline def setForceCanvasUndefined: Self = StObject.set(x, "forceCanvas", js.undefined)
  }
}
