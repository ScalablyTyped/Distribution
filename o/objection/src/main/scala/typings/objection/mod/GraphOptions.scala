package typings.objection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphOptions extends js.Object {
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  var joinOperation: String
  var maxBatchSize: js.UndefOr[Double] = js.undefined
  var minimize: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
}

object GraphOptions {
  @scala.inline
  def apply(
    joinOperation: String,
    aliases: js.Array[String] = null,
    maxBatchSize: Int | Double = null,
    minimize: js.UndefOr[Boolean] = js.undefined,
    separator: String = null
  ): GraphOptions = {
    val __obj = js.Dynamic.literal(joinOperation = joinOperation.asInstanceOf[js.Any])
    if (aliases != null) __obj.updateDynamic("aliases")(aliases.asInstanceOf[js.Any])
    if (maxBatchSize != null) __obj.updateDynamic("maxBatchSize")(maxBatchSize.asInstanceOf[js.Any])
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphOptions]
  }
}

