package typings.mithril

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mithrilMod {
  type CVnode[A] = Vnode[A, ClassComponent[A]]
  type CVnodeDOM[A] = VnodeDOM[A, ClassComponent[A]]
  // Vnode children types
  type Child = js.UndefOr[(Vnode[js.Any, js.Any]) | String | Double | Boolean | Null]
  type ChildArrayOrPrimitive = ChildArray | String | Double | Boolean
  type Children = Child | ChildArray
  /**
  	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  	 * Any function that returns an object with a view method can be used as a Mithril component.
  	 * Components can be consumed via the m() utility.
  	 */
  type ClosureComponent[A] = FactoryComponent[A]
  /**
  	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  	 * Any Javascript object that has a view method is a Mithril component. Components can be consumed via the m() utility.
  	 */
  type Comp[Attrs, State /* <: Lifecycle[Attrs, State] */] = (Component[Attrs, State]) with State
  /** Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse. Components can be consumed via the m() utility. */
  /* Rewritten from type alias, can be one of: 
    - typings.mithril.mithrilMod.Component[A, S]
    - typings.mithril.Anon_Vnode[A]
    - typings.mithril.mithrilMod.FactoryComponent[A]
  */
  type ComponentTypes[A, S /* <: Lifecycle[A, S] */] = (_ComponentTypes[A, S]) | FactoryComponent[A]
  /**
  	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  	 * Any function that returns an object with a view method can be used as a Mithril component.
  	 * Components can be consumed via the m() utility.
  	 */
  type FactoryComponent[A] = js.Function1[/* vnode */ Vnode[A, js.Object], Component[A, js.Object]]
  type Params = js.Object with ParamsRec
  /** This represents a key-value mapping linking routes to components. */
  type RouteDefs = /** The key represents the route. The value represents the corresponding component. */
  StringDictionary[(ComponentTypes[js.Any, js.Any]) | (RouteResolver[js.Any, js.Any])]
}
