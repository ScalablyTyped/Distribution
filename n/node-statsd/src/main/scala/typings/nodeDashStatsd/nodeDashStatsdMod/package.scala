package typings.nodeDashStatsd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashStatsdMod {
  import typings.node.Buffer
  import typings.std.Error

  type Callback = js.Function2[/* error */ js.UndefOr[Error], /* bytes */ js.UndefOr[Buffer], Unit]
}
