package typings.nivoArcs.anon

import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoCore.mod.PropertyAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[Datum /* <: DatumWithArcAndColor */] extends StObject {
  
  var data: js.Array[Datum]
  
  var label: PropertyAccessor[Datum, String]
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var skipAngle: js.UndefOr[Double] = js.undefined
  
  var textColor: InheritedColorConfig[Datum]
}
object Data {
  
  inline def apply[Datum /* <: DatumWithArcAndColor */](
    data: js.Array[Datum],
    label: PropertyAccessor[Datum, String],
    textColor: InheritedColorConfig[Datum]
  ): Data[Datum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data[?], Datum /* <: DatumWithArcAndColor */] (val x: Self & Data[Datum]) extends AnyVal {
    
    inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setLabel(value: PropertyAccessor[Datum, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(value: Datum => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSkipAngle(value: Double): Self = StObject.set(x, "skipAngle", value.asInstanceOf[js.Any])
    
    inline def setSkipAngleUndefined: Self = StObject.set(x, "skipAngle", js.undefined)
    
    inline def setTextColor(value: InheritedColorConfig[Datum]): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
  }
}
