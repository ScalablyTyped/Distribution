package typings.pdfmake

import typings.pdfmake.interfacesMod.OrderedListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCounter extends js.Object {
  var counter: js.UndefOr[Double] = js.undefined
  var listType: js.UndefOr[OrderedListType] = js.undefined
}

object AnonCounter {
  @scala.inline
  def apply(counter: Int | Double = null, listType: OrderedListType = null): AnonCounter = {
    val __obj = js.Dynamic.literal()
    if (counter != null) __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCounter]
  }
}

