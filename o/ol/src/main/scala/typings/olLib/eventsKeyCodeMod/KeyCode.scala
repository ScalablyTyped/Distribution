package typings
package olLib.eventsKeyCodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyCode extends js.Object

@JSImport("ol/events/KeyCode", "KeyCode")
@js.native
object KeyCode extends js.Object {
  @js.native
  sealed trait DOWN
    extends olLib.eventsKeyCodeMod.KeyCode
  
  @js.native
  sealed trait LEFT
    extends olLib.eventsKeyCodeMod.KeyCode
  
  @js.native
  sealed trait RIGHT
    extends olLib.eventsKeyCodeMod.KeyCode
  
  @js.native
  sealed trait UP
    extends olLib.eventsKeyCodeMod.KeyCode
  
}

