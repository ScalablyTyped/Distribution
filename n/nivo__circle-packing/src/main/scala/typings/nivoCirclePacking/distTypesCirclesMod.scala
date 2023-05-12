package typings.nivoCirclePacking

import typings.nivoCirclePacking.distTypesTypesMod.CircleComponent
import typings.nivoCirclePacking.distTypesTypesMod.CircleProps
import typings.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import typings.nivoCirclePacking.distTypesTypesMod.MouseHandlers
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.react.mod.global.JSX.Element
import typings.reactSpringCore.mod.Interpolation
import typings.reactSpringWeb.mod.SpringValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCirclesMod {
  
  @JSImport("@nivo/circle-packing/dist/types/Circles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Circles[RawDatum](param0: CirclesProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Circles")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def interpolateRadius(radiusValue: SpringValue[Double]): Interpolation[Double, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRadius")(radiusValue.asInstanceOf[js.Any]).asInstanceOf[Interpolation[Double, Any]]
  
  trait CirclesProps[RawDatum]
    extends StObject
       with MouseHandlers[RawDatum] {
    
    var borderColor: InheritedColorConfig[ComputedDatum[RawDatum]]
    
    var borderWidth: Double
    
    var component: CircleComponent[RawDatum]
    
    var isInteractive: Boolean
    
    var nodes: js.Array[ComputedDatum[RawDatum]]
    
    var tooltip: js.Function1[/* props */ ComputedDatum[RawDatum], Element]
  }
  object CirclesProps {
    
    inline def apply[RawDatum](
      borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
      borderWidth: Double,
      component: /* props */ CircleProps[RawDatum] => Element,
      isInteractive: Boolean,
      nodes: js.Array[ComputedDatum[RawDatum]],
      tooltip: /* props */ ComputedDatum[RawDatum] => Element
    ): CirclesProps[RawDatum] = {
      val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], component = js.Any.fromFunction1(component), isInteractive = isInteractive.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip))
      __obj.asInstanceOf[CirclesProps[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CirclesProps[?], RawDatum] (val x: Self & CirclesProps[RawDatum]) extends AnyVal {
      
      inline def setBorderColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: /* props */ CircleProps[RawDatum] => Element): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
      
      inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Array[ComputedDatum[RawDatum]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: ComputedDatum[RawDatum]*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setTooltip(value: /* props */ ComputedDatum[RawDatum] => Element): Self = StObject.set(x, "tooltip", js.Any.fromFunction1(value))
    }
  }
}
