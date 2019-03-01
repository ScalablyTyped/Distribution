package typings
package postmanDashCollectionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InOut extends js.Object {
  def in[T](`val`: T): T
  def out[T](`val`: T): T
}

object Anon_InOut {
  @scala.inline
  def apply(in: js.Function1[js.Any, js.Any], out: js.Function1[js.Any, js.Any]): Anon_InOut = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("in")(in)
    __obj.updateDynamic("out")(out)
    __obj.asInstanceOf[Anon_InOut]
  }
}

