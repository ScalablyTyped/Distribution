package typings.petitDashDom.petitDashDomMod

import typings.petitDashDom.petitDashDomMod.PetitDom.Content
import typings.petitDashDom.petitDashDomMod.PetitDom.ElementNode
import typings.petitDashDom.petitDashDomMod.PetitDom.Props
import typings.petitDashDom.petitDashDomStrings.dir
import typings.std.HTMLDirectoryElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h_dir extends js.Object {
  def apply[E /* <: HTMLDirectoryElement */](`type`: dir): ElementNode[dir, E] = js.native
  def apply[E /* <: HTMLDirectoryElement */](`type`: dir, children: Content*): ElementNode[dir, E] = js.native
  def apply[E /* <: HTMLDirectoryElement */](`type`: dir, props: Props[E], children: Content*): ElementNode[dir, E] = js.native
}

