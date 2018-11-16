package typings
package preactLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object preactNs {
  // Type alias for a component considered generally, whether stateless or stateful.
  type AnyComponent[P, S] = FunctionalComponent[P] | (Component[P, S])
  type ComponentChild = VNode[js.Any] | java.lang.String | scala.Double | scala.Null
  type ComponentChildren = js.Array[ComponentChild] | ComponentChild | js.Object | java.lang.String | scala.Double | scala.Null
  type ComponentFactory[P] = (ComponentConstructor[P, js.Object]) | FunctionalComponent[P]
  /**
  	 * @deprecated
  	 *
  	 * Use Attributes instead
  	 */
  type ComponentProps = Attributes
  type Key = java.lang.String | scala.Double
  /**
  	 * @deprecated
  	 *
  	 * Use ClassAttributes instead
  	 */
  type PreactHTMLAttributes = ClassAttributes[js.Any]
  type Ref[T] = js.Function1[/* instance */ T, scala.Unit]
  type RenderableProps[P, RefType] = stdLib.Readonly[P with Attributes with preactLib.Anon_Children[RefType]]
}
