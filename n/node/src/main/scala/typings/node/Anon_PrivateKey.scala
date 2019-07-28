package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PrivateKey extends js.Object {
  var privateKey: java.lang.String
  var publicKey: java.lang.String
}

object Anon_PrivateKey {
  @scala.inline
  def apply(privateKey: java.lang.String, publicKey: java.lang.String): Anon_PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey, publicKey = publicKey)
  
    __obj.asInstanceOf[Anon_PrivateKey]
  }
}

