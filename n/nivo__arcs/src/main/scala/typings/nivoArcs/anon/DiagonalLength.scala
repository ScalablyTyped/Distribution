package typings.nivoArcs.anon

import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoCore.mod.PropertyAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiagonalLength[Datum /* <: DatumWithArcAndColor */] extends StObject {
  
  var data: js.Array[Datum]
  
  var diagonalLength: Double
  
  var label: PropertyAccessor[Datum, String]
  
  var linkColor: InheritedColorConfig[Datum]
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var skipAngle: js.UndefOr[Double] = js.undefined
  
  var straightLength: Double
  
  var textColor: InheritedColorConfig[Datum]
  
  var textOffset: Double
}
object DiagonalLength {
  
  inline def apply[Datum /* <: DatumWithArcAndColor */](
    data: js.Array[Datum],
    diagonalLength: Double,
    label: PropertyAccessor[Datum, String],
    linkColor: InheritedColorConfig[Datum],
    straightLength: Double,
    textColor: InheritedColorConfig[Datum],
    textOffset: Double
  ): DiagonalLength[Datum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], diagonalLength = diagonalLength.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], straightLength = straightLength.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textOffset = textOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagonalLength[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DiagonalLength[?], Datum /* <: DatumWithArcAndColor */] (val x: Self & DiagonalLength[Datum]) extends AnyVal {
    
    inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDiagonalLength(value: Double): Self = StObject.set(x, "diagonalLength", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: PropertyAccessor[Datum, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFunction1(value: Datum => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLinkColor(value: InheritedColorConfig[Datum]): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSkipAngle(value: Double): Self = StObject.set(x, "skipAngle", value.asInstanceOf[js.Any])
    
    inline def setSkipAngleUndefined: Self = StObject.set(x, "skipAngle", js.undefined)
    
    inline def setStraightLength(value: Double): Self = StObject.set(x, "straightLength", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: InheritedColorConfig[Datum]): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    
    inline def setTextOffset(value: Double): Self = StObject.set(x, "textOffset", value.asInstanceOf[js.Any])
  }
}
