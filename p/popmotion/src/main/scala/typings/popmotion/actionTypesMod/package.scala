package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object actionTypesMod {
  type ActionInit = js.Function1[
    /* observer */ typings.popmotion.observerTypesMod.IObserver, 
    typings.popmotion.anon.PartialColdSubscription | scala.Unit
  ]
}
