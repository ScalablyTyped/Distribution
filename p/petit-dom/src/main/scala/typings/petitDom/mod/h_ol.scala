package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.ol
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

