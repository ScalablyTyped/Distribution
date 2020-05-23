package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  var title: String
  var titleHalign: center | end | start
  var titleStyle: js.Object
}

object Title {
  @scala.inline
  def apply(title: String, titleHalign: center | end | start, titleStyle: js.Object): Title = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

