package typings.officeUiFabricReact.tagPickerTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITag extends js.Object {
  /** Unique key for the item. */
  var key: String | Double
  /** Name of the item. */
  var name: String
}

object ITag {
  @scala.inline
  def apply(key: String | Double, name: String): ITag = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITag]
  }
}

