package typings.preact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def cloneElement(
  vnode: typings.preact.mod.VNode[js.Any],
  props: js.Any,
  children: typings.preact.mod.ComponentChildren*
): typings.preact.mod.VNode[js.Any] = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.preact.mod.VNode[js.Any]]
inline def cloneElement(
  vnode: typings.preact.mod.VNode[js.Any],
  props: scala.Unit,
  children: typings.preact.mod.ComponentChildren*
): typings.preact.mod.VNode[js.Any] = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.preact.mod.VNode[js.Any]]

inline def cloneElement_P[P](vnode: typings.preact.mod.VNode[P], props: js.Any, children: typings.preact.mod.ComponentChildren*): typings.preact.mod.VNode[P] = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.preact.mod.VNode[P]]
inline def cloneElement_P[P](
  vnode: typings.preact.mod.VNode[P],
  props: scala.Unit,
  children: typings.preact.mod.ComponentChildren*
): typings.preact.mod.VNode[P] = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.preact.mod.VNode[P]]

inline def createContext[T](defaultValue: T): typings.preact.mod.Context[T] = typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[typings.preact.mod.Context[T]]

//
// Preact helpers
// -----------------------------------
inline def createRef[T](): typings.preact.mod.RefObject[T] = typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[typings.preact.mod.RefObject[T]]

inline def hydrate(vnode: typings.preact.mod.ComponentChild, parent: typings.std.Document): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def hydrate(vnode: typings.preact.mod.ComponentChild, parent: typings.std.DocumentFragment): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def hydrate(vnode: typings.preact.mod.ComponentChild, parent: typings.std.Element): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def hydrate(vnode: typings.preact.mod.ComponentChild, parent: typings.std.ShadowRoot): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def isValidElement(vnode: js.Any): /* is preact.preact.VNode<{}> */ scala.Boolean = typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(vnode.asInstanceOf[js.Any]).asInstanceOf[/* is preact.preact.VNode<{}> */ scala.Boolean]

inline def options: typings.preact.mod.Options_ = typings.preact.mod.^.asInstanceOf[js.Dynamic].selectDynamic("options").asInstanceOf[typings.preact.mod.Options_]

inline def render(vnode: typings.preact.mod.ComponentChild, parent: typings.std.Document): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: typings.std.DocumentFragment): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def render(
  vnode: typings.preact.mod.ComponentChild,
  parent: typings.std.DocumentFragment,
  replaceNode: typings.std.Element
): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def render(
  vnode: typings.preact.mod.ComponentChild,
  parent: typings.std.DocumentFragment,
  replaceNode: typings.std.Text
): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def render(
  vnode: typings.preact.mod.ComponentChild,
  parent: typings.std.Document,
  replaceNode: typings.std.Element
): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def render(
  vnode: typings.preact.mod.ComponentChild,
  parent: typings.std.Document,
  replaceNode: typings.std.Text
): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
//
// Preact render
// -----------------------------------
inline def render(vnode: typings.preact.mod.ComponentChild, parent: typings.std.Element): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def render(
  vnode: typings.preact.mod.ComponentChild,
  parent: typings.std.Element,
  replaceNode: typings.std.Element
): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def render(
  vnode: typings.preact.mod.ComponentChild,
  parent: typings.std.Element,
  replaceNode: typings.std.Text
): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def render(vnode: typings.preact.mod.ComponentChild, parent: typings.std.ShadowRoot): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def render(
  vnode: typings.preact.mod.ComponentChild,
  parent: typings.std.ShadowRoot,
  replaceNode: typings.std.Element
): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def render(
  vnode: typings.preact.mod.ComponentChild,
  parent: typings.std.ShadowRoot,
  replaceNode: typings.std.Text
): scala.Unit = (typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def toChildArray(children: typings.preact.mod.ComponentChildren): js.Array[typings.preact.mod.VNode[js.Object] | java.lang.String | scala.Double] = typings.preact.mod.^.asInstanceOf[js.Dynamic].applyDynamic("toChildArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.preact.mod.VNode[js.Object] | java.lang.String | scala.Double]]

type ComponentChild = js.UndefOr[
typings.preact.mod.VNode[js.Any] | js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null]

type ComponentChildren = js.Array[typings.preact.mod.ComponentChild] | typings.preact.mod.ComponentChild

type ComponentConstructor[P, S] = typings.preact.mod.ComponentClass[P, S]

type ComponentFactory[P] = typings.preact.mod.ComponentType[P]

type ComponentProps[C /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 161 */ js.Any */] = /* import warning: importer.ImportType#apply Failed type conversion: preact.preact/src/jsx.JSXInternal.IntrinsicElements[C] */ js.Any

type ComponentType[P] = (typings.preact.mod.ComponentClass[P, js.Object]) | typings.preact.mod.FunctionComponent[P]

//
// Context
// -----------------------------------
type Consumer[T] = typings.preact.mod.FunctionComponent[typings.preact.anon.`0`[T]]

type FunctionalComponent[P] = typings.preact.mod.FunctionComponent[P]

//
// Preact Component interface
// -----------------------------------
type Key = java.lang.String | scala.Double | js.Any

type PreactConsumer[T] = typings.preact.mod.Consumer[T]

type PreactContext[T] = typings.preact.mod.Context[T]

type PreactProvider[T] = typings.preact.mod.Provider[T]

type Provider[T] = typings.preact.mod.FunctionComponent[typings.preact.anon.Value[T]]

type Ref[T] = typings.preact.mod.RefObject[T] | typings.preact.mod.RefCallback[T]

type RefCallback[T] = js.Function1[/* instance */ T | scala.Null, scala.Unit]

type RenderableProps[P, RefType] = P & typings.preact.mod.Attributes & typings.preact.anon.Ref[RefType]
