package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSignature extends js.Object {
  var data: java.lang.String
  var signature: java.lang.String
}

object Anon_DataSignature {
  @scala.inline
  def apply(data: java.lang.String, signature: java.lang.String): Anon_DataSignature = {
    val __obj = js.Dynamic.literal(data = data, signature = signature)
  
    __obj.asInstanceOf[Anon_DataSignature]
  }
}

