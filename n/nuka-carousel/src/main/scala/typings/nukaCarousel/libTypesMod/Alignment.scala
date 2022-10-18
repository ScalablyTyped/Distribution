package typings.nukaCarousel.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Alignment extends StObject
@JSImport("nuka-carousel/lib/types", "Alignment")
@js.native
object Alignment extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Alignment & String] = js.native
  
  @js.native
  sealed trait Center
    extends StObject
       with Alignment
  /* "center" */ val Center: typings.nukaCarousel.libTypesMod.Alignment.Center & String = js.native
  
  @js.native
  sealed trait Left
    extends StObject
       with Alignment
  /* "left" */ val Left: typings.nukaCarousel.libTypesMod.Alignment.Left & String = js.native
  
  @js.native
  sealed trait Right
    extends StObject
       with Alignment
  /* "right" */ val Right: typings.nukaCarousel.libTypesMod.Alignment.Right & String = js.native
}
