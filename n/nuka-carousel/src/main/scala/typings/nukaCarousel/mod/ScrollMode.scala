package typings.nukaCarousel.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ScrollMode extends StObject
@JSImport("nuka-carousel", "ScrollMode")
@js.native
object ScrollMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ScrollMode & String] = js.native
  
  @js.native
  sealed trait page
    extends StObject
       with ScrollMode
  /* "page" */ val page: typings.nukaCarousel.mod.ScrollMode.page & String = js.native
  
  @js.native
  sealed trait remainder
    extends StObject
       with ScrollMode
  /* "remainder" */ val remainder: typings.nukaCarousel.mod.ScrollMode.remainder & String = js.native
}
