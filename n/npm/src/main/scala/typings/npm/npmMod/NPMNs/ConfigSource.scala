package typings.npm.npmMod.NPMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigSource extends js.Object {
  var path: String
  var `type`: String
}

object ConfigSource {
  @scala.inline
  def apply(path: String, `type`: String): ConfigSource = {
    val __obj = js.Dynamic.literal(path = path)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConfigSource]
  }
}

