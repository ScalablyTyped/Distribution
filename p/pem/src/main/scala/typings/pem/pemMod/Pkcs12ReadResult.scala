package typings.pem.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pkcs12ReadResult extends js.Object {
  var ca: js.Array[String]
  var cert: String
  var key: String
}

object Pkcs12ReadResult {
  @scala.inline
  def apply(ca: js.Array[String], cert: String, key: String): Pkcs12ReadResult = {
    val __obj = js.Dynamic.literal(ca = ca, cert = cert, key = key)
  
    __obj.asInstanceOf[Pkcs12ReadResult]
  }
}

