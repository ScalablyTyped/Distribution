package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Component
import typings.petitDom.mod.PetitDom.ComponentClass
import typings.petitDom.mod.PetitDom.ComponentClassNode
import typings.petitDom.mod.PetitDom.ComponentNode
import typings.petitDom.mod.PetitDom.ComponentProps
import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.FunctionComponent
import typings.petitDom.mod.PetitDom.FunctionComponentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("petit-dom", "h")
@js.native
object h extends js.Object {
  def apply[P /* <: ComponentProps */](`type`: Component[P]): ComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: ComponentClass[P]): ComponentClassNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: ComponentClass[P], children: Content*): ComponentClassNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: ComponentClass[P], props: P, children: Content*): ComponentClassNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: Component[P], children: Content*): ComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: Component[P], props: P, children: Content*): ComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: FunctionComponent[P]): FunctionComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: FunctionComponent[P], children: Content*): FunctionComponentNode[P] = js.native
  def apply[P /* <: ComponentProps */](`type`: FunctionComponent[P], props: P, children: Content*): FunctionComponentNode[P] = js.native
}

