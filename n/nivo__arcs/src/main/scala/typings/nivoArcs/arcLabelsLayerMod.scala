package typings.nivoArcs

import typings.nivoArcs.arcLabelMod.ArcLabelProps
import typings.nivoArcs.arcTransitionModeMod.ArcTransitionMode
import typings.nivoArcs.typesTypesMod.DatumWithArcAndColor
import typings.nivoColors.inheritedColorMod.InheritedColorConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcLabelsLayerMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_labels/ArcLabelsLayer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ArcLabelsLayer[Datum /* <: DatumWithArcAndColor */](
    hasCenterDataTransitionModeLabelAccessorRadiusOffsetSkipAngleTextColorComponent: ArcLabelsLayerProps[Datum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ArcLabelsLayer")(hasCenterDataTransitionModeLabelAccessorRadiusOffsetSkipAngleTextColorComponent.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type ArcLabelComponent[Datum /* <: DatumWithArcAndColor */] = js.Function1[/* props */ ArcLabelProps[Datum], Element]
  
  trait ArcLabelsLayerProps[Datum /* <: DatumWithArcAndColor */] extends StObject {
    
    var center: js.Tuple2[Double, Double]
    
    var component: js.UndefOr[ArcLabelComponent[Datum]] = js.undefined
    
    var data: js.Array[Datum]
    
    var label: PropertyAccessor[Datum, String]
    
    var radiusOffset: Double
    
    var skipAngle: Double
    
    var textColor: InheritedColorConfig[Datum]
    
    var transitionMode: ArcTransitionMode
  }
  object ArcLabelsLayerProps {
    
    inline def apply[Datum /* <: DatumWithArcAndColor */](
      center: js.Tuple2[Double, Double],
      data: js.Array[Datum],
      label: PropertyAccessor[Datum, String],
      radiusOffset: Double,
      skipAngle: Double,
      textColor: InheritedColorConfig[Datum],
      transitionMode: ArcTransitionMode
    ): ArcLabelsLayerProps[Datum] = {
      val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], radiusOffset = radiusOffset.asInstanceOf[js.Any], skipAngle = skipAngle.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], transitionMode = transitionMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcLabelsLayerProps[Datum]]
    }
    
    extension [Self <: ArcLabelsLayerProps[?], Datum /* <: DatumWithArcAndColor */](x: Self & ArcLabelsLayerProps[Datum]) {
      
      inline def setCenter(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: /* props */ ArcLabelProps[Datum] => Element): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setData(value: js.Array[Datum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: Datum*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setLabel(value: PropertyAccessor[Datum, String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: Datum => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setRadiusOffset(value: Double): Self = StObject.set(x, "radiusOffset", value.asInstanceOf[js.Any])
      
      inline def setSkipAngle(value: Double): Self = StObject.set(x, "skipAngle", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: InheritedColorConfig[Datum]): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      inline def setTransitionMode(value: ArcTransitionMode): Self = StObject.set(x, "transitionMode", value.asInstanceOf[js.Any])
    }
  }
}
