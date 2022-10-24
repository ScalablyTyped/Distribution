package typings.nivoCirclePacking

import typings.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import typings.nivoCirclePacking.distTypesTypesMod.ComputedLabel
import typings.nivoCirclePacking.distTypesTypesMod.LabelComponent
import typings.nivoCirclePacking.distTypesTypesMod.LabelProps
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoCore.mod.PropertyAccessor
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLabelsMod {
  
  @JSImport("@nivo/circle-packing/dist/types/Labels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Labels[RawDatum](param0: CirclesProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Labels")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait CirclesProps[RawDatum] extends StObject {
    
    var component: LabelComponent[RawDatum]
    
    var filter: js.UndefOr[js.Function1[/* label */ ComputedLabel[RawDatum], Boolean]] = js.undefined
    
    var label: PropertyAccessor[ComputedDatum[RawDatum], String]
    
    var nodes: js.Array[ComputedDatum[RawDatum]]
    
    var skipRadius: Double
    
    var textColor: InheritedColorConfig[ComputedDatum[RawDatum]]
  }
  object CirclesProps {
    
    inline def apply[RawDatum](
      component: /* props */ LabelProps[RawDatum] => Element,
      label: PropertyAccessor[ComputedDatum[RawDatum], String],
      nodes: js.Array[ComputedDatum[RawDatum]],
      skipRadius: Double,
      textColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    ): CirclesProps[RawDatum] = {
      val __obj = js.Dynamic.literal(component = js.Any.fromFunction1(component), label = label.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], skipRadius = skipRadius.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[CirclesProps[RawDatum]]
    }
    
    extension [Self <: CirclesProps[?], RawDatum](x: Self & CirclesProps[RawDatum]) {
      
      inline def setComponent(value: /* props */ LabelProps[RawDatum] => Element): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
      
      inline def setFilter(value: /* label */ ComputedLabel[RawDatum] => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
      
      inline def setNodes(value: js.Array[ComputedDatum[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ComputedDatum[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setSkipRadius(value: Double): Self = StObject.set(x, "skipRadius", value.asInstanceOf[js.Any])
      
      inline def setTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
    }
  }
}
