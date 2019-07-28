package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectTypeTargetForBrowsing extends js.Object {
  var TargetObjectType: Double
  var ViewCollection: Double
  def Clone(): IObjectTypeTargetForBrowsing
}

object IObjectTypeTargetForBrowsing {
  @scala.inline
  def apply(Clone: () => IObjectTypeTargetForBrowsing, TargetObjectType: Double, ViewCollection: Double): IObjectTypeTargetForBrowsing = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), TargetObjectType = TargetObjectType, ViewCollection = ViewCollection)
  
    __obj.asInstanceOf[IObjectTypeTargetForBrowsing]
  }
}

