package typings.naja.mod

import typings.std.Event_
import typings.std.HTMLElement
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIHandler extends js.Object {
  val allowedOrigins: js.Array[String] = js.native
  var selector: String = js.native
  def bindUI(element: HTMLElement): Unit = js.native
  def clickElement(element: HTMLElement): Unit = js.native
  def clickElement(element: HTMLElement, options: js.Object): Unit = js.native
  def clickElement(element: HTMLElement, options: js.Object, event: Event_): Unit = js.native
  def handleUI(event: Event_): Unit = js.native
  def isUrlAllowed(url: String): Boolean = js.native
  def submitForm(element: HTMLFormElement): Unit = js.native
  def submitForm(element: HTMLFormElement, options: js.Object): Unit = js.native
  def submitForm(element: HTMLFormElement, options: js.Object, event: Event_): Unit = js.native
}

