package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsNeeded extends js.Object {
  var backgroundColor: java.lang.String
  var borderColor: java.lang.String
  var maxSize: java.lang.String
  var position: atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var referenceObjectSection: Anon_Center
  var rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  var scrolling: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.asNeeded
  var sections: js.Array[Anon_CenterEnd]
  var seriesSection: Anon_Center
  var size: java.lang.String
  var symbolHeight: scala.Double
  var symbolWidth: scala.Double
  var textStyle: js.Object
  var title: java.lang.String
  var titleHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start
  var titleStyle: js.Object
}

object Anon_AsNeeded {
  @scala.inline
  def apply(
    backgroundColor: java.lang.String,
    borderColor: java.lang.String,
    maxSize: java.lang.String,
    position: atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    referenceObjectSection: Anon_Center,
    rendered: atOracleOraclejetLib.atOracleOraclejetLibStrings.on | atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto,
    scrolling: atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.asNeeded,
    sections: js.Array[Anon_CenterEnd],
    seriesSection: Anon_Center,
    size: java.lang.String,
    symbolHeight: scala.Double,
    symbolWidth: scala.Double,
    textStyle: js.Object,
    title: java.lang.String,
    titleHalign: atOracleOraclejetLib.atOracleOraclejetLibStrings.center | atOracleOraclejetLib.atOracleOraclejetLibStrings.end | atOracleOraclejetLib.atOracleOraclejetLibStrings.start,
    titleStyle: js.Object
  ): Anon_AsNeeded = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("borderColor")(borderColor)
    __obj.updateDynamic("maxSize")(maxSize)
    __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.updateDynamic("referenceObjectSection")(referenceObjectSection)
    __obj.updateDynamic("rendered")(rendered.asInstanceOf[js.Any])
    __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    __obj.updateDynamic("sections")(sections)
    __obj.updateDynamic("seriesSection")(seriesSection)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("symbolHeight")(symbolHeight)
    __obj.updateDynamic("symbolWidth")(symbolWidth)
    __obj.updateDynamic("textStyle")(textStyle)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("titleHalign")(titleHalign.asInstanceOf[js.Any])
    __obj.updateDynamic("titleStyle")(titleStyle)
    __obj.asInstanceOf[Anon_AsNeeded]
  }
}

