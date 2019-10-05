package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.ol
import typings.std.HTMLOListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_ol extends js.Object {
  def apply[E /* <: HTMLOListElement */](`type`: ol): ElementNode[ol, E] = js.native
  def apply[E /* <: HTMLOListElement */](`type`: ol, children: Content*): ElementNode[ol, E] = js.native
  def apply[E /* <: HTMLOListElement */](`type`: ol, props: Props[E], children: Content*): ElementNode[ol, E] = js.native
}

