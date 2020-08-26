package typings.officeUiFabricReact.commandBarBaseMod

import typings.officeUiFabricReact.commandBarTypesMod.ICommandBarItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICommandBarData extends js.Object {
  /**
    * Unique string used to cache the width of the command bar
    */
  var cacheKey: String = js.native
  /**
    * Items being rendered on the far side
    */
  var farItems: js.UndefOr[js.Array[ICommandBarItemProps]] = js.native
  /**
    * Length of original overflowItems to ensure that they are not moved into primary region on resize
    */
  var minimumOverflowItems: Double = js.native
  /**
    * Items being rendered in the overflow
    */
  var overflowItems: js.Array[ICommandBarItemProps] = js.native
  /**
    * Items being rendered in the primary region
    */
  var primaryItems: js.Array[ICommandBarItemProps] = js.native
}

object ICommandBarData {
  @scala.inline
  def apply(
    cacheKey: String,
    minimumOverflowItems: Double,
    overflowItems: js.Array[ICommandBarItemProps],
    primaryItems: js.Array[ICommandBarItemProps]
  ): ICommandBarData = {
    val __obj = js.Dynamic.literal(cacheKey = cacheKey.asInstanceOf[js.Any], minimumOverflowItems = minimumOverflowItems.asInstanceOf[js.Any], overflowItems = overflowItems.asInstanceOf[js.Any], primaryItems = primaryItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBarData]
  }
  @scala.inline
  implicit class ICommandBarDataOps[Self <: ICommandBarData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCacheKey(value: String): Self = this.set("cacheKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinimumOverflowItems(value: Double): Self = this.set("minimumOverflowItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverflowItemsVarargs(value: ICommandBarItemProps*): Self = this.set("overflowItems", js.Array(value :_*))
    @scala.inline
    def setOverflowItems(value: js.Array[ICommandBarItemProps]): Self = this.set("overflowItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryItemsVarargs(value: ICommandBarItemProps*): Self = this.set("primaryItems", js.Array(value :_*))
    @scala.inline
    def setPrimaryItems(value: js.Array[ICommandBarItemProps]): Self = this.set("primaryItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setFarItemsVarargs(value: ICommandBarItemProps*): Self = this.set("farItems", js.Array(value :_*))
    @scala.inline
    def setFarItems(value: js.Array[ICommandBarItemProps]): Self = this.set("farItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFarItems: Self = this.set("farItems", js.undefined)
  }
  
}

