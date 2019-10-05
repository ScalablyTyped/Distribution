package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.datalist
import typings.std.HTMLDataListElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_datalist extends js.Object {
  def apply[E /* <: HTMLDataListElement */](`type`: datalist): ElementNode[datalist, E] = js.native
  def apply[E /* <: HTMLDataListElement */](`type`: datalist, children: Content*): ElementNode[datalist, E] = js.native
  def apply[E /* <: HTMLDataListElement */](`type`: datalist, props: Props[E], children: Content*): ElementNode[datalist, E] = js.native
}

