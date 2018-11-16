package typings
package nodeDashRalLib.nodeDashRalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "ConfigNormalizer")
@js.native
abstract class ConfigNormalizer () extends RalModule {
  def needUpdate(): scala.Boolean = js.native
  def needUpdate(config: js.Any): scala.Boolean = js.native
  def normalizeConfig(config: js.Any): Config = js.native
}

