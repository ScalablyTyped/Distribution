package typings.openfin.wireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceConfig extends js.Object {
  var manifestUrl: String
  var name: String
}

object ServiceConfig {
  @scala.inline
  def apply(manifestUrl: String, name: String): ServiceConfig = {
    val __obj = js.Dynamic.literal(manifestUrl = manifestUrl.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceConfig]
  }
}

