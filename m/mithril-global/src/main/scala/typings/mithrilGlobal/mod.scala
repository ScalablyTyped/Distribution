package typings.mithrilGlobal

import org.scalablytyped.runtime.Shortcut
import typings.mithrilGlobal.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  
  @js.native
  trait Static
    extends StObject
       with typings.mithril.mod.Static {
    
    def stream[T](): typings.mithril.streamMod.Stream[T] = js.native
    def stream[T](value: T): typings.mithril.streamMod.Stream[T] = js.native
    @JSName("stream")
    var stream_Original: FnCall = js.native
  }
  
  type Stream[T] = typings.mithril.streamMod.Stream[T]
  
  type Vnode[A, S /* <: typings.mithril.mod.Lifecycle[A, S] */] = typings.mithril.mod.Vnode[A, S]
  
  type VnodeDOM[A, S /* <: typings.mithril.mod.Lifecycle[A, S] */] = typings.mithril.mod.VnodeDOM[A, S]
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
