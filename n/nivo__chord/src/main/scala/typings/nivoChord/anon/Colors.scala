package typings.nivoChord.anon

import typings.nivoColors.ordinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.ValueFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var colors: js.UndefOr[OrdinalColorScaleConfig[OmitArcDatumlabelcolor]] = js.undefined
  
  var data: js.Array[js.Array[Double]]
  
  var height: Double
  
  var innerRadiusOffset: js.UndefOr[Double] = js.undefined
  
  var innerRadiusRatio: js.UndefOr[Double] = js.undefined
  
  var keys: js.Array[String]
  
  var label: js.UndefOr[PropertyAccessor[OmitArcDatumlabelcolor, String]] = js.undefined
  
  var padAngle: js.UndefOr[Double] = js.undefined
  
  var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var width: Double
}
object Colors {
  
  inline def apply(data: js.Array[js.Array[Double]], height: Double, keys: js.Array[String], width: Double): Colors = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  extension [Self <: Colors](x: Self) {
    
    inline def setColors(value: OrdinalColorScaleConfig[OmitArcDatumlabelcolor]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(value: OmitArcDatumlabelcolor => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setData(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: js.Array[Double]*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusOffset(value: Double): Self = StObject.set(x, "innerRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusOffsetUndefined: Self = StObject.set(x, "innerRadiusOffset", js.undefined)
    
    inline def setInnerRadiusRatio(value: Double): Self = StObject.set(x, "innerRadiusRatio", value.asInstanceOf[js.Any])
    
    inline def setInnerRadiusRatioUndefined: Self = StObject.set(x, "innerRadiusRatio", js.undefined)
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setLabel(value: PropertyAccessor[OmitArcDatumlabelcolor, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(value: OmitArcDatumlabelcolor => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setPadAngle(value: Double): Self = StObject.set(x, "padAngle", value.asInstanceOf[js.Any])
    
    inline def setPadAngleUndefined: Self = StObject.set(x, "padAngle", js.undefined)
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatFunction1(value: Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
    
    inline def setValueFormatFunction2(value: (Double, Unit) => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction2(value))
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
