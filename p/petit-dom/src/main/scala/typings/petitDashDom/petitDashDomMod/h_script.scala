package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.script
import typings.std.HTMLScriptElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_script extends js.Object {
  def apply[E /* <: HTMLScriptElement */](`type`: script): ElementNode[script, E] = js.native
  def apply[E /* <: HTMLScriptElement */](`type`: script, children: Content*): ElementNode[script, E] = js.native
  def apply[E /* <: HTMLScriptElement */](`type`: script, props: Props[E], children: Content*): ElementNode[script, E] = js.native
}

