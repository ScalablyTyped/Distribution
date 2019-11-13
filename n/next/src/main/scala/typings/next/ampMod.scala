package typings.next

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/amp", JSImport.Namespace)
@js.native
object ampMod extends js.Object {
  def isInAmpMode(): Boolean = js.native
  def isInAmpMode(hasAmpFirstHybridHasQuery: Anon_AmpFirst): Boolean = js.native
  def useAmp(): Boolean = js.native
}

