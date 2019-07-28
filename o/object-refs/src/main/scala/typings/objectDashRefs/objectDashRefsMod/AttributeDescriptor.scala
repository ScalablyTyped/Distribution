package typings.objectDashRefs.objectDashRefsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeDescriptor extends js.Object {
  var collection: js.UndefOr[Boolean] = js.undefined
  var enumerable: js.UndefOr[Boolean] = js.undefined
  var name: String
}

object AttributeDescriptor {
  @scala.inline
  def apply(
    name: String,
    collection: js.UndefOr[Boolean] = js.undefined,
    enumerable: js.UndefOr[Boolean] = js.undefined
  ): AttributeDescriptor = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(collection)) __obj.updateDynamic("collection")(collection)
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable)
    __obj.asInstanceOf[AttributeDescriptor]
  }
}

