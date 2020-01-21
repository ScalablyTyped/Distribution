package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.applet
import typings.std.HTMLAppletElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_applet extends js.Object {
  def apply[E /* <: HTMLAppletElement */](`type`: applet): ElementNode[applet, E] = js.native
  def apply[E /* <: HTMLAppletElement */](`type`: applet, children: Content*): ElementNode[applet, E] = js.native
  def apply[E /* <: HTMLAppletElement */](`type`: applet, props: Props[E], children: Content*): ElementNode[applet, E] = js.native
}

