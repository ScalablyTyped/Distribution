package typings.nukaCarousel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Positions extends StObject
@JSImport("nuka-carousel", "Positions")
@js.native
object Positions extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Positions & String] = js.native
  
  @js.native
  sealed trait BottomCenter
    extends StObject
       with Positions
  /* "BottomCenter" */ val BottomCenter: typings.nukaCarousel.mod.Positions.BottomCenter & String = js.native
  
  @js.native
  sealed trait BottomLeft
    extends StObject
       with Positions
  /* "BottomLeft" */ val BottomLeft: typings.nukaCarousel.mod.Positions.BottomLeft & String = js.native
  
  @js.native
  sealed trait BottomRight
    extends StObject
       with Positions
  /* "BottomRight" */ val BottomRight: typings.nukaCarousel.mod.Positions.BottomRight & String = js.native
  
  @js.native
  sealed trait CenterCenter
    extends StObject
       with Positions
  /* "CenterCenter" */ val CenterCenter: typings.nukaCarousel.mod.Positions.CenterCenter & String = js.native
  
  @js.native
  sealed trait CenterLeft
    extends StObject
       with Positions
  /* "CenterLeft" */ val CenterLeft: typings.nukaCarousel.mod.Positions.CenterLeft & String = js.native
  
  @js.native
  sealed trait CenterRight
    extends StObject
       with Positions
  /* "CenterRight" */ val CenterRight: typings.nukaCarousel.mod.Positions.CenterRight & String = js.native
  
  @js.native
  sealed trait TopCenter
    extends StObject
       with Positions
  /* "TopCenter" */ val TopCenter: typings.nukaCarousel.mod.Positions.TopCenter & String = js.native
  
  @js.native
  sealed trait TopLeft
    extends StObject
       with Positions
  /* "TopLeft" */ val TopLeft: typings.nukaCarousel.mod.Positions.TopLeft & String = js.native
  
  @js.native
  sealed trait TopRight
    extends StObject
       with Positions
  /* "TopRight" */ val TopRight: typings.nukaCarousel.mod.Positions.TopRight & String = js.native
}
