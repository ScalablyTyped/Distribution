package typings
package preactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object preactMod {
  type ComponentChild = VNode[js.Any] | js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null
  type ComponentChildren = js.Array[ComponentChild] | ComponentChild
  type ComponentFactory[P] = (ComponentConstructor[P, js.Object]) | FunctionalComponent[P]
  /**
  	 * @deprecated
  	 *
  	 * Use Attributes instead
  	 */
  type ComponentProps = Attributes
  type Defaultize[Props, Defaults] = (stdLib.Partial[stdLib.Pick[Props, stdLib.Extract[java.lang.String, java.lang.String]]]) with (stdLib.Pick[Props, stdLib.Exclude[java.lang.String, java.lang.String]])
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
