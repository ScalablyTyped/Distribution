package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "Converter")
@js.native
abstract class Converter () extends RalModule {
  var isStreamify: nodeDashRalLib.nodeDashRalLibNumbers.`false` = js.native
  def pack(config: Service, data: js.Any): nodeLib.Buffer = js.native
  def unpack(config: Service, data: js.Any): js.Any = js.native
}

