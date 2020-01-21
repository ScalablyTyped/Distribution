package typings.nodeInsights

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackFunc = js.Function2[
    /* err */ js.UndefOr[typings.std.Error | scala.Null], 
    /* responseBody */ java.lang.String, 
    scala.Unit
  ]
}
