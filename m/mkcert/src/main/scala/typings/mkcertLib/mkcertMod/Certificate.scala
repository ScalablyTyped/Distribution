package typings
package mkcertLib.mkcertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Certificate extends js.Object {
  var cert: java.lang.String
  var key: java.lang.String
}

object Certificate {
  @scala.inline
  def apply(cert: java.lang.String, key: java.lang.String): Certificate = {
    val __obj = js.Dynamic.literal(cert = cert, key = key)
  
    __obj.asInstanceOf[Certificate]
  }
}

