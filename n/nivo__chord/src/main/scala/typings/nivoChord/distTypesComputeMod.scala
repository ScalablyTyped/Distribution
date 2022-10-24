package typings.nivoChord

import typings.d3Chord.mod.ChordLayout
import typings.nivoChord.anon.ArcGenerator
import typings.nivoChord.anon.Arcs
import typings.nivoChord.anon.Center
import typings.nivoChord.anon.Chord
import typings.nivoChord.anon.Height
import typings.nivoChord.anon.PadAngle
import typings.nivoChord.anon.RibbonGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComputeMod {
  
  @JSImport("@nivo/chord/dist/types/compute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def computeArcPath(param0: ArcGenerator): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeArcPath")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def computeChordArcsAndRibbons(param0: Chord): Arcs = ^.asInstanceOf[js.Dynamic].applyDynamic("computeChordArcsAndRibbons")(param0.asInstanceOf[js.Any]).asInstanceOf[Arcs]
  
  inline def computeChordGenerators(param0: Height): Center = ^.asInstanceOf[js.Dynamic].applyDynamic("computeChordGenerators")(param0.asInstanceOf[js.Any]).asInstanceOf[Center]
  
  inline def computeChordLayout(param0: PadAngle): ChordLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("computeChordLayout")(param0.asInstanceOf[js.Any]).asInstanceOf[ChordLayout]
  
  inline def computeRibbonPath(param0: RibbonGenerator): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("computeRibbonPath")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
}
