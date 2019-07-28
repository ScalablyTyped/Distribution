package typings.nodeDashStatsd

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashStatsdMod {
  type Callback = js.Function2[/* error */ js.UndefOr[Error], /* bytes */ js.UndefOr[Buffer], Unit]
}
