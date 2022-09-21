package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderTargetCreationTime extends StObject {
  
  var renderTargetCreationTime: Double
}
object RenderTargetCreationTime {
  
  inline def apply(renderTargetCreationTime: Double): RenderTargetCreationTime = {
    val __obj = js.Dynamic.literal(renderTargetCreationTime = renderTargetCreationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderTargetCreationTime]
  }
  
  extension [Self <: RenderTargetCreationTime](x: Self) {
    
    inline def setRenderTargetCreationTime(value: Double): Self = StObject.set(x, "renderTargetCreationTime", value.asInstanceOf[js.Any])
  }
}
