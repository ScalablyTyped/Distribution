package typings.nivoArcs

import typings.nivoArcs.typesMod.ArcLinkLabel
import typings.nivoArcs.typesTypesMod.DatumWithArcAndColor
import typings.nivoCore.mod.CompleteTheme
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcLinkLabelsCanvasMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_link_labels/canvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawCanvasArcLinkLabels[Datum /* <: DatumWithArcAndColor */](
    ctx: CanvasRenderingContext2D,
    labels: js.Array[ArcLinkLabel[Datum]],
    theme: CompleteTheme,
    strokeWidth: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("drawCanvasArcLinkLabels")(ctx.asInstanceOf[js.Any], labels.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], strokeWidth.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
