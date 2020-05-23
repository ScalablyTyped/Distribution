package typings.pdfmake.anon

import typings.pdfmake.interfacesMod.OrderedListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Counter extends js.Object {
  var counter: js.UndefOr[Double] = js.undefined
  var listType: js.UndefOr[OrderedListType] = js.undefined
}

object Counter {
  @scala.inline
  def apply(counter: js.UndefOr[Double] = js.undefined, listType: OrderedListType = null): Counter = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(counter)) __obj.updateDynamic("counter")(counter.get.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Counter]
  }
}

