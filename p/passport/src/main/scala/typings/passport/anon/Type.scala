package typings.passport.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: js.UndefOr[String] = js.undefined
  var value: String
}

object Type {
  @scala.inline
  def apply(value: String, `type`: String = null): Type = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

