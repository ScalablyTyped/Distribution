package typings.nivoArcs

import typings.nivoArcs.distTypesTypesMod.DatumWithArc
import typings.nivoArcs.nivoArcsInts.`0`
import typings.nivoArcs.nivoArcsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsMod {
  
  @JSImport("@nivo/arcs/dist/types/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def filterDataBySkipAngle[Datum /* <: DatumWithArc */](data: js.Array[Datum], skipAngle: Double): js.Array[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("filterDataBySkipAngle")(data.asInstanceOf[js.Any], skipAngle.asInstanceOf[js.Any])).asInstanceOf[js.Array[Datum]]
  
  inline def generateSvgArc(radius: Double, originalStartAngle: Double, originalEndAngle: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSvgArc")(radius.asInstanceOf[js.Any], originalStartAngle.asInstanceOf[js.Any], originalEndAngle.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getNormalizedAngle(angle: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNormalizedAngle")(angle.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def svgEllipticalArcCommand(radius: Double, largeArcFlag: `0` | `1`, sweepFlag: `0` | `1`, x: Double, y: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("svgEllipticalArcCommand")(radius.asInstanceOf[js.Any], largeArcFlag.asInstanceOf[js.Any], sweepFlag.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useFilteredDataBySkipAngle[Datum /* <: DatumWithArc */](data: js.Array[Datum], skipAngle: Double): js.Array[Datum] = (^.asInstanceOf[js.Dynamic].applyDynamic("useFilteredDataBySkipAngle")(data.asInstanceOf[js.Any], skipAngle.asInstanceOf[js.Any])).asInstanceOf[js.Array[Datum]]
}
