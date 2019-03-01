package typings
package nodeLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  /**
    * Country code.
    */
  var C: java.lang.String
  /**
    * Common name.
    */
  var CN: java.lang.String
  /**
    * Locality.
    */
  var L: java.lang.String
  /**
    * Organization.
    */
  var O: java.lang.String
  /**
    * Organizational unit.
    */
  var OU: java.lang.String
  /**
    * Street.
    */
  var ST: java.lang.String
}

object Certificate {
  @scala.inline
  def apply(
    C: java.lang.String,
    CN: java.lang.String,
    L: java.lang.String,
    O: java.lang.String,
    OU: java.lang.String,
    ST: java.lang.String
  ): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("C")(C)
    __obj.updateDynamic("CN")(CN)
    __obj.updateDynamic("L")(L)
    __obj.updateDynamic("O")(O)
    __obj.updateDynamic("OU")(OU)
    __obj.updateDynamic("ST")(ST)
    __obj.asInstanceOf[Certificate]
  }
}

