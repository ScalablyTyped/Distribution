package typings.nivoArcs.anon

import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offset[Datum /* <: DatumWithArcAndColor */] extends StObject {
  
  var data: js.Array[Datum]
  
  var diagonalLength: Double
  
  var linkColor: InheritedColorConfig[Datum]
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var skipAngle: js.UndefOr[Double] = js.undefined
  
  var straightLength: Double
  
  var textColor: InheritedColorConfig[Datum]
  
  var textOffset: Double
}
object Offset {
  
  inline def apply[Datum /* <: DatumWithArcAndColor */](
    data: js.Array[Datum],
    diagonalLength: Double,
    linkColor: InheritedColorConfig[Datum],
    straightLength: Double,
    textColor: InheritedColorConfig[Datum],
    textOffset: Double
  ): Offset[Datum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], diagonalLength = diagonalLength.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], straightLength = straightLength.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textOffset = textOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset[Datum]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Offset[?], Datum /* <: DatumWithArcAndColor */] (val x: Self & Offset[Datum]) extends AnyVal {
    
    inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDiagonalLength(value: Double): Self = StObject.set(x, "diagonalLength", value.asInstanceOf[js.Any])
    
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
