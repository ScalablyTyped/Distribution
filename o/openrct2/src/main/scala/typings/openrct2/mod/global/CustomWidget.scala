package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomWidget
  extends StObject
     with WidgetBase
     with Widget {
  
  var onDraw: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* g */ GraphicsContext, Unit]] = js.undefined
  
  var `type`: custom
}
object CustomWidget {
  
  inline def apply(height: Double, width: Double, x: Double, y: Double): CustomWidget = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("custom")
    __obj.asInstanceOf[CustomWidget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomWidget] (val x: Self) extends AnyVal {
    
    inline def setOnDraw(value: js.ThisFunction1[CustomWidget, /* g */ GraphicsContext, Unit]): Self = StObject.set(x, "onDraw", value.asInstanceOf[js.Any])
    
    inline def setOnDrawUndefined: Self = StObject.set(x, "onDraw", js.undefined)
    
    inline def setType(value: custom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
