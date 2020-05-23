package typings.photonui.global.photonui

import typings.photonui.anon.X
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Base
@JSGlobal("photonui.Helpers")
@js.native
object Helpers extends js.Object {
  def cleanNode(node: HTMLElement): Unit = js.native
  def escapeHtml(string: String): Unit = js.native
  def getAbsolutePosition(element: String): X = js.native
  def getAbsolutePosition(element: HTMLElement): X = js.native
  def numberToCssSize(value: Double): String = js.native
  def numberToCssSize(value: Double, defaultValue: Double): String = js.native
  def numberToCssSize(value: Double, defaultValue: Double, nullValue: String): String = js.native
  def uuid4(): String = js.native
}

