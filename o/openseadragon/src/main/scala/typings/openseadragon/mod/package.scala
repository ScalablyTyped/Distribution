package typings.openseadragon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  // TODO: use proper eventName type aliases, and OSDEvent where appropiate
  type EventHandler[T /* <: typings.openseadragon.mod.OSDEvent[_] */] = js.Function1[/* event */ T, scala.Unit]
  type OnDrawCallback = js.Function3[
    /* position */ typings.openseadragon.mod.Point, 
    /* size */ typings.openseadragon.mod.Point, 
    /* element */ typings.std.HTMLElement, 
    scala.Unit
  ]
}
