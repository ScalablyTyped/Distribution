package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.h
import typings.plotlyJs.plotlyJsStrings.v
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModeBar extends StObject {
  
  var activecolor: Color
  
  var add: ModeBarDefaultButtons | js.Array[ModeBarDefaultButtons]
  
  var bgcolor: Color
  
  var color: Color
  
  var orientation: v | h
  
  var remove: ModeBarDefaultButtons | js.Array[ModeBarDefaultButtons]
  
  var uirevision: Double | String
}
object ModeBar {
  
  inline def apply(
    activecolor: Color,
    add: ModeBarDefaultButtons | js.Array[ModeBarDefaultButtons],
    bgcolor: Color,
    color: Color,
    orientation: v | h,
    remove: ModeBarDefaultButtons | js.Array[ModeBarDefaultButtons],
    uirevision: Double | String
  ): ModeBar = {
    val __obj = js.Dynamic.literal(activecolor = activecolor.asInstanceOf[js.Any], add = add.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], uirevision = uirevision.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeBar]
  }
  
  extension [Self <: ModeBar](x: Self) {
    
    inline def setActivecolor(value: Color): Self = StObject.set(x, "activecolor", value.asInstanceOf[js.Any])
    
    inline def setActivecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "activecolor", js.Array(value*))
    
    inline def setAdd(value: ModeBarDefaultButtons | js.Array[ModeBarDefaultButtons]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddVarargs(value: ModeBarDefaultButtons*): Self = StObject.set(x, "add", js.Array(value*))
    
    inline def setBgcolor(value: Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setOrientation(value: v | h): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: ModeBarDefaultButtons | js.Array[ModeBarDefaultButtons]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveVarargs(value: ModeBarDefaultButtons*): Self = StObject.set(x, "remove", js.Array(value*))
    
    inline def setUirevision(value: Double | String): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
  }
}
