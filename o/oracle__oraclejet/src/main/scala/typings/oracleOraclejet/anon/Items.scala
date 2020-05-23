package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Items extends js.Object {
  var items: js.Array[BorderColor]
  var sections: js.Array[js.Object]
  var title: String
  var titleHalign: center | end | start
  var titleStyle: js.Object
}

object Items {
  @scala.inline
  def apply(
    items: js.Array[BorderColor],
    sections: js.Array[js.Object],
    title: String,
    titleHalign: center | end | start,
    titleStyle: js.Object
  ): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
}

