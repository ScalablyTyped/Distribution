package typings.petitDom.mod

import typings.petitDom.mod.PetitDom.Component
import typings.petitDom.mod.PetitDom.ComponentClass
import typings.petitDom.mod.PetitDom.ComponentClassNode
import typings.petitDom.mod.PetitDom.ComponentNode
import typings.petitDom.mod.PetitDom.ComponentProps
import typings.petitDom.mod.PetitDom.Content
import typings.petitDom.mod.PetitDom.ElementNode
import typings.petitDom.mod.PetitDom.FunctionComponent
import typings.petitDom.mod.PetitDom.FunctionComponentNode
import typings.petitDom.mod.PetitDom.Props
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
  def apply[T /* <: /* keyof petit-dom.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.anon.ElementTagNameMap[T] */ js.Any */](`type`: T): ElementNode[T, E] = js.native
  def apply[T /* <: /* keyof petit-dom.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.anon.ElementTagNameMap[T] */ js.Any */](`type`: T, children: Content*): ElementNode[T, E] = js.native
  def apply[T /* <: /* keyof petit-dom.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.anon.ElementTagNameMap[T] */ js.Any */](`type`: T, props: Props[E], children: Content*): ElementNode[T, E] = js.native
}

