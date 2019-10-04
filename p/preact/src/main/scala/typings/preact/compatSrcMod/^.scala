package typings.preact.compatSrcMod

import typings.preact.Anon_Default
import typings.preact.compatSrcInternalMod.ForwardFn
import typings.preact.srcJsxMod.JSXInternalNs.Element
import typings.preact.srcJsxMod.JSXInternalNs.HTMLAttributes
import typings.preact.srcJsxMod.JSXInternalNs.SVGAttributes
import typings.preact.srcMod.Attributes
import typings.preact.srcMod.ComponentChildren
import typings.preact.srcMod.ComponentClass
import typings.preact.srcMod.ComponentType
import typings.preact.srcMod.Context
import typings.preact.srcMod.FunctionComponent
import typings.preact.srcMod.FunctionalComponent
import typings.preact.srcMod.RefObject
import typings.preact.srcMod.VNode
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Record
import typings.std.ShadowRoot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact/compat/src", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  //
  // Preact Built-in Components
  // -----------------------------------
  // TODO: Revisit what the public type of this is...
  val Fragment: ComponentClass[js.Object, js.Object] = js.native
  val version: String = js.native
  def cloneElement(vnode: Element): Element = js.native
  def cloneElement(vnode: Element, props: js.Any, children: ComponentChildren*): Element = js.native
  def createContext[T](defaultValue: T): Context[T] = js.native
  def createElement(`type`: String, children: ComponentChildren*): VNode[_] = js.native
  //
  // Preact createElement
  // -----------------------------------
  def createElement(
    `type`: String,
    props: HTMLAttributes with SVGAttributes with (Record[String, _]),
    children: ComponentChildren*
  ): VNode[_] = js.native
  def createElement[P](`type`: ComponentType[P], children: ComponentChildren*): VNode[_] = js.native
  def createElement[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
  def createFactory(): js.Function2[/* props */ js.UndefOr[js.Any], /* repeated */ ComponentChildren, VNode[_]] = js.native
  def createFactory(`type`: String): js.Function2[/* props */ js.UndefOr[js.Any], /* repeated */ ComponentChildren, VNode[_]] = js.native
  def createFactory(`type`: ComponentType[_]): js.Function2[/* props */ js.UndefOr[js.Any], /* repeated */ ComponentChildren, VNode[_]] = js.native
  def createPortal(vnode: VNode[js.Object], container: typings.std.Element): VNode[_] = js.native
  //
  // Preact helpers
  // -----------------------------------
  def createRef[T](): RefObject[T] = js.native
  def findDOMNode(
    component: typings.preact.srcMod.Component[
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for P */ _, 
      /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for S */ _
    ]
  ): typings.std.Element | Null = js.native
  def forwardRef[R, P](fn: ForwardFn[P, R]): FunctionalComponent[P] = js.native
  def hydrate(vnode: VNode[_], parent: typings.std.Element): (Component[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for P */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for S */ _
  ]) | Null = js.native
  def hydrate(vnode: VNode[_], parent: typings.std.Element, callback: js.Function0[Unit]): (Component[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for P */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for S */ _
  ]) | Null = js.native
  def isValidElement(element: js.Any): Boolean = js.native
  def `lazy`[T](loader: js.Function0[js.Promise[Anon_Default[T]]]): T = js.native
  def memo[P](component: FunctionalComponent[P]): FunctionComponent[P] = js.native
  def memo[P](component: FunctionalComponent[P], comparer: js.Function2[/* prev */ P, /* next */ P, Boolean]): FunctionComponent[P] = js.native
  def render(vnode: VNode[_], parent: typings.std.Element): (Component[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for P */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for S */ _
  ]) | Null = js.native
  def render(vnode: VNode[_], parent: typings.std.Element, callback: js.Function0[Unit]): (Component[
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for P */ _, 
    /* import warning: DefaultedTypeArguments.enterTsTypeRef $anonfun#applyOrElse newTParams $anonfun next no default parameter for S */ _
  ]) | Null = js.native
  def unmountComponentAtNode(container: Document): Boolean = js.native
  def unmountComponentAtNode(container: DocumentFragment): Boolean = js.native
  def unmountComponentAtNode(container: typings.std.Element): Boolean = js.native
  def unmountComponentAtNode(container: ShadowRoot): Boolean = js.native
  def unstable_batchedUpdates(callback: js.Function1[/* arg */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def unstable_batchedUpdates(callback: js.Function1[/* arg */ js.UndefOr[js.Any], Unit], arg: js.Any): Unit = js.native
}

