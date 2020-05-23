package typings.postcssReporter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Default plugin options
  */
trait DefaultOptions extends js.Object {
  /**
    * If true, no exclamatory triangle icons will be printed next to warnings.
    * @default false
    */
  var noIcon: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, plugin names will not be printed in brackets after messages.
    * @default false
    */
  var noPlugin: js.UndefOr[Boolean] = js.undefined
  /**
    * If false, messages will not be sorted by line/column position.
    * @default true
    */
  var sortByPosition: js.UndefOr[Boolean] = js.undefined
}

object DefaultOptions {
  @scala.inline
  def apply(
    noIcon: js.UndefOr[Boolean] = js.undefined,
    noPlugin: js.UndefOr[Boolean] = js.undefined,
    sortByPosition: js.UndefOr[Boolean] = js.undefined
  ): DefaultOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noIcon)) __obj.updateDynamic("noIcon")(noIcon.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noPlugin)) __obj.updateDynamic("noPlugin")(noPlugin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sortByPosition)) __obj.updateDynamic("sortByPosition")(sortByPosition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultOptions]
  }
}

