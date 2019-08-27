package typings.nodeDashVagrant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashVagrantMod {
  import typings.std.Error

  type Callback = js.Function2[/* err */ ErrorArg, /* out */ js.UndefOr[String], Unit]
  type ErrorArg = Error | String | Null
}
