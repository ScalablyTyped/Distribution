package typings.nivoCore.mod

import typings.nivoCore.anon.Color
import typings.nivoCore.nivoCoreStrings.linearGradient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LinearGradientDef_
  extends StObject
     with Def {
  
  var colors: js.Array[Color]
  
  var gradientTransform: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var `type`: linearGradient
}
object LinearGradientDef_ {
  
  inline def apply(colors: js.Array[Color], id: String): LinearGradientDef_ = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("linearGradient")
    __obj.asInstanceOf[LinearGradientDef_]
  }
  
  extension [Self <: LinearGradientDef_](x: Self) {
    
    inline def setColors(value: js.Array[Color]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: Color*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setGradientTransform(value: String): Self = StObject.set(x, "gradientTransform", value.asInstanceOf[js.Any])
    
    inline def setGradientTransformUndefined: Self = StObject.set(x, "gradientTransform", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: linearGradient): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
