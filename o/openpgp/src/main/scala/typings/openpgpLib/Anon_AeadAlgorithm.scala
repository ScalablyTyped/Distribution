package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AeadAlgorithm extends js.Object {
  var aeadAlgorithm: java.lang.String
  var algorithm: java.lang.String
  var data: stdLib.Uint8Array
}

object Anon_AeadAlgorithm {
  @scala.inline
  def apply(aeadAlgorithm: java.lang.String, algorithm: java.lang.String, data: stdLib.Uint8Array): Anon_AeadAlgorithm = {
    val __obj = js.Dynamic.literal(aeadAlgorithm = aeadAlgorithm, algorithm = algorithm, data = data)
  
    __obj.asInstanceOf[Anon_AeadAlgorithm]
  }
}

