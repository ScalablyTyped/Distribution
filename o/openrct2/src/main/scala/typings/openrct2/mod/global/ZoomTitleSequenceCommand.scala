package typings.openrct2.mod.global

import typings.openrct2.openrct2Strings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomTitleSequenceCommand
  extends StObject
     with TitleSequenceCommand {
  
  var `type`: zoom
  
  var zoom: Double
}
object ZoomTitleSequenceCommand {
  
  inline def apply(zoom: Double): ZoomTitleSequenceCommand = {
    val __obj = js.Dynamic.literal(zoom = zoom.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("zoom")
    __obj.asInstanceOf[ZoomTitleSequenceCommand]
  }
  
  extension [Self <: ZoomTitleSequenceCommand](x: Self) {
    
    inline def setType(value: zoom): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
