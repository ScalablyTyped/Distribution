package typings
package officeDashUiDashFabricDashReactLib.libComponentsSpinButtonSpinButtonDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISpinButton extends js.Object {
  /**
    * The value of the SpinButton. Use this if you intend to pass in a new value as a result of onChange events.
    * This value is mutually exclusive to defaultValue. Use one or the other.
    */
  var value: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Sets focus to the spin button.
    */
  def focus(): scala.Unit
}

