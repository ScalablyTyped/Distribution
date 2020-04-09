package typings.pdfmake

import typings.pdfmake.interfacesMod.UnorderedListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonListType extends js.Object {
  var listType: js.UndefOr[UnorderedListType] = js.undefined
}

object AnonListType {
  @scala.inline
  def apply(listType: UnorderedListType = null): AnonListType = {
    val __obj = js.Dynamic.literal()
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonListType]
  }
}

