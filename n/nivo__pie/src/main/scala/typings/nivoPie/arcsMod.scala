package typings.nivoPie

import typings.nivoArcs.arcTransitionModeMod.ArcTransitionMode
import typings.nivoArcs.typesTypesMod.ArcGenerator
import typings.nivoColors.inheritedColorMod.InheritedColorConfig
import typings.nivoPie.typesMod.ComputedDatum
import typings.nivoPie.typesMod.MouseEventHandler
import typings.nivoPie.typesMod.PieTooltipProps
import typings.react.mod.FC
import typings.react.mod.global.JSX.Element
import typings.std.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcsMod {
  
  @JSImport("@nivo/pie/dist/types/Arcs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Arcs[RawDatum](
    hasCenterDataArcGeneratorBorderWidthBorderColorIsInteractiveOnClickOnMouseEnterOnMouseMoveOnMouseLeaveSetActiveIdTooltipTransitionMode: ArcsProps[RawDatum]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Arcs")(hasCenterDataArcGeneratorBorderWidthBorderColorIsInteractiveOnClickOnMouseEnterOnMouseMoveOnMouseLeaveSetActiveIdTooltipTransitionMode.asInstanceOf[js.Any]).asInstanceOf[Element]
  
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
