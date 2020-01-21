package typings.nodecredstash

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameVersion extends js.Object {
  var name: String
  var version: Double
}

object AnonNameVersion {
  @scala.inline
  def apply(name: String, version: Double): AnonNameVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNameVersion]
  }
}

