package typings.openpgp

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var algorithm: String
  var data: Uint8Array
}

object Anon_Algorithm {
  @scala.inline
  def apply(algorithm: String, data: Uint8Array): Anon_Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, data = data)
  
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

