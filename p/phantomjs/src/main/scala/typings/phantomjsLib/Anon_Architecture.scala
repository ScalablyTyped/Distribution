package typings
package phantomjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Architecture extends js.Object {
  var architecture: java.lang.String
  var name: java.lang.String
  var version: java.lang.String
}

object Anon_Architecture {
  @scala.inline
  def apply(architecture: java.lang.String, name: java.lang.String, version: java.lang.String): Anon_Architecture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("architecture")(architecture)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Architecture]
  }
}

