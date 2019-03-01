package typings
package npmLib.npmMod.NPMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigDefs extends js.Object {
  var defaults: ConfigOptions
  var types: ConfigTypes
}

object ConfigDefs {
  @scala.inline
  def apply(defaults: ConfigOptions, types: ConfigTypes): ConfigDefs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[ConfigDefs]
  }
}

