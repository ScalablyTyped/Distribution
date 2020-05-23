package typings.officeUiFabricReact.detailsListNavigatingFocusExampleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsListNavigatingFocusExampleState extends js.Object {
  var initialFocusedIndex: js.UndefOr[Double] = js.undefined
  var items: js.Array[String]
  var key: Double
}

object IDetailsListNavigatingFocusExampleState {
  @scala.inline
  def apply(items: js.Array[String], key: Double, initialFocusedIndex: js.UndefOr[Double] = js.undefined): IDetailsListNavigatingFocusExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(initialFocusedIndex)) __obj.updateDynamic("initialFocusedIndex")(initialFocusedIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListNavigatingFocusExampleState]
  }
}

