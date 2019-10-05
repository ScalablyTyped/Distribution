package typings.atPhosphorWidgets.libTabpanelMod.TabPanel

import typings.atPhosphorWidgets.libWidgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The arguments object for the `currentChanged` signal.
  */
trait ICurrentChangedArgs extends js.Object {
  /**
    * The currently selected index.
    */
  var currentIndex: Double
  /**
    * The currently selected widget.
    */
  var currentWidget: Widget | Null
  /**
    * The previously selected index.
    */
  var previousIndex: Double
  /**
    * The previously selected widget.
    */
  var previousWidget: Widget | Null
}

object ICurrentChangedArgs {
  @scala.inline
  def apply(
    currentIndex: Double,
    previousIndex: Double,
    currentWidget: Widget = null,
    previousWidget: Widget = null
  ): ICurrentChangedArgs = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex, previousIndex = previousIndex)
    if (currentWidget != null) __obj.updateDynamic("currentWidget")(currentWidget)
    if (previousWidget != null) __obj.updateDynamic("previousWidget")(previousWidget)
    __obj.asInstanceOf[ICurrentChangedArgs]
  }
}

