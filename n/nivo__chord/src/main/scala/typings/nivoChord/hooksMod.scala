package typings.nivoChord

import typings.d3Chord.mod.ChordLayout
import typings.nivoChord.anon.ActiveArcOpacity
import typings.nivoChord.anon.ArcGenerator
import typings.nivoChord.anon.Arcs
import typings.nivoChord.anon.Center
import typings.nivoChord.anon.Chord
import typings.nivoChord.anon.Colors
import typings.nivoChord.anon.CurrentArc
import typings.nivoChord.anon.Height
import typings.nivoChord.anon.PadAngle
import typings.nivoChord.anon.Radius
import typings.nivoChord.typesMod.CustomLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("@nivo/chord/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useChord(hasDataKeysLabelValueFormatWidthHeightInnerRadiusRatioInnerRadiusOffsetPadAngleColors: Colors): Center = ^.asInstanceOf[js.Dynamic].applyDynamic("useChord")(hasDataKeysLabelValueFormatWidthHeightInnerRadiusRatioInnerRadiusOffsetPadAngleColors.asInstanceOf[js.Any]).asInstanceOf[Center]
  
  inline def useChordArcsAndRibbons(hasChordGetColorKeysDataGetLabelFormatValue: Chord): Arcs = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordArcsAndRibbons")(hasChordGetColorKeysDataGetLabelFormatValue.asInstanceOf[js.Any]).asInstanceOf[Arcs]
  
  inline def useChordGenerators(hasWidthHeightInnerRadiusRatioInnerRadiusOffset: Height): ArcGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordGenerators")(hasWidthHeightInnerRadiusRatioInnerRadiusOffset.asInstanceOf[js.Any]).asInstanceOf[ArcGenerator]
  
  inline def useChordLayout(hasPadAngle: PadAngle): ChordLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordLayout")(hasPadAngle.asInstanceOf[js.Any]).asInstanceOf[ChordLayout]
  
  inline def useChordSelection(
    hasArcOpacityActiveArcOpacityInactiveArcOpacityRibbonsRibbonOpacityActiveRibbonOpacityInactiveRibbonOpacity: ActiveArcOpacity
  ): CurrentArc = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordSelection")(hasArcOpacityActiveArcOpacityInactiveArcOpacityRibbonsRibbonOpacityActiveRibbonOpacityInactiveRibbonOpacity.asInstanceOf[js.Any]).asInstanceOf[CurrentArc]
  
  inline def useCustomLayerProps(hasCenterRadiusArcsArcGeneratorRibbonsRibbonGenerator: Radius): CustomLayerProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useCustomLayerProps")(hasCenterRadiusArcsArcGeneratorRibbonsRibbonGenerator.asInstanceOf[js.Any]).asInstanceOf[CustomLayerProps]
}
