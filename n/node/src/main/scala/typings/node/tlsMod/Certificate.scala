package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  /**
    * Country code.
    */
  var C: String
  /**
    * Common name.
    */
  var CN: String
  /**
    * Locality.
    */
  var L: String
  /**
    * Organization.
    */
  var O: String
  /**
    * Organizational unit.
    */
  var OU: String
  /**
    * Street.
    */
  var ST: String
}

object Certificate {
  @scala.inline
  def apply(C: String, CN: String, L: String, O: String, OU: String, ST: String): Certificate = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], L = L.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any], OU = OU.asInstanceOf[js.Any], ST = ST.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Certificate]
  }
}

