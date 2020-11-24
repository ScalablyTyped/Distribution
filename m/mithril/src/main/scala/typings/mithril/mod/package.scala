package typings.mithril

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type CVnode[A] = typings.mithril.mod.Vnode[A, typings.mithril.mod.ClassComponent[A]]
  
  type CVnodeDOM[A] = typings.mithril.mod.VnodeDOM[A, typings.mithril.mod.ClassComponent[A]]
  
  // Vnode children types
  type Child = js.UndefOr[
    (typings.mithril.mod.Vnode[js.Any, js.Any]) | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
  
  type ChildArrayOrPrimitive = typings.mithril.mod.ChildArray | java.lang.String | scala.Double | scala.Boolean
  
  type Children = typings.mithril.mod.Child | typings.mithril.mod.ChildArray
  
  /**
    * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
    * Any function that returns an object with a view method can be used as a Mithril component.
    * Components can be consumed via the m() utility.
    */
  type ClosureComponent[A] = typings.mithril.mod.FactoryComponent[A]
  
  /**
    * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
    * Any Javascript object that has a view method is a Mithril component. Components can be consumed via the m() utility.
    */
  type Comp[Attrs, State /* <: typings.mithril.mod.Lifecycle[Attrs, State] */] = (typings.mithril.mod.Component[Attrs, State]) with State
  
  /** Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse. Components can be consumed via the m() utility. */
  /* Rewritten from type alias, can be one of: 
    - typings.mithril.mod.Component[A, S]
    - typings.mithril.anon.Instantiable[A]
    - typings.mithril.mod.FactoryComponent[A]
  */
  type ComponentTypes[A, S /* <: typings.mithril.mod.Lifecycle[A, S] */] = (typings.mithril.mod._ComponentTypes[A, S]) | typings.mithril.mod.FactoryComponent[A]
  
  /**
    * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
    * Any function that returns an object with a view method can be used as a Mithril component.
    * Components can be consumed via the m() utility.
    */
  type FactoryComponent[A] = js.Function1[
    /* vnode */ typings.mithril.mod.Vnode[A, js.Object], 
    typings.mithril.mod.Component[A, js.Object]
  ]
  
  type Params = js.Object with typings.mithril.mod.ParamsRec
  
  /** This represents a key-value mapping linking routes to components. */
  type RouteDefs = /** The key represents the route. The value represents the corresponding component. */
  org.scalablytyped.runtime.StringDictionary[
    (typings.mithril.mod.ComponentTypes[js.Any, js.Any]) | (typings.mithril.mod.RouteResolver[js.Any, js.Any])
  ]
}
