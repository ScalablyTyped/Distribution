package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serverDashRenderMod {
  type Callback = js.Function1[/* sink */ Sink, js.Promise[js.Any] | js.Any]
}
