package typings.nukaCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Directions extends StObject
@JSImport("nuka-carousel/lib/types", "Directions")
@js.native
object Directions extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Directions & String] = js.native
  
  @js.native
  sealed trait Down
    extends StObject
       with Directions
  /* "down" */ val Down: typings.nukaCarousel.libTypesMod.Directions.Down & String = js.native
  
  @js.native
  sealed trait Next
    extends StObject
       with Directions
  /* "next" */ val Next: typings.nukaCarousel.libTypesMod.Directions.Next & String = js.native
  
  @js.native
  sealed trait Prev
    extends StObject
       with Directions
  /* "prev" */ val Prev: typings.nukaCarousel.libTypesMod.Directions.Prev & String = js.native
  
  @js.native
  sealed trait Up
    extends StObject
       with Directions
  /* "up" */ val Up: typings.nukaCarousel.libTypesMod.Directions.Up & String = js.native
}
