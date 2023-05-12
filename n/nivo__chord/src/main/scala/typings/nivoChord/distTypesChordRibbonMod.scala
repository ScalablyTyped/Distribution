package typings.nivoChord

import typings.nivoChord.distTypesTypesMod.ChordRibbonMouseHandler
import typings.nivoChord.distTypesTypesMod.RibbonAnimatedProps
import typings.nivoChord.distTypesTypesMod.RibbonDatum
import typings.nivoChord.distTypesTypesMod.RibbonGenerator
import typings.nivoChord.distTypesTypesMod.RibbonTooltipComponent
import typings.nivoCore.mod.CssMixBlendMode
import typings.react.mod.MemoExoticComponent
import typings.react.mod.global.JSX.Element
import typings.reactSpringCore.mod.SpringValues
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesChordRibbonMod {
  
  @JSImport("@nivo/chord/dist/types/ChordRibbon", "ChordRibbon")
  @js.native
  val ChordRibbon: MemoExoticComponent[js.Function1[/* param0 */ ChordRibbonProps, Element]] = js.native
  
  @js.native
  trait ChordRibbonProps extends StObject {
    
    var animatedProps: SpringValues[RibbonAnimatedProps] = js.native
    
    var blendMode: NonNullable[js.UndefOr[CssMixBlendMode]] = js.native
    
    var borderWidth: Double = js.native
    
    var isInteractive: Boolean = js.native
    
    var onClick: js.UndefOr[ChordRibbonMouseHandler] = js.native
    
    var onMouseEnter: js.UndefOr[ChordRibbonMouseHandler] = js.native
    
    var onMouseLeave: js.UndefOr[ChordRibbonMouseHandler] = js.native
    
    var onMouseMove: js.UndefOr[ChordRibbonMouseHandler] = js.native
    
    var ribbon: RibbonDatum = js.native
    
    var ribbonGenerator: RibbonGenerator = js.native
    
    def setCurrent(): Unit = js.native
    def setCurrent(ribbon: RibbonDatum): Unit = js.native
    
    var tooltip: NonNullable[js.UndefOr[RibbonTooltipComponent]] = js.native
  }
}
