package typings.nivoChord

import typings.d3Chord.mod.ChordLayout
import typings.nivoChord.anon.ActiveArcOpacity
import typings.nivoChord.anon.Arcs
import typings.nivoChord.anon.Center
import typings.nivoChord.anon.Chord
import typings.nivoChord.anon.Colors
import typings.nivoChord.anon.CurrentArc
import typings.nivoChord.anon.GetColor
import typings.nivoChord.anon.Height
import typings.nivoChord.anon.PadAngle
import typings.nivoChord.anon.Radius
import typings.nivoChord.distTypesTypesMod.CustomLayerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksMod {
  
  @JSImport("@nivo/chord/dist/types/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useChord(param0: Colors): GetColor = ^.asInstanceOf[js.Dynamic].applyDynamic("useChord")(param0.asInstanceOf[js.Any]).asInstanceOf[GetColor]
  
  inline def useChordArcsAndRibbons(param0: Chord): Arcs = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordArcsAndRibbons")(param0.asInstanceOf[js.Any]).asInstanceOf[Arcs]
  
  inline def useChordGenerators(param0: Height): Center = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordGenerators")(param0.asInstanceOf[js.Any]).asInstanceOf[Center]
  
  inline def useChordLayout(param0: PadAngle): ChordLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordLayout")(param0.asInstanceOf[js.Any]).asInstanceOf[ChordLayout]
  
  inline def useChordSelection(param0: ActiveArcOpacity): CurrentArc = ^.asInstanceOf[js.Dynamic].applyDynamic("useChordSelection")(param0.asInstanceOf[js.Any]).asInstanceOf[CurrentArc]
  
  inline def useCustomLayerProps(param0: Radius): CustomLayerProps = ^.asInstanceOf[js.Dynamic].applyDynamic("useCustomLayerProps")(param0.asInstanceOf[js.Any]).asInstanceOf[CustomLayerProps]
}
