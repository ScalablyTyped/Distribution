package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyBaseDefinition extends js.Object {
  var description: js.UndefOr[String | DescriptionDefinition] = js.undefined
}

object PropertyBaseDefinition {
  @scala.inline
  def apply(description: String | DescriptionDefinition = null): PropertyBaseDefinition = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyBaseDefinition]
  }
}

