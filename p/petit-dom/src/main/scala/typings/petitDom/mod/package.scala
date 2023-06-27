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
import typings.petitDom.mod.PetitDom.VNode
import typings.petitDom.mod.^
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def h[P /* <: ComponentProps */](`type`: ComponentClass[P], props: P, children: Content*): ComponentClassNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ComponentClassNode[P]]
inline def h[P /* <: ComponentProps */](`type`: ComponentClass[P], props: Null, children: Content*): ComponentClassNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ComponentClassNode[P]]
inline def h[P /* <: ComponentProps */](`type`: ComponentClass[P], props: Unit, children: Content*): ComponentClassNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ComponentClassNode[P]]
inline def h[P /* <: ComponentProps */](`type`: Component[P], props: P, children: Content*): ComponentNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ComponentNode[P]]
inline def h[P /* <: ComponentProps */](`type`: Component[P], props: Null, children: Content*): ComponentNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ComponentNode[P]]
inline def h[P /* <: ComponentProps */](`type`: Component[P], props: Unit, children: Content*): ComponentNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ComponentNode[P]]
inline def h[P /* <: ComponentProps */](`type`: FunctionComponent[P], props: P, children: Content*): FunctionComponentNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentNode[P]]
inline def h[P /* <: ComponentProps */](`type`: FunctionComponent[P], props: Null, children: Content*): FunctionComponentNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentNode[P]]
inline def h[P /* <: ComponentProps */](`type`: FunctionComponent[P], props: Unit, children: Content*): FunctionComponentNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[FunctionComponentNode[P]]
inline def h[T /* <: /* keyof petit-dom.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 171, starting with typings.petitDom.petitDomStrings.a, typings.petitDom.petitDomStrings.abbr, typings.petitDom.petitDomStrings.address */ Any */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.anon.ElementTagNameMap[T] */ js.Any */](`type`: T, props: Null, children: Content*): ElementNode[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ElementNode[T, E]]
inline def h[T /* <: /* keyof petit-dom.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 171, starting with typings.petitDom.petitDomStrings.a, typings.petitDom.petitDomStrings.abbr, typings.petitDom.petitDomStrings.address */ Any */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.anon.ElementTagNameMap[T] */ js.Any */](`type`: T, props: Unit, children: Content*): ElementNode[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ElementNode[T, E]]
inline def h[T /* <: /* keyof petit-dom.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 171, starting with typings.petitDom.petitDomStrings.a, typings.petitDom.petitDomStrings.abbr, typings.petitDom.petitDomStrings.address */ Any */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.anon.ElementTagNameMap[T] */ js.Any */](`type`: T, props: Props[E], children: Content*): ElementNode[T, E] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[ElementNode[T, E]]

inline def mount(vnode: VNode): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("mount")(vnode.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def patch(newVNode: VNode, oldVNode: VNode): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(newVNode.asInstanceOf[js.Any], oldVNode.asInstanceOf[js.Any])).asInstanceOf[Element]
inline def patch(newVNode: VNode, oldVNode: VNode, parent: Element): Element = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(newVNode.asInstanceOf[js.Any], oldVNode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Element]

inline def unmount(vnode: VNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unmount")(vnode.asInstanceOf[js.Any]).asInstanceOf[Unit]
