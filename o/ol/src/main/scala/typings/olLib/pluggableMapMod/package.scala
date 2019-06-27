package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pluggableMapMod {
  type PostRenderFunction = js.Function2[/* p0 */ PluggableMap, /* p1 */ js.UndefOr[FrameState], scala.Boolean]
}
