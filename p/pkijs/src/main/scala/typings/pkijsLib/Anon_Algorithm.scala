package typings
package pkijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Algorithm extends js.Object {
  var algorithm: stdLib.Algorithm
  var usages: js.Array[java.lang.String]
}

object Anon_Algorithm {
  @scala.inline
  def apply(algorithm: stdLib.Algorithm, usages: js.Array[java.lang.String]): Anon_Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("algorithm")(algorithm)
    __obj.updateDynamic("usages")(usages)
    __obj.asInstanceOf[Anon_Algorithm]
  }
}

