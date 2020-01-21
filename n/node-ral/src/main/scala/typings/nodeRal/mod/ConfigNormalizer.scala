package typings.nodeRal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-ral", "ConfigNormalizer")
@js.native
abstract class ConfigNormalizer () extends RalModule {
  def needUpdate(): Boolean = js.native
  def needUpdate(config: js.Any): Boolean = js.native
  def normalizeConfig(config: js.Any): Config = js.native
}

