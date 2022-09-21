package typings.mithril.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mithril.mithrilStrings.onbeforeremove
import typings.mithril.mithrilStrings.onbeforeupdate
import typings.mithril.mithrilStrings.oncreate
import typings.mithril.mithrilStrings.oninit
import typings.mithril.mithrilStrings.onremove
import typings.mithril.mithrilStrings.onupdate
import typings.mithril.mithrilStrings.view
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CVnode[A] = Vnode[A, ClassComponent[A]]

type CVnodeDOM[A] = VnodeDOM[A, ClassComponent[A]]

// Vnode children types
type Child = js.UndefOr[(Vnode[Any, Any]) | String | Double | Boolean | Null]

type ChildArray = js.Array[Children]

type ChildArrayOrPrimitive = ChildArray | String | Double | Boolean

type Children = Child | Any

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
type Comp[Attrs, State] = NoLifecycle[State] & (Component[Attrs, NoLifecycle[State]])

/** Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse. Components can be consumed via the m() utility. */
/* Rewritten from type alias, can be one of: 
  - typings.mithril.mod.Component[A, S]
  - typings.mithril.anon.Instantiable[A]
  - typings.mithril.mod.FactoryComponent[A]
*/
type ComponentTypes[A, S] = (_ComponentTypes[A, S]) | FactoryComponent[A]

/**
  * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  * Any function that returns an object with a view method can be used as a Mithril component.
  * Components can be consumed via the m() utility.
  */
type FactoryComponent[A] = js.Function1[/* vnode */ Vnode[A, js.Object], Component[A, js.Object]]

type NoLifecycle[T] = Omit[
T, 
/* keyof mithril.mithril.Component<{}, {}> */ oninit | oncreate | onbeforeremove | onremove | onbeforeupdate | onupdate | view]

type ParamsRec = // Ideally, it'd be this:
// `[key: string | number]: Params | !symbol & !object`
StringDictionary[js.UndefOr[String | Double | Boolean | Null | Params]]

/** This represents a key-value mapping linking routes to components. */
type RouteDefs = /** The key represents the route. The value represents the corresponding component. */
StringDictionary[(ComponentTypes[Any, Any]) | (RouteResolver[Any, Any])]
