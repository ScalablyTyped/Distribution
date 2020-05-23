package typings.mobx.tojsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToJSOptions extends js.Object {
  var detectCycles: js.UndefOr[Boolean] = js.undefined
  var exportMapsAsObjects: js.UndefOr[Boolean] = js.undefined
  var recurseEverything: js.UndefOr[Boolean] = js.undefined
}

object ToJSOptions {
  @scala.inline
  def apply(
    detectCycles: js.UndefOr[Boolean] = js.undefined,
    exportMapsAsObjects: js.UndefOr[Boolean] = js.undefined,
    recurseEverything: js.UndefOr[Boolean] = js.undefined
  ): ToJSOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(detectCycles)) __obj.updateDynamic("detectCycles")(detectCycles.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exportMapsAsObjects)) __obj.updateDynamic("exportMapsAsObjects")(exportMapsAsObjects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(recurseEverything)) __obj.updateDynamic("recurseEverything")(recurseEverything.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToJSOptions]
  }
}

