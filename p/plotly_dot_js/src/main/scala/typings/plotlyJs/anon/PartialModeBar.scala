package typings.plotlyJs.anon

import typings.plotlyJs.mod.ModeBarDefaultButtons
import typings.plotlyJs.plotlyJsStrings.h
import typings.plotlyJs.plotlyJsStrings.v
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.ModeBar> */
trait PartialModeBar extends StObject {
  
  var activecolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var add: js.UndefOr[ModeBarDefaultButtons | js.Array[ModeBarDefaultButtons]] = js.undefined
  
  var bgcolor: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var color: js.UndefOr[typings.plotlyJs.mod.Color] = js.undefined
  
  var orientation: js.UndefOr[v | h] = js.undefined
  
  var remove: js.UndefOr[ModeBarDefaultButtons | js.Array[ModeBarDefaultButtons]] = js.undefined
  
  var uirevision: js.UndefOr[Double | String] = js.undefined
}
object PartialModeBar {
  
  inline def apply(): PartialModeBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModeBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialModeBar] (val x: Self) extends AnyVal {
    
    inline def setActivecolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "activecolor", value.asInstanceOf[js.Any])
    
    inline def setActivecolorUndefined: Self = StObject.set(x, "activecolor", js.undefined)
    
    inline def setActivecolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "activecolor", js.Array(value*))
    
    inline def setAdd(value: ModeBarDefaultButtons | js.Array[ModeBarDefaultButtons]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAddVarargs(value: ModeBarDefaultButtons*): Self = StObject.set(x, "add", js.Array(value*))
    
    inline def setBgcolor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
    
    inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
    
    inline def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "bgcolor", js.Array(value*))
    
    inline def setColor(value: typings.plotlyJs.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setOrientation(value: v | h): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setRemove(value: ModeBarDefaultButtons | js.Array[ModeBarDefaultButtons]): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setRemoveVarargs(value: ModeBarDefaultButtons*): Self = StObject.set(x, "remove", js.Array(value*))
    
    inline def setUirevision(value: Double | String): Self = StObject.set(x, "uirevision", value.asInstanceOf[js.Any])
    
    inline def setUirevisionUndefined: Self = StObject.set(x, "uirevision", js.undefined)
  }
}
