package typings.nivoChord

import typings.d3Chord.mod.ChordLayout
import typings.nivoChord.anon.ArcGenerator
import typings.nivoChord.anon.Arcs
import typings.nivoChord.anon.Chord
import typings.nivoChord.anon.EndAngle
import typings.nivoChord.anon.Height
import typings.nivoChord.anon.PadAngle
import typings.nivoChord.anon.RibbonGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeMod {
  
  @JSImport("@nivo/chord/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeArcPath(hasStartAngleEndAngleArcGenerator: EndAngle): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArcPath")(hasStartAngleEndAngleArcGenerator.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def computeChordArcsAndRibbons(hasChordDataKeysGetLabelFormatValueGetColor: Chord): Arcs = ^.asInstanceOf[js.Dynamic].applyDynamic("computeChordArcsAndRibbons")(hasChordDataKeysGetLabelFormatValueGetColor.asInstanceOf[js.Any]).asInstanceOf[Arcs]
  
  inline def computeChordGenerators(hasWidthHeightInnerRadiusRatioInnerRadiusOffset: Height): ArcGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("computeChordGenerators")(hasWidthHeightInnerRadiusRatioInnerRadiusOffset.asInstanceOf[js.Any]).asInstanceOf[ArcGenerator]
  
  inline def computeChordLayout(hasPadAngle: PadAngle): ChordLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("computeChordLayout")(hasPadAngle.asInstanceOf[js.Any]).asInstanceOf[ChordLayout]
  
  inline def computeRibbonPath(hasSourceStartAngleSourceEndAngleTargetStartAngleTargetEndAngleRibbonGenerator: RibbonGenerator): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeRibbonPath")(hasSourceStartAngleSourceEndAngleTargetStartAngleTargetEndAngleRibbonGenerator.asInstanceOf[js.Any]).asInstanceOf[Any]
}
