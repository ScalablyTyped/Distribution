package typings.nivoArcs

import typings.nivoArcs.anon.Transition
import typings.nivoArcs.arcTransitionModeMod.ArcTransitionMode
import typings.nivoArcs.arcTransitionModeMod.TransitionExtra
import typings.nivoArcs.typesTypesMod.DatumWithArc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useArcsTransitionMod {
  
  @JSImport("@nivo/arcs/dist/types/useArcsTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useArcsTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum]): Transition = ^.asInstanceOf[js.Dynamic].applyDynamic("useArcsTransition")(data.asInstanceOf[js.Any]).asInstanceOf[Transition]
  inline def useArcsTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], mode: Unit, extra: TransitionExtra[Datum, ExtraProps]): Transition = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcsTransition")(data.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Transition]
  inline def useArcsTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], mode: ArcTransitionMode): Transition = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcsTransition")(data.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Transition]
  inline def useArcsTransition[Datum /* <: DatumWithArc */, ExtraProps](data: js.Array[Datum], mode: ArcTransitionMode, extra: TransitionExtra[Datum, ExtraProps]): Transition = (^.asInstanceOf[js.Dynamic].applyDynamic("useArcsTransition")(data.asInstanceOf[js.Any], mode.asInstanceOf[js.Any], extra.asInstanceOf[js.Any])).asInstanceOf[Transition]
}
