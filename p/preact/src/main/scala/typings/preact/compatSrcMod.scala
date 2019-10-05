package typings.preact

import typings.preact.compatSrcInternalMod.ForwardFn
import typings.preact.compatSrcMod.Component
import typings.preact.srcJsxMod.JSXInternal.Element
import typings.preact.srcJsxMod.JSXInternal.HTMLAttributes
import typings.preact.srcJsxMod.JSXInternal.SVGAttributes
import typings.preact.srcMod.Attributes
import typings.preact.srcMod.ComponentChild
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
object compatSrcMod extends js.Object {
  @js.native
  abstract class Component[P, S] ()
    extends typings.preact.srcMod.Component[P, S] {
    def this(props: P) = this()
    def this(props: P, context: js.Any) = this()
  }
  
  @js.native
  class Fragment protected ()
    extends typings.preact.srcMod.Component[js.Object, js.Object] {
    def this(props: js.Object) = this()
    def this(props: js.Object, context: js.Any) = this()
  }
  
  @js.native
  abstract class PureComponent[P, S] ()
    extends typings.preact.srcMod.Component[P, S] {
    var isPureReactComponent: Boolean = js.native
  }
  
  @js.native
  class Suspense ()
    extends typings.preact.compatSrcSuspenseMod.Suspense
  
  //
  // Preact Built-in Components
  // -----------------------------------
  // TODO: Revisit what the public type of this is...
  val Fragment: ComponentClass[js.Object, js.Object] = js.native
  val version: String = js.native
  def cloneElement(vnode: Element): Element = js.native
  def cloneElement(vnode: Element, props: js.Any, children: ComponentChildren*): Element = js.native
  def createContext[T](defaultValue: T): Context[T] = js.native
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
  @js.native
  object Children extends js.Object {
    def count(children: ComponentChildren): Double = js.native
    def forEach[T /* <: ComponentChild */](children: T, fn: js.Function3[/* child */ T, /* i */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
    def forEach[T /* <: ComponentChild */](
      children: js.Array[T],
      fn: js.Function3[/* child */ T, /* i */ Double, /* array */ js.Array[T], Unit]
    ): Unit = js.native
    def map[T /* <: ComponentChild */, R](children: T, fn: js.Function3[/* child */ T, /* i */ Double, /* array */ js.Array[T], R]): js.Array[R] = js.native
    def map[T /* <: ComponentChild */, R](children: js.Array[T], fn: js.Function3[/* child */ T, /* i */ Double, /* array */ js.Array[T], R]): js.Array[R] = js.native
    def only(children: ComponentChildren): ComponentChild = js.native
    def toArray(children: ComponentChildren): js.Array[VNode[js.Object]] = js.native
  }
  
  /* static members */
  @js.native
  object Component extends js.Object {
    var contextType: js.UndefOr[Context[_]] = js.native
    var defaultProps: js.UndefOr[js.Any] = js.native
    var displayName: js.UndefOr[String] = js.native
    var getDerivedStateFromError: js.UndefOr[js.Function1[/* error */ js.Any, js.Object | Null]] = js.native
    // Static members cannot reference class type parameters. This is not
    // supported in TypeScript. Reusing the same type arguments from `Component`
    // will lead to an impossible state where one cannot satisfy the type
    // constraint under no circumstances, see #1356.In general type arguments
    // seem to be a bit buggy and not supported well at the time of this
    // writing with TS 3.3.3333.
    var getDerivedStateFromProps: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ js.Object, js.Object | Null]] = js.native
  }
  
  @js.native
  object createElement extends js.Object {
    def apply(`type`: String, children: ComponentChildren*): VNode[_] = js.native
    //
    // Preact createElement
    // -----------------------------------
    def apply(
      `type`: String,
      props: HTMLAttributes with SVGAttributes with (Record[String, _]),
      children: ComponentChildren*
    ): VNode[_] = js.native
    def apply[P](`type`: ComponentType[P], children: ComponentChildren*): VNode[_] = js.native
    def apply[P](`type`: ComponentType[P], props: Attributes with P, children: ComponentChildren*): VNode[_] = js.native
  }
  
}

