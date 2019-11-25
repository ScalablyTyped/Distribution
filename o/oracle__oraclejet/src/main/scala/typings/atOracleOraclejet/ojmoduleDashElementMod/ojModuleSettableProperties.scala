package typings.atOracleOraclejet.ojmoduleDashElementMod

import typings.atOracleOraclejet.Anon_CleanupMode
import typings.atOracleOraclejet.atOracleOraclejetMod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojModuleSettableProperties extends JetSettableProperties {
  var animation: js.Object
  var config: Anon_CleanupMode
}

object ojModuleSettableProperties {
  @scala.inline
  def apply(animation: js.Object, config: Anon_CleanupMode): ojModuleSettableProperties = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ojModuleSettableProperties]
  }
}

