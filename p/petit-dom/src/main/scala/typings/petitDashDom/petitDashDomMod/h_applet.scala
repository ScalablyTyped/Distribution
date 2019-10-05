package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.applet
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

