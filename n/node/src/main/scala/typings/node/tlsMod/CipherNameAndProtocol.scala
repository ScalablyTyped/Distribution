package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CipherNameAndProtocol extends js.Object {
  /**
    * The cipher name.
    */
  var name: String
  /**
    * IETF name for the cipher suite.
    */
  var standardName: String
  /**
    * SSL/TLS protocol version.
    */
  var version: String
}

object CipherNameAndProtocol {
  @scala.inline
  def apply(name: String, standardName: String, version: String): CipherNameAndProtocol = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], standardName = standardName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CipherNameAndProtocol]
  }
}

