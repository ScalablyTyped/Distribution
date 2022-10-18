package typings.nivoSunburst

import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.nivoCore.mod.ValueFormat
import typings.nivoSunburst.distTypesTypesMod.ComputedDatum
import typings.nivoSunburst.distTypesTypesMod.DatumId
import typings.nivoSunburst.nivoSunburstStrings.color
import typings.nivoSunburst.nivoSunburstStrings.depth
import typings.nivoSunburst.nivoSunburstStrings.fill
import typings.nivoSunburst.nivoSunburstStrings.id
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ArcGenerator[RawDatum] extends StObject {
    
    var arcGenerator: typings.nivoArcs.distTypesTypesMod.ArcGenerator
    
    var nodes: js.Array[ComputedDatum[RawDatum]]
  }
  object ArcGenerator {
    
    inline def apply[RawDatum](
      arcGenerator: typings.nivoArcs.distTypesTypesMod.ArcGenerator,
      nodes: js.Array[ComputedDatum[RawDatum]]
    ): ArcGenerator[RawDatum] = {
      val __obj = js.Dynamic.literal(arcGenerator = arcGenerator.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcGenerator[RawDatum]]
    }
    
    extension [Self <: ArcGenerator[?], RawDatum](x: Self & ArcGenerator[RawDatum]) {
      
      inline def setArcGenerator(value: typings.nivoArcs.distTypesTypesMod.ArcGenerator): Self = StObject.set(x, "arcGenerator", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[ComputedDatum[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ComputedDatum[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
    }
  }
  
  trait ChildColor[RawDatum] extends StObject {
    
    var childColor: js.UndefOr[InheritedColorConfig[ComputedDatum[RawDatum]]] = js.undefined
    
    var colorBy: js.UndefOr[id | depth] = js.undefined
    
    var colors: js.UndefOr[OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]] = js.undefined
    
    var cornerRadius: js.UndefOr[Double] = js.undefined
    
    var data: RawDatum
    
    var id: js.UndefOr[PropertyAccessor[RawDatum, DatumId]] = js.undefined
    
    var inheritColorFromParent: js.UndefOr[Boolean] = js.undefined
    
    var radius: Double
    
    var value: js.UndefOr[PropertyAccessor[RawDatum, Double]] = js.undefined
    
    var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  }
  object ChildColor {
    
    inline def apply[RawDatum](data: RawDatum, radius: Double): ChildColor[RawDatum] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildColor[RawDatum]]
    }
    
    extension [Self <: ChildColor[?], RawDatum](x: Self & ChildColor[RawDatum]) {
      
      inline def setChildColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "childColor", value.asInstanceOf[js.Any])
      
      inline def setChildColorUndefined: Self = StObject.set(x, "childColor", js.undefined)
      
      inline def setColorBy(value: id | depth): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
      
      inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
      
      inline def setColors(value: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsFunction1(value: Omit[ComputedDatum[RawDatum], color | fill] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
      
      inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
      
      inline def setData(value: RawDatum): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: PropertyAccessor[RawDatum, DatumId]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdFunction1(value: RawDatum => DatumId): Self = StObject.set(x, "id", js.Any.fromFunction1(value))
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInheritColorFromParent(value: Boolean): Self = StObject.set(x, "inheritColorFromParent", value.asInstanceOf[js.Any])
      
      inline def setInheritColorFromParentUndefined: Self = StObject.set(x, "inheritColorFromParent", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setValue(value: PropertyAccessor[RawDatum, Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
      
      inline def setValueFunction1(value: RawDatum => Double): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait From extends StObject {
    
    var from: String
  }
  object From {
    
    inline def apply(from: String): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    }
  }
  
  trait Theme extends StObject {
    
    var theme: String
  }
  object Theme {
    
    inline def apply(theme: String): Theme = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
