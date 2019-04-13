package typings
package nouisliderLib.nouisliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PipFilterResult extends js.Object

@JSImport("nouislider", "PipFilterResult")
@js.native
object PipFilterResult extends js.Object {
  @js.native
  sealed trait LargeValue
    extends nouisliderLib.nouisliderMod.PipFilterResult
  
  @js.native
  sealed trait NoValue
    extends nouisliderLib.nouisliderMod.PipFilterResult
  
  @js.native
  sealed trait SmallValue
    extends nouisliderLib.nouisliderMod.PipFilterResult
  
  val LargeValue: LargeValue with java.lang.String = js.native
  val NoValue: NoValue with java.lang.String = js.native
  val SmallValue: SmallValue with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[nouisliderLib.nouisliderMod.PipFilterResult with java.lang.String] = js.native
}

