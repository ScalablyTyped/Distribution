package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverflowToolbar extends Toolbar {
  /**
    * Closes the overflow area.Useful to manually close the overflow after having suppressed automatic
    * closing with "closeOverflowOnInteraction=false".
    * @since 1.40
    */
  def closeOverflow(): Unit = js.native
}

