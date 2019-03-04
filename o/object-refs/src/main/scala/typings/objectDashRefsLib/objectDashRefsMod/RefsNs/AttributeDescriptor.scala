package typings
package objectDashRefsLib.objectDashRefsMod.RefsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeDescriptor extends js.Object {
  var collection: js.UndefOr[scala.Boolean] = js.undefined
  var enumerable: js.UndefOr[scala.Boolean] = js.undefined
  var name: java.lang.String
}

object AttributeDescriptor {
  @scala.inline
  def apply(
    name: java.lang.String,
    collection: js.UndefOr[scala.Boolean] = js.undefined,
    enumerable: js.UndefOr[scala.Boolean] = js.undefined
  ): AttributeDescriptor = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(collection)) __obj.updateDynamic("collection")(collection)
    if (!js.isUndefined(enumerable)) __obj.updateDynamic("enumerable")(enumerable)
    __obj.asInstanceOf[AttributeDescriptor]
  }
}

