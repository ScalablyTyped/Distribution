package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var icon: BorderRadius
  var labelStyle: js.Object
  var showDisclosure: off | on
}

object Icon {
  @scala.inline
  def apply(icon: BorderRadius, labelStyle: js.Object, showDisclosure: off | on): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], labelStyle = labelStyle.asInstanceOf[js.Any], showDisclosure = showDisclosure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

