package typings.officeUiFabricReact.commandBarBaseMod

import typings.officeUiFabricReact.commandBarTypesMod.ICommandBarItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBarData extends js.Object {
  /**
    * Unique string used to cache the width of the command bar
    */
  var cacheKey: String
  /**
    * Items being rendered on the far side
    */
  var farItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.undefined
  /**
    * Length of original overflowItems to ensure that they are not moved into primary region on resize
    */
  var minimumOverflowItems: Double
  /**
    * Items being rendered in the overflow
    */
  var overflowItems: js.Array[ICommandBarItemProps]
  /**
    * Items being rendered in the primary region
    */
  var primaryItems: js.Array[ICommandBarItemProps]
}

object ICommandBarData {
  @scala.inline
  def apply(
    cacheKey: String,
    minimumOverflowItems: Double,
    overflowItems: js.Array[ICommandBarItemProps],
    primaryItems: js.Array[ICommandBarItemProps],
    farItems: js.Array[ICommandBarItemProps] = null
  ): ICommandBarData = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], minimumOverflowItems = minimumOverflowItems.asInstanceOf[js.Any], overflowItems = overflowItems.asInstanceOf[js.Any], primaryItems = primaryItems.asInstanceOf[js.Any])
    if (farItems != null) __obj.updateDynamic("farItems")(farItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBarData]
  }
}

