package typings
package atNivoStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0[T] extends js.Object {
  var `0`: scala.Double
  var `1`: scala.Double
  var data: T
}

object Anon_0 {
  @scala.inline
  def apply[T](`0`: scala.Double, `1`: scala.Double, data: T): Anon_0[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("0")(`0`)
    __obj.updateDynamic("1")(`1`)
    __obj.asInstanceOf[Anon_0[T]]
  }
}

