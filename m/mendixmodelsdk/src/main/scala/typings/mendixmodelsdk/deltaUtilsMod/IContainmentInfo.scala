package typings.mendixmodelsdk.deltaUtilsMod

import typings.mendixmodelsdk.elementsMod.AbstractElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContainmentInfo extends js.Object {
  var element: AbstractElement
  var index: js.UndefOr[Double] = js.undefined
  var parentId: String
  var parentPropertyName: String
}

object IContainmentInfo {
  @scala.inline
  def apply(
    element: AbstractElement,
    parentId: String,
    parentPropertyName: String,
    index: js.UndefOr[Double] = js.undefined
  ): IContainmentInfo = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], parentPropertyName = parentPropertyName.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContainmentInfo]
  }
}

