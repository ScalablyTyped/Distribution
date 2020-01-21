package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.article
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_article extends js.Object {
  def apply[E /* <: HTMLElement */](`type`: article): ElementNode[article, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: article, children: Content*): ElementNode[article, E] = js.native
  def apply[E /* <: HTMLElement */](`type`: article, props: Props[E], children: Content*): ElementNode[article, E] = js.native
}

