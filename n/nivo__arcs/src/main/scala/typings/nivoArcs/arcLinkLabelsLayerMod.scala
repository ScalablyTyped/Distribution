package typings.nivoArcs

import typings.nivoArcs.arcLinkLabelMod.ArcLinkLabelProps
import typings.nivoArcs.typesTypesMod.DatumWithArcAndColor
import typings.nivoColors.inheritedColorMod.InheritedColorConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcLinkLabelsLayerMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_link_labels/ArcLinkLabelsLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLinkLabelsLayer[Datum /* <: DatumWithArcAndColor */](
    hasCenterDataLabelAccessorSkipAngleOffsetDiagonalLengthStraightLengthStrokeWidthTextOffsetTextColorLinkColorComponent: ArcLinkLabelsLayerProps[Datum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLinkLabelsLayer")(hasCenterDataLabelAccessorSkipAngleOffsetDiagonalLengthStraightLengthStrokeWidthTextOffsetTextColorLinkColorComponent.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ArcLinkLabelComponent[Datum /* <: DatumWithArcAndColor */] = js.Function1[/* props */ ArcLinkLabelProps[Datum], Element]
  
  trait ArcLinkLabelsLayerProps[Datum /* <: DatumWithArcAndColor */] extends StObject {
    
    var center: js.Tuple2[Double, Double]
    
    var component: js.UndefOr[ArcLinkLabelComponent[Datum]] = js.undefined
    
    var data: js.Array[Datum]
    
    var diagonalLength: Double
    
    var label: PropertyAccessor[Datum, String]
    
    var linkColor: InheritedColorConfig[Datum]
    
    var offset: Double
    
    var skipAngle: Double
    
    var straightLength: Double
    
    var strokeWidth: Double
    
    var textColor: InheritedColorConfig[Datum]
    
    var textOffset: Double
  }
  object ArcLinkLabelsLayerProps {
    
    inline def apply[Datum /* <: DatumWithArcAndColor */](
      center: js.Tuple2[Double, Double],
      data: js.Array[Datum],
      diagonalLength: Double,
      label: PropertyAccessor[Datum, String],
      linkColor: InheritedColorConfig[Datum],
      offset: Double,
      skipAngle: Double,
      straightLength: Double,
      strokeWidth: Double,
      textColor: InheritedColorConfig[Datum],
      textOffset: Double
    ): ArcLinkLabelsLayerProps[Datum] = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], diagonalLength = diagonalLength.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], skipAngle = skipAngle.asInstanceOf[js.Any], straightLength = straightLength.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textOffset = textOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcLinkLabelsLayerProps[Datum]]
    }
    
    extension [Self <: ArcLinkLabelsLayerProps[?], Datum /* <: DatumWithArcAndColor */](x: Self & ArcLinkLabelsLayerProps[Datum]) {
      
      inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: /* props */ ArcLinkLabelProps[Datum] => Element): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDiagonalLength(value: Double): Self = StObject.set(x, "diagonalLength", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: PropertyAccessor[Datum, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: Datum => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setLinkColor(value: InheritedColorConfig[Datum]): Self = StObject.set(x, "linkColor", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSkipAngle(value: Double): Self = StObject.set(x, "skipAngle", value.asInstanceOf[js.Any])
      
      inline def setStraightLength(value: Double): Self = StObject.set(x, "straightLength", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: InheritedColorConfig[Datum]): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTextOffset(value: Double): Self = StObject.set(x, "textOffset", value.asInstanceOf[js.Any])
    }
  }
}
