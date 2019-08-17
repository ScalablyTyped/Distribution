package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object streamMod {
  import typings.node.Error

  type TransformCallback = js.Function2[/* error */ js.UndefOr[Error | Null], /* data */ js.UndefOr[js.Any], Unit]
}
