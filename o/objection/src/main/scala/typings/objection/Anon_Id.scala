package typings.objection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var `#id`: js.UndefOr[String] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(`#id`: String = null): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (`#id` != null) __obj.updateDynamic("#id")(`#id`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

