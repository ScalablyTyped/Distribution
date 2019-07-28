package typings.atMrmlncReaddirDashEnhanced

import typings.node.NodeJSNs.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atMrmlncReaddirDashEnhancedMod {
  type Callback[T] = js.Function2[/* err */ ErrnoException, /* result */ T, Unit]
  type CallbackEntry = Callback[js.Array[Entry]]
  type CallbackString = Callback[js.Array[String]]
  type FilterFunction = js.Function1[/* stat */ Entry, Boolean]
}
