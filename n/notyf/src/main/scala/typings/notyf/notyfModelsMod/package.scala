package typings.notyf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object notyfModelsMod {
  type NotyfArrayEventFn[T] = js.Function3[
    /* elem */ T, 
    /* event */ typings.notyf.notyfModelsMod.NotyfArrayEvent, 
    /* elems */ js.Array[T], 
    scala.Unit
  ]
  type NotyfEventCallback = js.Function1[/* payload */ typings.notyf.notyfModelsMod.INotyfEventPayload, scala.Unit]
}
