package typings.preact.mod.createElement

import typings.preact.mod.Attributes
import typings.preact.mod.ClassAttributes
import typings.preact.mod.ComponentChildren
import typings.preact.mod.ComponentType
import typings.preact.mod.VNode
import typings.preact.mod.createElement.^
import typings.preact.preactStrings.input
import typings.preact.srcJsxMod.JSXInternal.DOMAttributes
import typings.preact.srcJsxMod.JSXInternal.HTMLAttributes
import typings.preact.srcJsxMod.JSXInternal.SVGAttributes
import typings.std.EventTarget
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(
  `type`: input,
  props: DOMAttributes[HTMLInputElement] & ClassAttributes[HTMLInputElement],
  children: ComponentChildren*
): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply(`type`: input, props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[T /* <: HTMLElement */](
  `type`: String,
  props: ClassAttributes[T] & HTMLAttributes[EventTarget] & SVGAttributes[SVGElement],
  children: ComponentChildren*
): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[T /* <: HTMLElement */](`type`: String, props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[P](`type`: ComponentType[P], props: Attributes & P, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[P](`type`: ComponentType[P], props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 174, starting with typings.preact.preactStrings.a, typings.preact.preactStrings.abbr, typings.preact.preactStrings.address */ Any,
  props: ClassAttributes[T] & P,
  children: ComponentChildren*
): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[P /* <: HTMLAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 174, starting with typings.preact.preactStrings.a, typings.preact.preactStrings.abbr, typings.preact.preactStrings.address */ Any,
  props: Null,
  children: ComponentChildren*
): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((scala.List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
