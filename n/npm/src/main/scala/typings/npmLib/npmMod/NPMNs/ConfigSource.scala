package typings
package npmLib.npmMod.NPMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigSource extends js.Object {
  var path: java.lang.String
  var `type`: java.lang.String
}

object ConfigSource {
  @scala.inline
  def apply(path: java.lang.String, `type`: java.lang.String): ConfigSource = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[ConfigSource]
  }
}

