package typings.mediumDashEditor

import typings.std.Element
import typings.std.HTMLCollection
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.NodeListOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MediumEditorNs {
  type Button = String | ButtonOptions
  type elementType = String | HTMLElement | js.Array[HTMLElement] | NodeList | NodeListOf[Element] | HTMLCollection
}
