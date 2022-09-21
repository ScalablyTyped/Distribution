package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewportWidget
  extends StObject
     with WidgetBase
     with Widget {
  
  var `type`: viewport
  
  var viewport: js.UndefOr[Viewport] = js.undefined
}
object ViewportWidget {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): ViewportWidget = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("viewport")
    __obj.asInstanceOf[ViewportWidget]
  }
  
  extension [Self <: ViewportWidget](x: Self) {
    
    inline def setType(value: viewport): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
    
    inline def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
  }
}
