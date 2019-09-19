package typings.orientjs.orientjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasePoolConfig extends js.Object {
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var pool: js.UndefOr[BasePool] = js.undefined
}

object BasePoolConfig {
  @scala.inline
  def apply(max: Int | Double = null, min: Int | Double = null, pool: BasePool = null): BasePoolConfig = {
    val __obj = js.Dynamic.literal()
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (pool != null) __obj.updateDynamic("pool")(pool)
    __obj.asInstanceOf[BasePoolConfig]
  }
}

