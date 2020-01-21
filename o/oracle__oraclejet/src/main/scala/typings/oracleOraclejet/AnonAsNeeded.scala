package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetStrings.asNeeded
import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAsNeeded extends js.Object {
  var backgroundColor: String
  var borderColor: String
  var maxSize: String
  var position: start | end | bottom | top | auto
  var referenceObjectSection: AnonCenter
  var rendered: on | off | auto
  var scrolling: off | asNeeded
  var sections: js.Array[AnonCenterEnd]
  var seriesSection: AnonCenter
  var size: String
  var symbolHeight: Double
  var symbolWidth: Double
  var textStyle: js.Object
  var title: String
  var titleHalign: center | end | start
  var titleStyle: js.Object
}

object AnonAsNeeded {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    maxSize: String,
    position: start | end | bottom | top | auto,
    referenceObjectSection: AnonCenter,
    rendered: on | off | auto,
    scrolling: off | asNeeded,
    sections: js.Array[AnonCenterEnd],
    seriesSection: AnonCenter,
    size: String,
    symbolHeight: Double,
    symbolWidth: Double,
    textStyle: js.Object,
    title: String,
    titleHalign: center | end | start,
    titleStyle: js.Object
  ): AnonAsNeeded = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], referenceObjectSection = referenceObjectSection.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], seriesSection = seriesSection.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], symbolHeight = symbolHeight.asInstanceOf[js.Any], symbolWidth = symbolWidth.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAsNeeded]
  }
}

