package typings.nukaCarousel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Directions extends StObject
@JSImport("nuka-carousel", "Directions")
@js.native
object Directions extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Directions & String] = js.native
  
  @js.native
  sealed trait Down
    extends StObject
       with Directions
  /* "down" */ val Down: typings.nukaCarousel.mod.Directions.Down & String = js.native
  
  @js.native
  sealed trait Next
    extends StObject
       with Directions
  /* "next" */ val Next: typings.nukaCarousel.mod.Directions.Next & String = js.native
  
  @js.native
  sealed trait Prev
    extends StObject
       with Directions
  /* "prev" */ val Prev: typings.nukaCarousel.mod.Directions.Prev & String = js.native
  
  @js.native
  sealed trait Up
    extends StObject
       with Directions
  /* "up" */ val Up: typings.nukaCarousel.mod.Directions.Up & String = js.native
}
