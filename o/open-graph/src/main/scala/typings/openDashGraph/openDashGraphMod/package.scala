package typings.openDashGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object openDashGraphMod {
  import typings.std.Error

  type DataCallback = js.Function2[/* err */ Error | Null, /* data */ js.UndefOr[Data], Unit]
  type RequestCallback = js.Function2[/* err */ Error | Null, /* data */ js.UndefOr[String], Unit]
}
