package typings.oracleOraclejet.ojmoduleElementMod

import typings.oracleOraclejet.anon.CleanupMode
import typings.oracleOraclejet.mod.JetSettableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojModuleSettableProperties extends JetSettableProperties {
  var animation: js.Object
  var config: CleanupMode
}

object ojModuleSettableProperties {
  @scala.inline
  def apply(animation: js.Object, config: CleanupMode): ojModuleSettableProperties = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any])
    __obj.asInstanceOf[ojModuleSettableProperties]
  }
}

