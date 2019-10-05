package typings.mitt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mitt {
  type Handler = js.Function1[/* event */ js.UndefOr[js.Any], Unit]
}
