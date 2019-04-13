package typings
package movetoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object movetoMod {
  /**
    * Easing Function
    * @param t Current time
    * @param b Start value
    * @param c Change in value
    * @param d Duration
    * @return Calculated value
    */
  type MoveToEaseFunction = js.Function4[
    /* t */ scala.Double, 
    /* b */ scala.Double, 
    /* c */ scala.Double, 
    /* d */ scala.Double, 
    scala.Double
  ]
  type MoveToEaseFunctionsObject = org.scalablytyped.runtime.StringDictionary[MoveToEaseFunction]
  /**
    * Callback function to be run after the scroll complete.
    */
  type callbackType = js.Function1[/* target */ stdLib.HTMLElement | scala.Double, scala.Unit]
  type unregisterTriggerType = js.Function0[scala.Unit]
}
