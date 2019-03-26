package typings
package mithrilLib.mithrilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MithrilNs {
  type CVnode[A] = Vnode[A, ClassComponent[A]]
  type CVnodeDOM[A] = VnodeDOM[A, ClassComponent[A]]
  // Vnode children types
  type Child = js.UndefOr[
    (Vnode[js.Any, js.Any]) | java.lang.String | scala.Double | scala.Boolean | scala.Null
  ]
  type ChildArrayOrPrimitive = ChildArray | java.lang.String | scala.Double | scala.Boolean
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
    - Component[A, S]
    - mithrilLib.Anon_Vnode[A]
    - FactoryComponent[A]
  */
  type ComponentTypes[A, S /* <: Lifecycle[A, S] */] = (_ComponentTypes[A, S]) | FactoryComponent[A]
  /**
  	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  	 * Any function that returns an object with a view method can be used as a Mithril component.
  	 * Components can be consumed via the m() utility.
  	 */
  type FactoryComponent[A] = js.Function1[/* vnode */ Vnode[A, js.Object], Component[A, js.Object]]
}
