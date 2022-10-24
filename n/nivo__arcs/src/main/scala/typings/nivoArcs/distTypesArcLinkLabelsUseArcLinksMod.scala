package typings.nivoArcs

import typings.nivoArcs.anon.ComputeExtraProps
import typings.nivoArcs.distTypesArcLinkLabelsTypesMod.ArcLinkWithDatum
import typings.nivoArcs.distTypesTypesMod.DatumWithArc
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLinkLabelsUseArcLinksMod {
  
  @JSImport("@nivo/arcs/dist/types/arc_link_labels/useArcLinks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useArcLinks[Datum /* <: DatumWithArc */, ExtraProps /* <: Record[String, Any] */](param0: ComputeExtraProps[Datum, ExtraProps]): js.Array[ArcLinkWithDatum[Datum] & ExtraProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcLinks")(param0.asInstanceOf[js.Any]).asInstanceOf[js.Array[ArcLinkWithDatum[Datum] & ExtraProps]]
}
