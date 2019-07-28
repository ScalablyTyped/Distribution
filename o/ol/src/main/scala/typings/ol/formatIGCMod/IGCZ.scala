package typings.ol.formatIGCMod

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
  
  /* "barometric" */ val BAROMETRIC: typings.ol.formatIGCMod.IGCZ.BAROMETRIC with String = js.native
  /* "gps" */ val GPS: typings.ol.formatIGCMod.IGCZ.GPS with String = js.native
  /* "none" */ val NONE: typings.ol.formatIGCMod.IGCZ.NONE with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[IGCZ with String] = js.native
}

