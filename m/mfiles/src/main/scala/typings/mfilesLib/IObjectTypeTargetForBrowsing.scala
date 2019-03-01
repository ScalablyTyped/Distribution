package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeTargetForBrowsing extends js.Object {
  var TargetObjectType: scala.Double
  var ViewCollection: scala.Double
  def Clone(): IObjectTypeTargetForBrowsing
}

object IObjectTypeTargetForBrowsing {
  @scala.inline
  def apply(
    Clone: js.Function0[IObjectTypeTargetForBrowsing],
    TargetObjectType: scala.Double,
    ViewCollection: scala.Double
  ): IObjectTypeTargetForBrowsing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Clone")(Clone)
    __obj.updateDynamic("TargetObjectType")(TargetObjectType)
    __obj.updateDynamic("ViewCollection")(ViewCollection)
    __obj.asInstanceOf[IObjectTypeTargetForBrowsing]
  }
}

