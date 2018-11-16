package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Templatizer extends js.Object {
  def modelForElement(elem: stdLib.HTMLElement): Base = js.native
  def stamp(model: js.Object): Base = js.native
  def templatize(template: stdLib.HTMLTemplateElement): scala.Unit = js.native
  def templatize(template: stdLib.HTMLTemplateElement, mutableData: scala.Boolean): scala.Unit = js.native
}

