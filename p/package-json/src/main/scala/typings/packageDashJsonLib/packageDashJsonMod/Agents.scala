package typings
package packageDashJsonLib.packageDashJsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agents extends js.Object {
  var http: js.UndefOr[nodeLib.httpMod.Agent] = js.undefined
  var https: js.UndefOr[nodeLib.httpsMod.Agent] = js.undefined
}

object Agents {
  @scala.inline
  def apply(http: nodeLib.httpMod.Agent = null, https: nodeLib.httpsMod.Agent = null): Agents = {
    val __obj = js.Dynamic.literal()
    if (http != null) __obj.updateDynamic("http")(http)
    if (https != null) __obj.updateDynamic("https")(https)
    __obj.asInstanceOf[Agents]
  }
}

