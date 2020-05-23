package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdName extends js.Object {
  var id: Double
  var name: String
  var url: String
}

object IdName {
  @scala.inline
  def apply(id: Double, name: String, url: String): IdName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdName]
  }
}

