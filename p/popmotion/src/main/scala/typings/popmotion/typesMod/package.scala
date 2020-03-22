package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ActionInit = js.Function1[
    /* observer */ typings.popmotion.observerTypesMod.IObserver, 
    typings.popmotion.PartialColdSubscription | scala.Unit
  ]
}
