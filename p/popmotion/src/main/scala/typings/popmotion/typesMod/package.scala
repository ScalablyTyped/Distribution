package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ActionInit = js.Function1[
    /* observer */ typings.popmotion.observerTypesMod.IObserver, 
    typings.std.Partial[typings.popmotion.typesMod.ColdSubscription] | scala.Unit
  ]
  type ActionProps = typings.popmotion.observerTypesMod.ObserverProps with typings.popmotion.AnonInit
}
