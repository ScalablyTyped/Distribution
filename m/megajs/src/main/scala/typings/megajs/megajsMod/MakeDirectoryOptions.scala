package typings.megajs.megajsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeDirectoryOptions extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var key: js.UndefOr[String | Buffer] = js.undefined
  var name: String
}

object MakeDirectoryOptions {
  @scala.inline
  def apply(name: String, attributes: js.Object = null, key: String | Buffer = null): MakeDirectoryOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeDirectoryOptions]
  }
}

