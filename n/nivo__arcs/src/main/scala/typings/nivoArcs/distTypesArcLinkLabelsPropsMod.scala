package typings.nivoArcs

import typings.nivoArcs.distTypesArcLinkLabelsArcLinkLabelMod.ArcLinkLabelProps
import typings.nivoArcs.distTypesArcLinkLabelsArcLinkLabelsLayerMod.ArcLinkLabelComponent
import typings.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLinkLabelsPropsMod {
  
  trait ArcLinkLabelsProps[Datum /* <: DatumWithArcAndColor */] extends StObject {
    
    var arcLinkLabel: PropertyAccessor[Datum, String]
    
    var arcLinkLabelsColor: InheritedColorConfig[Datum]
    
    var arcLinkLabelsDiagonalLength: Double
    
    var arcLinkLabelsOffset: Double
    
    var arcLinkLabelsSkipAngle: Double
    
    var arcLinkLabelsStraightLength: Double
    
    var arcLinkLabelsTextColor: InheritedColorConfig[Datum]
    
    var arcLinkLabelsTextOffset: Double
    
    var arcLinkLabelsThickness: Double
    
    var component: ArcLinkLabelComponent[Datum]
  }
  object ArcLinkLabelsProps {
    
    inline def apply[Datum /* <: DatumWithArcAndColor */](
      arcLinkLabel: PropertyAccessor[Datum, String],
      arcLinkLabelsColor: InheritedColorConfig[Datum],
      arcLinkLabelsDiagonalLength: Double,
      arcLinkLabelsOffset: Double,
      arcLinkLabelsSkipAngle: Double,
      arcLinkLabelsStraightLength: Double,
      arcLinkLabelsTextColor: InheritedColorConfig[Datum],
      arcLinkLabelsTextOffset: Double,
      arcLinkLabelsThickness: Double,
      component: /* props */ ArcLinkLabelProps[Datum] => Element
    ): ArcLinkLabelsProps[Datum] = {
      val __obj = js.Dynamic.literal(arcLinkLabel = arcLinkLabel.asInstanceOf[js.Any], arcLinkLabelsColor = arcLinkLabelsColor.asInstanceOf[js.Any], arcLinkLabelsDiagonalLength = arcLinkLabelsDiagonalLength.asInstanceOf[js.Any], arcLinkLabelsOffset = arcLinkLabelsOffset.asInstanceOf[js.Any], arcLinkLabelsSkipAngle = arcLinkLabelsSkipAngle.asInstanceOf[js.Any], arcLinkLabelsStraightLength = arcLinkLabelsStraightLength.asInstanceOf[js.Any], arcLinkLabelsTextColor = arcLinkLabelsTextColor.asInstanceOf[js.Any], arcLinkLabelsTextOffset = arcLinkLabelsTextOffset.asInstanceOf[js.Any], arcLinkLabelsThickness = arcLinkLabelsThickness.asInstanceOf[js.Any], component = js.Any.fromFunction1(component))
      __obj.asInstanceOf[ArcLinkLabelsProps[Datum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ArcLinkLabelsProps[?], Datum /* <: DatumWithArcAndColor */] (val x: Self & ArcLinkLabelsProps[Datum]) extends AnyVal {
      
      inline def setArcLinkLabel(value: PropertyAccessor[Datum, String]): Self = StObject.set(x, "arcLinkLabel", value.asInstanceOf[js.Any])
      
      inline def setArcLinkLabelFunction1(value: Datum => String): Self = StObject.set(x, "arcLinkLabel", js.Any.fromFunction1(value))
      
      inline def setArcLinkLabelsColor(value: InheritedColorConfig[Datum]): Self = StObject.set(x, "arcLinkLabelsColor", value.asInstanceOf[js.Any])
      
      inline def setArcLinkLabelsDiagonalLength(value: Double): Self = StObject.set(x, "arcLinkLabelsDiagonalLength", value.asInstanceOf[js.Any])
      
      inline def setArcLinkLabelsOffset(value: Double): Self = StObject.set(x, "arcLinkLabelsOffset", value.asInstanceOf[js.Any])
      
      inline def setArcLinkLabelsSkipAngle(value: Double): Self = StObject.set(x, "arcLinkLabelsSkipAngle", value.asInstanceOf[js.Any])
      
      inline def setArcLinkLabelsStraightLength(value: Double): Self = StObject.set(x, "arcLinkLabelsStraightLength", value.asInstanceOf[js.Any])
      
      inline def setArcLinkLabelsTextColor(value: InheritedColorConfig[Datum]): Self = StObject.set(x, "arcLinkLabelsTextColor", value.asInstanceOf[js.Any])
      
      inline def setArcLinkLabelsTextOffset(value: Double): Self = StObject.set(x, "arcLinkLabelsTextOffset", value.asInstanceOf[js.Any])
      
      inline def setArcLinkLabelsThickness(value: Double): Self = StObject.set(x, "arcLinkLabelsThickness", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: /* props */ ArcLinkLabelProps[Datum] => Element): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
    }
  }
}
