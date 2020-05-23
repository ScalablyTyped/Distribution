package typings.pdfmake.anon

import typings.pdfmake.interfacesMod.UnorderedListType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListType extends js.Object {
  var listType: js.UndefOr[UnorderedListType] = js.undefined
}

object ListType {
  @scala.inline
  def apply(listType: UnorderedListType = null): ListType = {
    val __obj = js.Dynamic.literal()
    if (listType != null) __obj.updateDynamic("listType")(listType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListType]
  }
}

