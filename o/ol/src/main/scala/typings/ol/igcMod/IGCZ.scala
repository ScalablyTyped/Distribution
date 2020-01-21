package typings.ol.igcMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IGCZ extends js.Object

@JSImport("ol/format/IGC", "IGCZ")
@js.native
object IGCZ extends js.Object {
  @js.native
  sealed trait BAROMETRIC extends IGCZ
  
  @js.native
  sealed trait GPS extends IGCZ
  
  @js.native
  sealed trait NONE extends IGCZ
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IGCZ with String] = js.native
  /* "barometric" */ @js.native
  object BAROMETRIC extends TopLevel[BAROMETRIC with String]
  
  /* "gps" */ @js.native
  object GPS extends TopLevel[GPS with String]
  
  /* "none" */ @js.native
  object NONE extends TopLevel[NONE with String]
  
}

