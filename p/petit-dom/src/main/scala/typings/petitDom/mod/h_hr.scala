package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.hr
import typings.std.HTMLHRElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_hr extends js.Object {
  def apply[E /* <: HTMLHRElement */](`type`: hr): ElementNode[hr, E] = js.native
  def apply[E /* <: HTMLHRElement */](`type`: hr, children: Content*): ElementNode[hr, E] = js.native
  def apply[E /* <: HTMLHRElement */](`type`: hr, props: Props[E], children: Content*): ElementNode[hr, E] = js.native
}

