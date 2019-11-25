package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchPane extends js.Object {
  val Available: Boolean
  val Events: ISearchPaneEvents
  var Visible: Boolean
  def SetTheme(theme: ITheme): Unit
}

object ISearchPane {
  @scala.inline
  def apply(Available: Boolean, Events: ISearchPaneEvents, SetTheme: ITheme => Unit, Visible: Boolean): ISearchPane = {
    val __obj = js.Dynamic.literal(Available = Available.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any], SetTheme = js.Any.fromFunction1(SetTheme), Visible = Visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISearchPane]
  }
}

