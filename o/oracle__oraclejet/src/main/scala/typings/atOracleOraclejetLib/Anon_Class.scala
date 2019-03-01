package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Class extends js.Object {
  var `class`: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Class {
  @scala.inline
  def apply(`class`: java.lang.String = null, style: java.lang.String = null): Anon_Class = {
    val __obj = js.Dynamic.literal()
    if (`class` != null) __obj.updateDynamic("class")(`class`)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[Anon_Class]
  }
}

