package typings
package navigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Any
  var state: navigationLib.navigationMod.State
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Any, state: navigationLib.navigationMod.State): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[Anon_Data]
  }
}

