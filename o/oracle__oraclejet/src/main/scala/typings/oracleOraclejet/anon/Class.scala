package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Class extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
}

object Class {
  @scala.inline
  def apply(`class`: String = null, style: String = null): Class = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
}

