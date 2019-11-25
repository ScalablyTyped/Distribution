package typings.node.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CipherNameAndProtocol extends js.Object {
  /**
    * The cipher name.
    */
  var name: java.lang.String
  /**
    * SSL/TLS protocol version.
    */
  var version: java.lang.String
}

object CipherNameAndProtocol {
  @scala.inline
  def apply(name: java.lang.String, version: java.lang.String): CipherNameAndProtocol = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CipherNameAndProtocol]
  }
}

