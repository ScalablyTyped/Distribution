package typings.nukaCarousel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Alignment extends StObject
/** @deprecated use string literals for the values instead */
@JSImport("nuka-carousel", "Alignment")
@js.native
object Alignment extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Alignment & String] = js.native
  
  @js.native
  sealed trait Center
    extends StObject
       with Alignment
  /* "center" */ val Center: typings.nukaCarousel.mod.Alignment.Center & String = js.native
  
  @js.native
  sealed trait Left
    extends StObject
       with Alignment
  /* "left" */ val Left: typings.nukaCarousel.mod.Alignment.Left & String = js.native
  
  @js.native
  sealed trait Right
    extends StObject
       with Alignment
  /* "right" */ val Right: typings.nukaCarousel.mod.Alignment.Right & String = js.native
}
