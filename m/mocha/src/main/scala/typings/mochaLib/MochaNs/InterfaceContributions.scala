package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Third-party declarations that want to add new entries to the `Interface` union can
  * contribute names here.
  */
trait InterfaceContributions extends js.Object {
  var bdd: scala.Nothing
  var exports: scala.Nothing
  var qunit: scala.Nothing
  var tdd: scala.Nothing
}

object InterfaceContributions {
  @scala.inline
  def apply(bdd: scala.Nothing, exports: scala.Nothing, qunit: scala.Nothing, tdd: scala.Nothing): InterfaceContributions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bdd")(bdd)
    __obj.updateDynamic("exports")(exports)
    __obj.updateDynamic("qunit")(qunit)
    __obj.updateDynamic("tdd")(tdd)
    __obj.asInstanceOf[InterfaceContributions]
  }
}

