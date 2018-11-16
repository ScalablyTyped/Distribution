package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "Protocol")
@js.native
abstract class Protocol () extends RalModule {
  def _request(config: js.Any, callback: js.Function1[/* repeated */js.Any, _]): js.Any = js.native
  def beforeRequest(context: js.Any): js.Any = js.native
  def normalizeConfig(context: js.Any): js.Any = js.native
  def talk(config: js.Any, callback: js.Any): js.Any = js.native
}

@JSImport("node-ral", "Protocol")
@js.native
object Protocol extends js.Object {
  def beforeRequest(context: js.Any): js.Any = js.native
  def normalizeConfig(context: js.Any): js.Any = js.native
}

