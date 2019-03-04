package typings
package pemLib.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pkcs12ReadResult extends js.Object {
  var ca: js.Array[java.lang.String]
  var cert: java.lang.String
  var key: java.lang.String
}

object Pkcs12ReadResult {
  @scala.inline
  def apply(ca: js.Array[java.lang.String], cert: java.lang.String, key: java.lang.String): Pkcs12ReadResult = {
    val __obj = js.Dynamic.literal(ca = ca, cert = cert, key = key)
  
    __obj.asInstanceOf[Pkcs12ReadResult]
  }
}

