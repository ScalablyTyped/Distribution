package typings
package olLib.sourceStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait State extends js.Object

@JSImport("ol/source/State", "State")
@js.native
object State extends js.Object {
  @js.native
  sealed trait ERROR
    extends olLib.sourceStateMod.State
  
  @js.native
  sealed trait LOADING
    extends olLib.sourceStateMod.State
  
  @js.native
  sealed trait READY
    extends olLib.sourceStateMod.State
  
  @js.native
  sealed trait UNDEFINED
    extends olLib.sourceStateMod.State
  
}

