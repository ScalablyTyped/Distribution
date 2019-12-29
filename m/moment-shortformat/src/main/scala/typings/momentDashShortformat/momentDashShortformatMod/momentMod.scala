package typings.momentDashShortformat.momentDashShortformatMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("moment", JSImport.Namespace)
@js.native
object momentMod extends js.Object {
  @js.native
  trait Moment extends js.Object {
    def short(): String = js.native
    def short(withoutPreOrSuffix: Boolean): String = js.native
    def short(withoutPreOrSuffix: Boolean, now: Moment): String = js.native
  }
  
}

