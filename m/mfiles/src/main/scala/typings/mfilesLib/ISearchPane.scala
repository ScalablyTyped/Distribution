package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPane extends js.Object {
  val Available: scala.Boolean
  val Events: ISearchPaneEvents
  var Visible: scala.Boolean
  def SetTheme(theme: ITheme): scala.Unit
}

object ISearchPane {
  @scala.inline
  def apply(
    Available: scala.Boolean,
    Events: ISearchPaneEvents,
    SetTheme: js.Function1[ITheme, scala.Unit],
    Visible: scala.Boolean
  ): ISearchPane = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Available")(Available)
    __obj.updateDynamic("Events")(Events)
    __obj.updateDynamic("SetTheme")(SetTheme)
    __obj.updateDynamic("Visible")(Visible)
    __obj.asInstanceOf[ISearchPane]
  }
}

