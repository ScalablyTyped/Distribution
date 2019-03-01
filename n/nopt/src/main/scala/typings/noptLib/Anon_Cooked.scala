package typings
package noptLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cooked extends js.Object {
  var cooked: js.Array[java.lang.String]
  var original: js.Array[java.lang.String]
  var remain: js.Array[java.lang.String]
}

object Anon_Cooked {
  @scala.inline
  def apply(
    cooked: js.Array[java.lang.String],
    original: js.Array[java.lang.String],
    remain: js.Array[java.lang.String]
  ): Anon_Cooked = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cooked")(cooked)
    __obj.updateDynamic("original")(original)
    __obj.updateDynamic("remain")(remain)
    __obj.asInstanceOf[Anon_Cooked]
  }
}

