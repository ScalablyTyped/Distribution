package typings
package nodeDashForgeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Type extends js.Object {
  var `type`: java.lang.String
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Type {
  @scala.inline
  def apply(`type`: java.lang.String, value: java.lang.String = null): Anon_Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Type]
  }
}

