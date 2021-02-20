package typings.mithrilGlobal

import org.scalablytyped.runtime.Shortcut
import typings.mithril.anon.Fn0
import typings.mithril.anon.FnCallElementComponent
import typings.mithril.anon.FnCallUrlOptions
import typings.mithril.anon.JsonpOptionsurlstring
import typings.mithril.anon.Key
import typings.mithril.anon.Lifecycleanyanykeystringa
import typings.mithril.anon.Url
import typings.mithril.mod.Params
import typings.mithril.mod.Redraw
import typings.mithrilGlobal.anon.FnCall
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("mithril-global", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  type Attributes = typings.mithril.mod.Attributes
  
  type CVnode[A] = typings.mithril.mod.CVnode[A]
  
  type CVnodeDOM[A] = typings.mithril.mod.CVnodeDOM[A]
  
  type Child = typings.mithril.mod.Child
  
  type ChildArray = typings.mithril.mod.ChildArray
  
  type ChildArrayOrPrimitive = typings.mithril.mod.ChildArrayOrPrimitive
  
  type Children = typings.mithril.mod.Children
  
  type ClassComponent[A] = typings.mithril.mod.ClassComponent[A]
  
  type Comp[A, S /* <: typings.mithril.mod.Lifecycle[A, S] */] = typings.mithril.mod.Comp[A, S]
  
  type Component[A, S] = typings.mithril.mod.Component[A, S]
  
  type ComponentTypes[A, S /* <: typings.mithril.mod.Lifecycle[A, S] */] = typings.mithril.mod.ComponentTypes[A, S]
  
  type FactoryComponent[A] = typings.mithril.mod.FactoryComponent[A]
  
  type Hyperscript = typings.mithril.mod.Hyperscript
  
  type JsonpOptions = typings.mithril.mod.JsonpOptions
  
  type Lifecycle[A, S] = typings.mithril.mod.Lifecycle[A, S]
  
  type RequestOptions[T] = typings.mithril.mod.RequestOptions[T]
  
  type Route = typings.mithril.mod.Route
  
  type RouteDefs = typings.mithril.mod.RouteDefs
  
  type RouteOptions = typings.mithril.mod.RouteOptions
  
  type RouteResolver[A, S] = typings.mithril.mod.RouteResolver[A, S]
  
  /* Inlined mithril.mithril.Static & {  stream :{None <T>(value : T): mithril.mithril/stream.Stream<T>, None <T>(): mithril.mithril/stream.Stream<T>}} */
  @js.native
  trait Static extends StObject {
    
    /** Creates a virtual element (Vnode). */
    def apply(
      selector: String,
      attributes: typings.mithril.mod.Attributes,
      children: typings.mithril.mod.Children*
    ): typings.mithril.mod.Vnode[_, _] = js.native
    /** Creates a virtual element (Vnode). */
    def apply(selector: String, children: typings.mithril.mod.Children*): typings.mithril.mod.Vnode[_, _] = js.native
    /** Creates a virtual element (Vnode). */
    def apply[Attrs, State](component: typings.mithril.mod.ComponentTypes[Attrs, State], args: typings.mithril.mod.Children*): typings.mithril.mod.Vnode[Attrs, State] = js.native
    /** Creates a virtual element (Vnode). */
    def apply[Attrs, State](
      component: typings.mithril.mod.ComponentTypes[Attrs, State],
      attributes: Attrs with (typings.mithril.mod.Lifecycle[Attrs, State]) with Key,
      args: typings.mithril.mod.Children*
    ): typings.mithril.mod.Vnode[Attrs, State] = js.native
    
    /** Build path name */
    def buildPathname(template: String): String = js.native
    def buildPathname(template: String, params: Params): String = js.native
    
    /** Turns the key/value pairs of an object into a string of the form: a=1&b=2 */
    def buildQueryString(values: Params): String = js.native
    
    /** Creates a fragment virtual element (Vnode). */
    def fragment(attrs: Lifecycleanyanykeystringa, children: typings.mithril.mod.ChildArrayOrPrimitive): typings.mithril.mod.Vnode[_, _] = js.native
    
    def jsonp[T](options: JsonpOptionsurlstring): js.Promise[T] = js.native
    def jsonp[T](url: String): js.Promise[T] = js.native
    def jsonp[T](url: String, options: typings.mithril.mod.JsonpOptions): js.Promise[T] = js.native
    @JSName("jsonp")
    var jsonp_Original: Fn0 = js.native
    
    def mount(element: Element, component: Null): Unit = js.native
    def mount(element: Element, component: typings.mithril.mod.ComponentTypes[_, _]): Unit = js.native
    @JSName("mount")
    var mount_Original: FnCallElementComponent = js.native
    
    /** Parse path name */
    def parsePathname(url: String): typings.mithril.anon.Params = js.native
    
    /** Returns an object with key/value pairs parsed from a string of the form: ?a=1&b=2 */
    def parseQueryString(queryString: String): Params = js.native
    
    /** Manually triggers an asynchronous redraw of mounted components. */
    def redraw(): Unit = js.native
    @JSName("redraw")
    var redraw_Original: Redraw = js.native
    
    def render(el: Element, vnodes: typings.mithril.mod.Children): Unit = js.native
    @JSName("render")
    var render_Original: js.Function2[/* el */ Element, /* vnodes */ typings.mithril.mod.Children, Unit] = js.native
    
    def request[T](options: typings.mithril.mod.RequestOptions[T] with Url): js.Promise[T] = js.native
    def request[T](url: String): js.Promise[T] = js.native
    def request[T](url: String, options: typings.mithril.mod.RequestOptions[T]): js.Promise[T] = js.native
    @JSName("request")
    var request_Original: FnCallUrlOptions = js.native
    
    /** Creates application routes and mounts Components and/or RouteResolvers to a DOM element. */
    def route(element: Element, defaultRoute: String, routes: typings.mithril.mod.RouteDefs): Unit = js.native
    @JSName("route")
    var route_Original: typings.mithril.mod.Route = js.native
    
    def stream[T](): typings.mithril.streamMod.Stream[T] = js.native
    def stream[T](value: T): typings.mithril.streamMod.Stream[T] = js.native
    @JSName("stream")
    var stream_Original: FnCall = js.native
    
    /** Turns an HTML string into a virtual element (Vnode). Do not use trust on unsanitized user input. */
    def trust(html: String): typings.mithril.mod.Vnode[_, _] = js.native
  }
  
  type Stream[T] = typings.mithril.streamMod.Stream[T]
  
  type Vnode[A, S /* <: typings.mithril.mod.Lifecycle[A, S] */] = typings.mithril.mod.Vnode[A, S]
  
  type VnodeDOM[A, S /* <: typings.mithril.mod.Lifecycle[A, S] */] = typings.mithril.mod.VnodeDOM[A, S]
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
