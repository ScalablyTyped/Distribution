package typings.notyf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object notyfDotModelsMod {
  type NotyfArrayEventFn[T] = js.Function3[/* elem */ T, /* event */ NotyfArrayEvent, /* elems */ js.Array[T], Unit]
}
