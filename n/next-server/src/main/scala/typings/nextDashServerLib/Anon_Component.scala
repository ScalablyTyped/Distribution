package typings
package nextDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Component extends js.Object {
  var Component: reactLib.reactMod.ReactNs.ComponentType[_]
  var err: js.Any
}

object Anon_Component {
  @scala.inline
  def apply(Component: reactLib.reactMod.ReactNs.ComponentType[_], err: js.Any): Anon_Component = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    __obj.updateDynamic("err")(err)
    __obj.asInstanceOf[Anon_Component]
  }
}

