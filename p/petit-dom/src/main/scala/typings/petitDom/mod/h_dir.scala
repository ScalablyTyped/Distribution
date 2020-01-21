package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.Props
import typings.petitDom.petitDomStrings.dir
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

