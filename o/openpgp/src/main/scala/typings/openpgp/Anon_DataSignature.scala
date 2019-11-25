package typings.openpgp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSignature extends js.Object {
  var data: String
  var signature: String
}

object Anon_DataSignature {
  @scala.inline
  def apply(data: String, signature: String): Anon_DataSignature = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DataSignature]
  }
}

