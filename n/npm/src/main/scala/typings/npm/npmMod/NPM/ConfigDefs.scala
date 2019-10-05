package typings.npm.npmMod.NPM

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
    val __obj = js.Dynamic.literal(defaults = defaults, types = types)
  
    __obj.asInstanceOf[ConfigDefs]
  }
}

