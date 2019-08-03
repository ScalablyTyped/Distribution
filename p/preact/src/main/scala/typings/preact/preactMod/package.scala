package typings.preact

import typings.preact.Anon_Children
import typings.std.Exclude
import typings.std.Extract
import typings.std.Partial
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object preactMod {
  type ComponentChild = VNode[js.Any] | js.Object | String | Double | Boolean | Null
  type ComponentChildren = js.Array[ComponentChild] | ComponentChild
  type ComponentFactory[P] = (ComponentConstructor[P, js.Object]) | FunctionalComponent[P]
  /**
  	 * @deprecated
  	 *
  	 * Use Attributes instead
  	 */
  type ComponentProps = Attributes
  type Defaultize[Props, Defaults] = (Partial[Pick[Props, Extract[String, String]]]) with (Pick[Props, Exclude[String, String]])
  type Key = String | Double
  /**
  	 * @deprecated
  	 *
  	 * Use ClassAttributes instead
  	 */
  type PreactHTMLAttributes = ClassAttributes[js.Any]
  type Ref[T] = RefObject[T] | RefCallback[T]
  type RefCallback[T] = js.Function1[/* instance */ T | Null, Unit]
  type RenderableProps[P, RefType] = P with Attributes with Anon_Children[RefType]
}
