package typings.momentShortformat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("moment", JSImport.Namespace)
@js.native
object momentAugmentingMod extends js.Object {
  
  @js.native
  trait Moment extends js.Object {
    
    def short(): String = js.native
    def short(withoutPreOrSuffix: js.UndefOr[scala.Nothing], now: Moment): String = js.native
    def short(withoutPreOrSuffix: Boolean): String = js.native
    def short(withoutPreOrSuffix: Boolean, now: Moment): String = js.native
  }
}
