package typings.objection.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertGraphOptions extends js.Object {
  var relate: js.UndefOr[Boolean | js.Array[String]] = js.undefined
}

object InsertGraphOptions {
  @scala.inline
  def apply(relate: Boolean | js.Array[String] = null): InsertGraphOptions = {
    val __obj = js.Dynamic.literal()
    if (relate != null) __obj.updateDynamic("relate")(relate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertGraphOptions]
  }
}

