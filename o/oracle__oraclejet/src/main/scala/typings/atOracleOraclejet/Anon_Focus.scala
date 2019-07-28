package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.Empty
import typings.atOracleOraclejet.atOracleOraclejetStrings.focus
import typings.atOracleOraclejet.atOracleOraclejetStrings.image
import typings.atOracleOraclejet.atOracleOraclejetStrings.now
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Focus extends js.Object {
  var footerLayout: Empty | now
  var showOn: focus | image
  var timeIncrement: String
}

object Anon_Focus {
  @scala.inline
  def apply(footerLayout: Empty | now, showOn: focus | image, timeIncrement: String): Anon_Focus = {
    val __obj = js.Dynamic.literal(footerLayout = footerLayout.asInstanceOf[js.Any], showOn = showOn.asInstanceOf[js.Any], timeIncrement = timeIncrement)
  
    __obj.asInstanceOf[Anon_Focus]
  }
}

