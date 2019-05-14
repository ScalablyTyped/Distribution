package typings
package popmotionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libActionTypesMod {
  type ActionInit = js.Function1[
    /* observer */ popmotionLib.libObserverTypesMod.IObserver, 
    stdLib.Partial[ColdSubscription] | scala.Unit
  ]
  type ActionProps = popmotionLib.libObserverTypesMod.ObserverProps with popmotionLib.Anon_Init
}
