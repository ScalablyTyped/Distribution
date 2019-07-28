package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Class extends js.Object {
  var `class`: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[String] = js.undefined
}

object Anon_Class {
  @scala.inline
  def apply(`class`: String = null, style: String = null): Anon_Class = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_Class]
  }
}

