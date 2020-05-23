package typings.mediumEditor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Prop extends js.Object {
  var prop: String
  var value: String
}

object Prop {
  @scala.inline
  def apply(prop: String, value: String): Prop = {
    val __obj = js.Dynamic.literal(prop = prop.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Prop]
  }
}

