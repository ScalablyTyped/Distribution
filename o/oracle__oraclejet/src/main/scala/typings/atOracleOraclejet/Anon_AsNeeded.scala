package typings.atOracleOraclejet

import typings.atOracleOraclejet.atOracleOraclejetStrings.asNeeded
import typings.atOracleOraclejet.atOracleOraclejetStrings.auto
import typings.atOracleOraclejet.atOracleOraclejetStrings.bottom
import typings.atOracleOraclejet.atOracleOraclejetStrings.center
import typings.atOracleOraclejet.atOracleOraclejetStrings.end
import typings.atOracleOraclejet.atOracleOraclejetStrings.off
import typings.atOracleOraclejet.atOracleOraclejetStrings.on
import typings.atOracleOraclejet.atOracleOraclejetStrings.start
import typings.atOracleOraclejet.atOracleOraclejetStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AsNeeded extends js.Object {
  var backgroundColor: String
  var borderColor: String
  var maxSize: String
  var position: start | end | bottom | top | auto
  var referenceObjectSection: Anon_Center
  var rendered: on | off | auto
  var scrolling: off | asNeeded
  var sections: js.Array[Anon_CenterEnd]
  var seriesSection: Anon_Center
  var size: String
  var symbolHeight: Double
  var symbolWidth: Double
  var textStyle: js.Object
  var title: String
  var titleHalign: center | end | start
  var titleStyle: js.Object
}

object Anon_AsNeeded {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    maxSize: String,
    position: start | end | bottom | top | auto,
    referenceObjectSection: Anon_Center,
    rendered: on | off | auto,
    scrolling: off | asNeeded,
    sections: js.Array[Anon_CenterEnd],
    seriesSection: Anon_Center,
    size: String,
    symbolHeight: Double,
    symbolWidth: Double,
    textStyle: js.Object,
    title: String,
    titleHalign: center | end | start,
    titleStyle: js.Object
  ): Anon_AsNeeded = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], referenceObjectSection = referenceObjectSection.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], seriesSection = seriesSection.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], symbolHeight = symbolHeight.asInstanceOf[js.Any], symbolWidth = symbolWidth.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AsNeeded]
  }
}

