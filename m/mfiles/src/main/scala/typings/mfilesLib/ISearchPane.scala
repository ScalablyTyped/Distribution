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
    val __obj = js.Dynamic.literal(Available = Available, Events = Events, SetTheme = SetTheme, Visible = Visible)
  
    __obj.asInstanceOf[ISearchPane]
  }
}

