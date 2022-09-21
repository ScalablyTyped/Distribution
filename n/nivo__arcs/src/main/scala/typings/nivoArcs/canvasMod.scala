package typings.nivoArcs

import typings.nivoArcs.typesTypesMod.DatumWithArcAndColor
import typings.nivoArcs.useArcLabelsMod.ArcLabel
import typings.nivoCore.mod.CompleteTheme
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object canvasMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_labels/canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawCanvasArcLabels[Datum /* <: DatumWithArcAndColor */](ctx: CanvasRenderingContext2D, labels: js.Array[ArcLabel[Datum]], theme: CompleteTheme): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvasArcLabels")(ctx.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
