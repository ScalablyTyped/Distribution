package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object prepareNs {
  type AddHook = js.Function2[/* item */ js.Any, /* queue */ js.Array[js.Any], scala.Boolean]
  type UploadHook[UploadHookSource] = js.Function2[/* prepare */ UploadHookSource, /* item */ js.Any, scala.Boolean]
}
