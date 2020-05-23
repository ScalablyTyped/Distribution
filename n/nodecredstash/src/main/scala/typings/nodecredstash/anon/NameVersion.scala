package typings.nodecredstash.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NameVersion extends js.Object {
  var name: String
  var version: Double
}

object NameVersion {
  @scala.inline
  def apply(name: String, version: Double): NameVersion = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameVersion]
  }
}

