package typings.popmotion

import typings.popmotion.Anon_Init
import typings.popmotion.libObserverTypesMod.IObserver
import typings.popmotion.libObserverTypesMod.ObserverProps
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libActionTypesMod {
  type ActionInit = js.Function1[/* observer */ IObserver, Partial[ColdSubscription] | Unit]
  type ActionProps = ObserverProps with Anon_Init
}
