package typings.phantomjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Architecture extends js.Object {
  var architecture: String
  var name: String
  var version: String
}

object Architecture {
  @scala.inline
  def apply(architecture: String, name: String, version: String): Architecture = {
    val __obj = js.Dynamic.literal(architecture = architecture.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Architecture]
  }
}

