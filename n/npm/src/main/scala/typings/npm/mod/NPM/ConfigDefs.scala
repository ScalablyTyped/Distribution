package typings.npm.mod.NPM

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
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConfigDefs]
  }
}

