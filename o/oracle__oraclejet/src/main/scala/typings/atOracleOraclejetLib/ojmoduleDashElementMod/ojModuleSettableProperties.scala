package typings
package atOracleOraclejetLib.ojmoduleDashElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojModuleSettableProperties
  extends atOracleOraclejetLib.atOracleOraclejetMod.JetSettableProperties {
  var animation: js.Object
  var config: atOracleOraclejetLib.Anon_CleanupMode
}

object ojModuleSettableProperties {
  @scala.inline
  def apply(animation: js.Object, config: atOracleOraclejetLib.Anon_CleanupMode): ojModuleSettableProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animation")(animation)
    __obj.updateDynamic("config")(config)
    __obj.asInstanceOf[ojModuleSettableProperties]
  }
}

