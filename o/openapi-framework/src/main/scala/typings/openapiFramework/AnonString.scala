package typings.openapiFramework

import typings.openapiTypes.mod.IJsonSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonString extends js.Object {
  var string: IJsonSchema
}

object AnonString {
  @scala.inline
  def apply(string: IJsonSchema): AnonString = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonString]
  }
}

