package typings.ol

import typings.ol.mapBrowserEventMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events/condition", JSImport.Namespace)
@js.native
object eventsConditionMod extends js.Object {
  val always: js.Function0[Boolean] = js.native
  val never: js.Function0[Boolean] = js.native
  def altKeyOnly(mapBrowserEvent: default): Boolean = js.native
  def altShiftKeysOnly(mapBrowserEvent: default): Boolean = js.native
  def click(mapBrowserEvent: default): Boolean = js.native
  def doubleClick(mapBrowserEvent: default): Boolean = js.native
  def focus(event: default): Boolean = js.native
  def mouseActionButton(mapBrowserEvent: default): Boolean = js.native
  def mouseOnly(mapBrowserEvent: default): Boolean = js.native
  def noModifierKeys(mapBrowserEvent: default): Boolean = js.native
  def platformModifierKeyOnly(mapBrowserEvent: default): Boolean = js.native
  def pointerMove(mapBrowserEvent: default): Boolean = js.native
  def primaryAction(mapBrowserEvent: default): Boolean = js.native
  def shiftKeyOnly(mapBrowserEvent: default): Boolean = js.native
  def singleClick(mapBrowserEvent: default): Boolean = js.native
  def targetNotEditable(mapBrowserEvent: default): Boolean = js.native
  type Condition = js.ThisFunction1[/* this */ js.Any, /* p0 */ default, Boolean]
}

