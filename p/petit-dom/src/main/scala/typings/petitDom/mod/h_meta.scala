package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.meta
import typings.std.HTMLMetaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_meta extends js.Object {
  def apply[E /* <: HTMLMetaElement */](`type`: meta): ElementNode[meta, E] = js.native
  def apply[E /* <: HTMLMetaElement */](`type`: meta, children: Content*): ElementNode[meta, E] = js.native
  def apply[E /* <: HTMLMetaElement */](`type`: meta, props: Props[E], children: Content*): ElementNode[meta, E] = js.native
}

