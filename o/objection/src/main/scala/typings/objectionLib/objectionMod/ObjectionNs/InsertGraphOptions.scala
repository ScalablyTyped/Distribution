package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertGraphOptions extends js.Object {
  var relate: js.UndefOr[scala.Boolean | js.Array[java.lang.String]] = js.undefined
}

object InsertGraphOptions {
  @scala.inline
  def apply(relate: scala.Boolean | js.Array[java.lang.String] = null): InsertGraphOptions = {
    val __obj = js.Dynamic.literal()
    if (relate != null) __obj.updateDynamic("relate")(relate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertGraphOptions]
  }
}

