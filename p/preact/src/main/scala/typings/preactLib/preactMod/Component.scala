package typings
package preactLib.preactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("preact", "Component")
@js.native
abstract class Component[P, S] ()
  extends preactLib.preactMod.preactNs.Component[P, S] {
  def this(props: P) = this()
  def this(props: P, context: js.Any) = this()
}

@JSImport("preact", "Component")
@js.native
object Component extends js.Object {
  var defaultProps: js.UndefOr[js.Any] = js.native
  var displayName: js.UndefOr[java.lang.String] = js.native
}

