package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parent[K] extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[K] = js.undefined
  var parent: js.UndefOr[typings.std.Element] = js.undefined
}

object Parent {
  @scala.inline
  def apply[K](index: js.UndefOr[Double] = js.undefined, key: K = null, parent: typings.std.Element = null): Parent[K] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent[K]]
  }
}

