package typings.nivoLegends

import typings.nivoLegends.anon.On
import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propsMod {
  
  object LegendPropShape {
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.anchor")
    @js.native
    def anchor: Validator[String] = js.native
    inline def anchor_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("anchor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.data")
    @js.native
    def data: Requireable[js.Array[js.UndefOr[js.Object | Null]]] = js.native
    inline def data_=(x: Requireable[js.Array[js.UndefOr[js.Object | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("data")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.direction")
    @js.native
    def direction: Validator[String] = js.native
    inline def direction_=(x: Validator[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("direction")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.effects")
    @js.native
    def effects: Requireable[js.Array[js.UndefOr[InferProps[On] | Null]]] = js.native
    inline def effects_=(x: Requireable[js.Array[js.UndefOr[InferProps[On] | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("effects")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.itemBackground")
    @js.native
    def itemBackground: Requireable[String] = js.native
    inline def itemBackground_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemBackground")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.itemDirection")
    @js.native
    def itemDirection: Requireable[String] = js.native
    inline def itemDirection_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemDirection")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.itemHeight")
    @js.native
    def itemHeight: Validator[Double] = js.native
    inline def itemHeight_=(x: Validator[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemHeight")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.itemOpacity")
    @js.native
    def itemOpacity: Requireable[Double] = js.native
    inline def itemOpacity_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemOpacity")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.itemTextColor")
    @js.native
    def itemTextColor: Requireable[String] = js.native
    inline def itemTextColor_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemTextColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.itemWidth")
    @js.native
    def itemWidth: Validator[Double] = js.native
    inline def itemWidth_=(x: Validator[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.itemsSpacing")
    @js.native
    def itemsSpacing: Requireable[Double] = js.native
    inline def itemsSpacing_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("itemsSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.onClick")
    @js.native
    def onClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def onClick_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onClick")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.onMouseEnter")
    @js.native
    def onMouseEnter: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def onMouseEnter_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseEnter")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.onMouseLeave")
    @js.native
    def onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def onMouseLeave_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onMouseLeave")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.symbolBorderColor")
    @js.native
    def symbolBorderColor: Requireable[String] = js.native
    inline def symbolBorderColor_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolBorderColor")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.symbolBorderWidth")
    @js.native
    def symbolBorderWidth: Requireable[Double] = js.native
    inline def symbolBorderWidth_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolBorderWidth")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.symbolShape")
    @js.native
    def symbolShape: Requireable[String | (js.Function1[/* repeated */ Any, Any])] = js.native
    inline def symbolShape_=(x: Requireable[String | (js.Function1[/* repeated */ Any, Any])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolShape")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.symbolSize")
    @js.native
    def symbolSize: Requireable[Double] = js.native
    inline def symbolSize_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolSize")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.symbolSpacing")
    @js.native
    def symbolSpacing: Requireable[Double] = js.native
    inline def symbolSpacing_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("symbolSpacing")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.translateX")
    @js.native
    def translateX: Requireable[Double] = js.native
    inline def translateX_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translateX")(x.asInstanceOf[js.Any])
    
    @JSImport("@nivo/legends/dist/types/props", "LegendPropShape.translateY")
    @js.native
    def translateY: Requireable[Double] = js.native
    inline def translateY_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("translateY")(x.asInstanceOf[js.Any])
  }
}
