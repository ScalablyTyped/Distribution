package typings.moveto

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object movetoMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.HTMLElement

  /**
    * Easing Function
    * @param t Current time
    * @param b Start value
    * @param c Change in value
    * @param d Duration
    * @return Calculated value
    */
  type MoveToEaseFunction = js.Function4[/* t */ Double, /* b */ Double, /* c */ Double, /* d */ Double, Double]
  type MoveToEaseFunctionsObject = StringDictionary[MoveToEaseFunction]
  /**
    * Callback function to be run after the scroll complete.
    */
  type callbackType = js.Function1[/* target */ HTMLElement | Double, Unit]
  type unregisterTriggerType = js.Function0[Unit]
}
