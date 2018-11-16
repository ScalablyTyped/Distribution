package typings
package mithrilLib.mithrilMod.MithrilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This represents the attributes available for configuring virtual elements, beyond the applicable DOM attributes. */

trait Attributes
  extends Lifecycle[js.Any, js.Any]
     with /** Any other virtual element properties, including attributes and event handlers. */
/* property */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /** The class name(s) for this virtual element, as a space-separated list. */
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  /** The class name(s) for this virtual element, as a space-separated list. */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /** A key to optionally associate with this element. */
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

