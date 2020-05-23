package typings.officeUiFabricReact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var description: String
  var key: String
  var name: String
  var value: js.Any
}

object Key {
  @scala.inline
  def apply(description: String, key: String, name: String, value: js.Any): Key = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

