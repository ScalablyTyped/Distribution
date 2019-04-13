package typings
package preactLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionalComponent[P]
  extends AnyComponent[P, js.Any] {
  var defaultProps: js.UndefOr[stdLib.Partial[P]] = js.native
  var displayName: js.UndefOr[java.lang.String] = js.native
  def apply(props: RenderableProps[P, _]): VNode[_] | scala.Null = js.native
  def apply(props: RenderableProps[P, _], context: js.Any): VNode[_] | scala.Null = js.native
}

