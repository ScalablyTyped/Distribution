package typings.nukaCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Positions extends StObject
@JSImport("nuka-carousel/lib/types", "Positions")
@js.native
object Positions extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Positions & String] = js.native
  
  @js.native
  sealed trait BottomCenter
    extends StObject
       with Positions
  /* "BottomCenter" */ val BottomCenter: typings.nukaCarousel.libTypesMod.Positions.BottomCenter & String = js.native
  
  @js.native
  sealed trait BottomLeft
    extends StObject
       with Positions
  /* "BottomLeft" */ val BottomLeft: typings.nukaCarousel.libTypesMod.Positions.BottomLeft & String = js.native
  
  @js.native
  sealed trait BottomRight
    extends StObject
       with Positions
  /* "BottomRight" */ val BottomRight: typings.nukaCarousel.libTypesMod.Positions.BottomRight & String = js.native
  
  @js.native
  sealed trait CenterCenter
    extends StObject
       with Positions
  /* "CenterCenter" */ val CenterCenter: typings.nukaCarousel.libTypesMod.Positions.CenterCenter & String = js.native
  
  @js.native
  sealed trait CenterLeft
    extends StObject
       with Positions
  /* "CenterLeft" */ val CenterLeft: typings.nukaCarousel.libTypesMod.Positions.CenterLeft & String = js.native
  
  @js.native
  sealed trait CenterRight
    extends StObject
       with Positions
  /* "CenterRight" */ val CenterRight: typings.nukaCarousel.libTypesMod.Positions.CenterRight & String = js.native
  
  @js.native
  sealed trait TopCenter
    extends StObject
       with Positions
  /* "TopCenter" */ val TopCenter: typings.nukaCarousel.libTypesMod.Positions.TopCenter & String = js.native
  
  @js.native
  sealed trait TopLeft
    extends StObject
       with Positions
  /* "TopLeft" */ val TopLeft: typings.nukaCarousel.libTypesMod.Positions.TopLeft & String = js.native
  
  @js.native
  sealed trait TopRight
    extends StObject
       with Positions
  /* "TopRight" */ val TopRight: typings.nukaCarousel.libTypesMod.Positions.TopRight & String = js.native
}
