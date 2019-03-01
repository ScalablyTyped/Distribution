package typings
package pgDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Parse extends js.Object {
  def parse(): js.Array[_]
}

object Anon_Parse {
  @scala.inline
  def apply(parse: js.Function0[js.Array[_]]): Anon_Parse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[Anon_Parse]
  }
}

