package typings
package passportLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var value: java.lang.String
}

object Anon_Type {
  @scala.inline
  def apply(value: java.lang.String, `type`: java.lang.String = null): Anon_Type = {
    val __obj = js.Dynamic.literal(value = value)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Type]
  }
}

