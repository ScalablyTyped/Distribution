package typings.nivoChord

import typings.nivoChord.typesMod.ArcDatum
import typings.nivoChord.typesMod.ArcGenerator
import typings.nivoChord.typesMod.ArcTooltipComponent
import typings.nivoChord.typesMod.ChordArcMouseHandler
import typings.nivoColors.inheritedColorMod.InheritedColorConfig
import typings.react.mod.MemoExoticComponent
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chordArcsMod {
  
  @JSImport("@nivo/chord/dist/types/ChordArcs", "ChordArcs")
  @js.native
  val ChordArcs: MemoExoticComponent[
    js.Function1[
      /* hasArcsBorderWidthBorderColorGetOpacityArcGeneratorSetCurrentIsInteractiveOnMouseEnterOnMouseMoveOnMouseLeaveOnClickTooltip */ ChordArcsProps, 
      Element
    ]
  ] = js.native
  
  @js.native
  trait ChordArcsProps extends StObject {
    
    var arcGenerator: ArcGenerator = js.native
    
    var arcs: js.Array[ArcDatum] = js.native
    
    var borderColor: InheritedColorConfig[ArcDatum] = js.native
    
    var borderWidth: Double = js.native
    
    def getOpacity(arc: ArcDatum): Double = js.native
    
    var isInteractive: Boolean = js.native
    
    var onClick: js.UndefOr[ChordArcMouseHandler] = js.native
    
    var onMouseEnter: js.UndefOr[ChordArcMouseHandler] = js.native
    
    var onMouseLeave: js.UndefOr[ChordArcMouseHandler] = js.native
    
    var onMouseMove: js.UndefOr[ChordArcMouseHandler] = js.native
    
    def setCurrent(): Unit = js.native
    def setCurrent(arc: ArcDatum): Unit = js.native
    
    var tooltip: ArcTooltipComponent = js.native
  }
}
