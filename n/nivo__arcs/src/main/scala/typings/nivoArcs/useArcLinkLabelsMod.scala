package typings.nivoArcs

import typings.nivoArcs.anon.DiagonalLength
import typings.nivoArcs.nivoArcsStrings.data
import typings.nivoArcs.nivoArcsStrings.points
import typings.nivoArcs.nivoArcsStrings.side
import typings.nivoArcs.typesMod.ArcLinkLabel
import typings.nivoArcs.typesMod.ArcLinkWithDatum
import typings.nivoArcs.typesTypesMod.DatumWithArcAndColor
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useArcLinkLabelsMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_link_labels/useArcLinkLabels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useArcLinkLabels[Datum /* <: DatumWithArcAndColor */](
    hasDataSkipAngleOffsetDiagonalLengthStraightLengthTextOffsetLabelLinkColorTextColor: DiagonalLength[Datum]
  ): js.Array[
    ArcLinkWithDatum[Datum] & (Omit[
      ArcLinkLabel[Datum], 
      /* keyof @nivo/arcs.@nivo/arcs/dist/types/arc_link_labels/types.ArcLinkWithDatum<Datum> */ data | side | points
    ])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinkLabels")(hasDataSkipAngleOffsetDiagonalLengthStraightLengthTextOffsetLabelLinkColorTextColor.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    ArcLinkWithDatum[Datum] & (Omit[
      ArcLinkLabel[Datum], 
      /* keyof @nivo/arcs.@nivo/arcs/dist/types/arc_link_labels/types.ArcLinkWithDatum<Datum> */ data | side | points
    ])
  ]]
}
