package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Center extends js.Object {
  var title: String
  var titleHalign: center | end | start
  var titleStyle: js.Object
}

object Anon_Center {
  @scala.inline
  def apply(title: String, titleHalign: center | end | start, titleStyle: js.Object): Anon_Center = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Center]
  }
}

