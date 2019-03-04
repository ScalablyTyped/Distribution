package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterEnd extends js.Object {
  var items: js.Array[Anon_BorderColor]
  var sections: js.Array[js.Object]
  var title: java.lang.String
  var titleHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  var titleStyle: js.Object
}

object Anon_CenterEnd {
  @scala.inline
  def apply(
    items: js.Array[Anon_BorderColor],
    sections: js.Array[js.Object],
    title: java.lang.String,
    titleHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start,
    titleStyle: js.Object
  ): Anon_CenterEnd = {
    val __obj = js.Dynamic.literal(items = items, sections = sections, title = title, titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle)
  
    __obj.asInstanceOf[Anon_CenterEnd]
  }
}

