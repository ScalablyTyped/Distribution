package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterEnd extends js.Object {
  var items: js.Array[Anon_BorderColor]
  var sections: js.Array[js.Object]
  var title: String
  var titleHalign: center | end | start
  var titleStyle: js.Object
}

object Anon_CenterEnd {
  @scala.inline
  def apply(
    items: js.Array[Anon_BorderColor],
    sections: js.Array[js.Object],
    title: String,
    titleHalign: center | end | start,
    titleStyle: js.Object
  ): Anon_CenterEnd = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CenterEnd]
  }
}

