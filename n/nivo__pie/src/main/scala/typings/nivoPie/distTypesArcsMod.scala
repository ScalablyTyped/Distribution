package typings.nivoPie

import typings.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionMode
import typings.nivoArcs.distTypesTypesMod.ArcGenerator
import typings.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typings.nivoPie.distTypesTypesMod.ComputedDatum
import typings.nivoPie.distTypesTypesMod.MouseEventHandler
import typings.nivoPie.distTypesTypesMod.PieTooltipProps
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import typings.std.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcsMod {
  
  @JSImport("@nivo/pie/dist/types/Arcs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Arcs[RawDatum](param0: ArcsProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Arcs")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait ArcsProps[RawDatum] extends StObject {
    
    var arcGenerator: ArcGenerator = js.native
    
    var borderColor: InheritedColorConfig[ComputedDatum[RawDatum]] = js.native
    
    var borderWidth: Double = js.native
    
    var center: js.Tuple2[Double, Double] = js.native
    
    var data: js.Array[ComputedDatum[RawDatum]] = js.native
    
    var isInteractive: Boolean = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[RawDatum, SVGPathElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[RawDatum, SVGPathElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[RawDatum, SVGPathElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[RawDatum, SVGPathElement]] = js.native
    
    def setActiveId(): Unit = js.native
    def setActiveId(id: String): Unit = js.native
    def setActiveId(id: Double): Unit = js.native
    
    var tooltip: FC[PieTooltipProps[RawDatum]] = js.native
    
    var transitionMode: ArcTransitionMode = js.native
  }
}
