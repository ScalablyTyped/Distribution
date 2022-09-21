package typings.nivoLine.mod

import typings.nivoCore.mod.ModernMotionProps
import typings.nivoCore.mod.SvgDefsAndFill
import typings.nivoLine.anon.XFormatted
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineSvgProps
  extends StObject
     with LineProps
     with ModernMotionProps
     with SvgDefsAndFill[Datum] {
  
  var areaBlendMode: js.UndefOr[String] = js.undefined
  
  var enablePointLabel: js.UndefOr[Boolean] = js.undefined
  
  var pointLabel: js.UndefOr[String | AccessorFunc] = js.undefined
  
  var pointLabelYOffset: js.UndefOr[Double] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var useMesh: js.UndefOr[Boolean] = js.undefined
}
object LineSvgProps {
  
  inline def apply(data: js.Array[Serie]): LineSvgProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSvgProps]
  }
  
  extension [Self <: LineSvgProps](x: Self) {
    
    inline def setAreaBlendMode(value: String): Self = StObject.set(x, "areaBlendMode", value.asInstanceOf[js.Any])
    
    inline def setAreaBlendModeUndefined: Self = StObject.set(x, "areaBlendMode", js.undefined)
    
    inline def setEnablePointLabel(value: Boolean): Self = StObject.set(x, "enablePointLabel", value.asInstanceOf[js.Any])
    
    inline def setEnablePointLabelUndefined: Self = StObject.set(x, "enablePointLabel", js.undefined)
    
    inline def setPointLabel(value: String | AccessorFunc): Self = StObject.set(x, "pointLabel", value.asInstanceOf[js.Any])
    
    inline def setPointLabelFunction1(value: /* datum */ XFormatted => String): Self = StObject.set(x, "pointLabel", js.Any.fromFunction1(value))
    
    inline def setPointLabelUndefined: Self = StObject.set(x, "pointLabel", js.undefined)
    
    inline def setPointLabelYOffset(value: Double): Self = StObject.set(x, "pointLabelYOffset", value.asInstanceOf[js.Any])
    
    inline def setPointLabelYOffsetUndefined: Self = StObject.set(x, "pointLabelYOffset", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setUseMesh(value: Boolean): Self = StObject.set(x, "useMesh", value.asInstanceOf[js.Any])
    
    inline def setUseMeshUndefined: Self = StObject.set(x, "useMesh", js.undefined)
  }
}
