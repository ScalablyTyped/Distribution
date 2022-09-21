package typings.preact.mod.createElement

import typings.preact.jsxMod.JSXInternal.DOMAttributes
import typings.preact.jsxMod.JSXInternal.HTMLAttributes
import typings.preact.jsxMod.JSXInternal.SVGAttributes
import typings.preact.mod.Attributes
import typings.preact.mod.ClassAttributes
import typings.preact.mod.ComponentChildren
import typings.preact.mod.ComponentType
import typings.preact.mod.VNode
import typings.preact.mod.createElement.^
import typings.preact.preactStrings.input
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
): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply(`type`: input, props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[T /* <: HTMLElement */](
  `type`: String,
  props: ClassAttributes[T] & HTMLAttributes[EventTarget] & SVGAttributes[SVGElement],
  children: ComponentChildren*
): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[T /* <: HTMLElement */](`type`: String, props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[P](`type`: ComponentType[P], props: Attributes & P, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[P](`type`: ComponentType[P], props: Null, children: ComponentChildren*): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[P /* <: SVGAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 165 */ Any,
  props: ClassAttributes[T] & P,
  children: ComponentChildren*
): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
inline def apply[P /* <: SVGAttributes[T] */, T /* <: HTMLElement */](
  `type`: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 165 */ Any,
  props: Null,
  children: ComponentChildren*
): VNode[Any] = (^.asInstanceOf[js.Dynamic].apply((List(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).`++`(children.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[VNode[Any]]
