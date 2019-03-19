package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var algorithm: java.lang.String
  var data: stdLib.Uint8Array
}

object Anon_Algorithm {
  @scala.inline
  def apply(algorithm: java.lang.String, data: stdLib.Uint8Array): Anon_Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, data = data)
  
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

