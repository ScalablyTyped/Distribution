package typings.oracleOraclejet

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParent[K] extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[K] = js.undefined
  var parent: js.UndefOr[Element] = js.undefined
}

object AnonParent {
  @scala.inline
  def apply[K](index: Int | Double = null, key: K = null, parent: Element = null): AnonParent[K] = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParent[K]]
  }
}

