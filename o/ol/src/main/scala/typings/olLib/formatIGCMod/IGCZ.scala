package typings
package olLib.formatIGCMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IGCZ extends js.Object

@JSImport("ol/format/IGC", "IGCZ")
@js.native
object IGCZ extends js.Object {
  @js.native
  sealed trait BAROMETRIC
    extends olLib.formatIGCMod.IGCZ
  
  @js.native
  sealed trait GPS
    extends olLib.formatIGCMod.IGCZ
  
  @js.native
  sealed trait NONE
    extends olLib.formatIGCMod.IGCZ
  
  /* "barometric" */ val BAROMETRIC: BAROMETRIC with java.lang.String = js.native
  /* "gps" */ val GPS: GPS with java.lang.String = js.native
  /* "none" */ val NONE: NONE with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[olLib.formatIGCMod.IGCZ with java.lang.String] = js.native
}

