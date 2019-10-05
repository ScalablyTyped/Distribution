package typings.meteorDashTypings.Meteor

import typings.meteorDashTypings.Anon_OnResultReceived
import typings.meteorDashTypings.EJSONable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor.apply")
@js.native
object apply extends js.Object {
  def apply(name: String, args: js.Array[EJSONable]): js.Any = js.native
  def apply(name: String, args: js.Array[EJSONable], options: Anon_OnResultReceived): js.Any = js.native
  def apply(
    name: String,
    args: js.Array[EJSONable],
    options: Anon_OnResultReceived,
    asyncCallback: js.Function
  ): js.Any = js.native
}

