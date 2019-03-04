package typings
package megajsLib.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MakeDirectoryOptions extends js.Object {
  var attributes: js.UndefOr[js.Object] = js.undefined
  var key: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
  var name: java.lang.String
}

object MakeDirectoryOptions {
  @scala.inline
  def apply(
    name: java.lang.String,
    attributes: js.Object = null,
    key: java.lang.String | nodeLib.Buffer = null
  ): MakeDirectoryOptions = {
    val __obj = js.Dynamic.literal(name = name)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[MakeDirectoryOptions]
  }
}

