package typings.overwatchApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  var title: String
  var value: String
}

object Stat {
  @scala.inline
  def apply(title: String, value: String): Stat = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stat]
  }
}

