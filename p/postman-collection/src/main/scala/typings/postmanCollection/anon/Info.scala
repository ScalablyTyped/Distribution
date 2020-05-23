package typings.postmanCollection.anon

import typings.postmanCollection.mod.PropertyBaseDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  var info: PropertyBaseDefinition
}

object Info {
  @scala.inline
  def apply(info: PropertyBaseDefinition): Info = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
}

