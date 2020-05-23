package typings.mithril.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: js.UndefOr[String | Double] = js.undefined
}

object Key {
  @scala.inline
  def apply(key: String | Double = null): Key = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

