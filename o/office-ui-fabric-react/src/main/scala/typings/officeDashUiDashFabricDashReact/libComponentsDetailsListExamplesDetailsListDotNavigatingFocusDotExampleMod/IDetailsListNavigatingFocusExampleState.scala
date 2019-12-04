package typings.officeDashUiDashFabricDashReact.libComponentsDetailsListExamplesDetailsListDotNavigatingFocusDotExampleMod

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
  def apply(items: js.Array[String], key: Double, initialFocusedIndex: Int | Double = null): IDetailsListNavigatingFocusExampleState = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    if (initialFocusedIndex != null) __obj.updateDynamic("initialFocusedIndex")(initialFocusedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsListNavigatingFocusExampleState]
  }
}

