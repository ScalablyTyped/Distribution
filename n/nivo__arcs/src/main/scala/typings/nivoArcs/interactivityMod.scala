package typings.nivoArcs

import typings.nivoArcs.typesTypesMod.Arc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interactivityMod {
  
  @JSImport("@nivo/arcs/dist/types/interactivity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findArcUnderCursor[A /* <: Arc */](
    centerX: Double,
    centerY: Double,
    radius: Double,
    innerRadius: Double,
    arcs: js.Array[A],
    cursorX: Double,
    cursorY: Double
  ): js.UndefOr[A] = (^.asInstanceOf[js.Dynamic].applyDynamic("findArcUnderCursor")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], innerRadius.asInstanceOf[js.Any], arcs.asInstanceOf[js.Any], cursorX.asInstanceOf[js.Any], cursorY.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[A]]
  
  inline def isCursorInRing(
    centerX: Double,
    centerY: Double,
    radius: Double,
    innerRadius: Double,
    cursorX: Double,
    cursorY: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isCursorInRing")(centerX.asInstanceOf[js.Any], centerY.asInstanceOf[js.Any], radius.asInstanceOf[js.Any], innerRadius.asInstanceOf[js.Any], cursorX.asInstanceOf[js.Any], cursorY.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
