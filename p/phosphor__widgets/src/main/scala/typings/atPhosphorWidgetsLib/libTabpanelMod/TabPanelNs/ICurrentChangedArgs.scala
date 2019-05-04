package typings
package atPhosphorWidgetsLib.libTabpanelMod.TabPanelNs

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
  var currentIndex: scala.Double
  /**
    * The currently selected widget.
    */
  var currentWidget: atPhosphorWidgetsLib.libWidgetMod.Widget | scala.Null
  /**
    * The previously selected index.
    */
  var previousIndex: scala.Double
  /**
    * The previously selected widget.
    */
  var previousWidget: atPhosphorWidgetsLib.libWidgetMod.Widget | scala.Null
}

object ICurrentChangedArgs {
  @scala.inline
  def apply(
    currentIndex: scala.Double,
    previousIndex: scala.Double,
    currentWidget: atPhosphorWidgetsLib.libWidgetMod.Widget = null,
    previousWidget: atPhosphorWidgetsLib.libWidgetMod.Widget = null
  ): ICurrentChangedArgs = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex, previousIndex = previousIndex)
    if (currentWidget != null) __obj.updateDynamic("currentWidget")(currentWidget)
    if (previousWidget != null) __obj.updateDynamic("previousWidget")(previousWidget)
    __obj.asInstanceOf[ICurrentChangedArgs]
  }
}

