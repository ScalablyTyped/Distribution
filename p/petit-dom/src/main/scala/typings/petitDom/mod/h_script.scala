package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.script
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

