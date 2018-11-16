package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononPopoverComponent extends js.Object {
  def attachButton(element: java.lang.String): PhononPopoverComponent = js.native
  def attachButton(element: java.lang.String, autoBind: scala.Boolean): PhononPopoverComponent = js.native
  def attachButton(element: phononLib.Element): PhononPopoverComponent = js.native
  def attachButton(element: phononLib.Element, autoBind: scala.Boolean): PhononPopoverComponent = js.native
  def close(): scala.Unit = js.native
  def onItemChanged(callback: js.Function1[/* data */ PhononPopoverItem, scala.Unit]): PhononPopoverComponent = js.native
  def open(direction: PhononPopoverDirection): PhononPopoverComponent = js.native
  def openFrom(element: java.lang.String): PhononPopoverComponent = js.native
  def openFrom(element: phononLib.Element): PhononPopoverComponent = js.native
  def setList(list: js.Array[_ | java.lang.String | PhononPopoverItem]): PhononPopoverComponent = js.native
  def setList(list: js.Array[_], itemBuilder: js.Function1[/* item */ js.Any, scala.Unit]): PhononPopoverComponent = js.native
}

