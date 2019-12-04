package typings.mendixmodelsdk.distSdkInternalDeltasDeltaUtilsMod

import typings.mendixmodelsdk.distSdkInternalElementsMod.AbstractElement
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
  def apply(element: AbstractElement, parentId: String, parentPropertyName: String, index: Int | Double = null): IContainmentInfo = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], parentPropertyName = parentPropertyName.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContainmentInfo]
  }
}

