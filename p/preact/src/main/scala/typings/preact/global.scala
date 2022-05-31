package typings.preact

import typings.preact.jsxMod.JSXInternal.HTMLAttributes
import typings.preact.jsxMod.JSXInternal.SVGAttributes
import typings.preact.mod.Attributes
import typings.preact.mod.ComponentChild
import typings.preact.mod.ComponentChildren
import typings.preact.mod.ComponentClass
import typings.preact.mod.ComponentType
import typings.preact.mod.Context
import typings.preact.mod.Options_
import typings.preact.mod.RefObject
import typings.preact.mod.VNode
import typings.std.Document
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.EventTarget
import typings.std.Record
import typings.std.SVGElement
import typings.std.ShadowRoot
import typings.std.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object preact {
    
    @JSGlobal("preact")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("preact.Component")
    @js.native
    abstract class Component[P, S] ()
      extends typings.preact.mod.Component[P, S] {
      def this(props: P) = this()
      def this(props: P, context: js.Any) = this()
      def this(props: Unit, context: js.Any) = this()
    }
    object Component {
      
      @JSGlobal("preact.Component")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("preact.Component.contextType")
      @js.native
      def contextType: js.UndefOr[Context[js.Any]] = js.native
      inline def contextType_=(x: js.UndefOr[Context[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("preact.Component.defaultProps")
      @js.native
      def defaultProps: js.UndefOr[js.Any] = js.native
      inline def defaultProps_=(x: js.UndefOr[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("preact.Component.displayName")
      @js.native
      def displayName: js.UndefOr[String] = js.native
      inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("preact.Component.getDerivedStateFromError")
      @js.native
      def getDerivedStateFromError: js.UndefOr[js.Function1[/* error */ js.Any, js.Object | Null]] = js.native
      inline def getDerivedStateFromError_=(x: js.UndefOr[js.Function1[/* error */ js.Any, js.Object | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromError")(x.asInstanceOf[js.Any])
      
      // Static members cannot reference class type parameters. This is not
      // supported in TypeScript. Reusing the same type arguments from `Component`
      // will lead to an impossible state where one cannot satisfy the type
      // constraint under no circumstances, see #1356.In general type arguments
      // seem to be a bit buggy and not supported well at the time of this
      // writing with TS 3.3.3333.
      /* static member */
      @JSGlobal("preact.Component.getDerivedStateFromProps")
      @js.native
      def getDerivedStateFromProps: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ js.Object, js.Object | Null]] = js.native
      inline def getDerivedStateFromProps_=(x: js.UndefOr[js.Function2[/* props */ js.Object, /* state */ js.Object, js.Object | Null]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDerivedStateFromProps")(x.asInstanceOf[js.Any])
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("preact.Fragment")
    @js.native
    class Fragment protected ()
      extends typings.preact.mod.Component[js.Object, js.Object] {
      def this(props: js.Object) = this()
      def this(props: js.Object, context: js.Any) = this()
    }
    //
    // Preact Built-in Components
    // -----------------------------------
    // TODO: Revisit what the public type of this is...
    @JSGlobal("preact.Fragment")
    @js.native
    val Fragment: ComponentClass[js.Object, js.Object] = js.native
    
    inline def cloneElement(vnode: VNode[js.Any], props: js.Any, children: ComponentChildren*): VNode[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Any]]
    inline def cloneElement(vnode: VNode[js.Any], props: Unit, children: ComponentChildren*): VNode[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Any]]
    
    inline def cloneElement_P[P](vnode: VNode[P], props: js.Any, children: ComponentChildren*): VNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[P]]
    inline def cloneElement_P[P](vnode: VNode[P], props: Unit, children: ComponentChildren*): VNode[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("cloneElement")(vnode.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[P]]
    
    inline def createContext[T](defaultValue: T): Context[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createContext")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[Context[T]]
    
    //
    // Preact createElement
    // -----------------------------------
    inline def createElement(
      `type`: String,
      props: HTMLAttributes[EventTarget] & SVGAttributes[SVGElement] & (Record[String, js.Any]),
      children: ComponentChildren*
    ): VNode[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Any]]
    inline def createElement(`type`: String, props: Null, children: ComponentChildren*): VNode[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Any]]
    inline def createElement[P](`type`: ComponentType[P], props: Attributes & P, children: ComponentChildren*): VNode[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Any]]
    inline def createElement[P](`type`: ComponentType[P], props: Null, children: ComponentChildren*): VNode[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("createElement")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Any]]
    
    //
    // Preact helpers
    // -----------------------------------
    inline def createRef[T](): RefObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRef")().asInstanceOf[RefObject[T]]
    
    inline def h(
      `type`: String,
      props: HTMLAttributes[EventTarget] & SVGAttributes[SVGElement] & (Record[String, js.Any]),
      children: ComponentChildren*
    ): VNode[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Any]]
    inline def h(`type`: String, props: Null, children: ComponentChildren*): VNode[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Any]]
    inline def h[P](`type`: ComponentType[P], props: Attributes & P, children: ComponentChildren*): VNode[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Any]]
    inline def h[P](`type`: ComponentType[P], props: Null, children: ComponentChildren*): VNode[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("h")(`type`.asInstanceOf[js.Any], props.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[VNode[js.Any]]
    
    inline def hydrate(vnode: ComponentChild, parent: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def hydrate(vnode: ComponentChild, parent: DocumentFragment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def hydrate(vnode: ComponentChild, parent: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def hydrate(vnode: ComponentChild, parent: ShadowRoot): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def isValidElement(vnode: js.Any): /* is preact.preact.VNode<{}> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidElement")(vnode.asInstanceOf[js.Any]).asInstanceOf[/* is preact.preact.VNode<{}> */ Boolean]
    
    @JSGlobal("preact.options")
    @js.native
    val options: Options_ = js.native
    
    inline def render(vnode: ComponentChild, parent: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(vnode: ComponentChild, parent: DocumentFragment): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(vnode: ComponentChild, parent: DocumentFragment, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(vnode: ComponentChild, parent: DocumentFragment, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(vnode: ComponentChild, parent: Document, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(vnode: ComponentChild, parent: Document, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    //
    // Preact render
    // -----------------------------------
    inline def render(vnode: ComponentChild, parent: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(vnode: ComponentChild, parent: Element, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(vnode: ComponentChild, parent: Element, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(vnode: ComponentChild, parent: ShadowRoot): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(vnode: ComponentChild, parent: ShadowRoot, replaceNode: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def render(vnode: ComponentChild, parent: ShadowRoot, replaceNode: Text): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(vnode.asInstanceOf[js.Any], parent.asInstanceOf[js.Any], replaceNode.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def toChildArray(children: ComponentChildren): js.Array[VNode[js.Object] | String | Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toChildArray")(children.asInstanceOf[js.Any]).asInstanceOf[js.Array[VNode[js.Object] | String | Double]]
  }
}
