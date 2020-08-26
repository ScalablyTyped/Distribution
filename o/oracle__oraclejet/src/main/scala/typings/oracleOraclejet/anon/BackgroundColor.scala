package typings.oracleOraclejet.anon

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

@js.native
trait BackgroundColor extends js.Object {
  var backgroundColor: String = js.native
  var borderColor: String = js.native
  var maxSize: String = js.native
  var position: start | end | bottom | top | auto = js.native
  var referenceObjectSection: Title = js.native
  var rendered: on | off | auto = js.native
  var scrolling: off | asNeeded = js.native
  var sections: js.Array[Items] = js.native
  var seriesSection: Title = js.native
  var size: String = js.native
  var symbolHeight: Double = js.native
  var symbolWidth: Double = js.native
  var textStyle: js.Object = js.native
  var title: String = js.native
  var titleHalign: center | end | start = js.native
  var titleStyle: js.Object = js.native
}

object BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    borderColor: String,
    maxSize: String,
    position: start | end | bottom | top | auto,
    referenceObjectSection: Title,
    rendered: on | off | auto,
    scrolling: off | asNeeded,
    sections: js.Array[Items],
    seriesSection: Title,
    size: String,
    symbolHeight: Double,
    symbolWidth: Double,
    textStyle: js.Object,
    title: String,
    titleHalign: center | end | start,
    titleStyle: js.Object
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], referenceObjectSection = referenceObjectSection.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], seriesSection = seriesSection.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], symbolHeight = symbolHeight.asInstanceOf[js.Any], symbolWidth = symbolWidth.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHalign = titleHalign.asInstanceOf[js.Any], titleStyle = titleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSize(value: String): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: start | end | bottom | top | auto): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setReferenceObjectSection(value: Title): Self = this.set("referenceObjectSection", value.asInstanceOf[js.Any])
    @scala.inline
    def setRendered(value: on | off | auto): Self = this.set("rendered", value.asInstanceOf[js.Any])
    @scala.inline
    def setScrolling(value: off | asNeeded): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def setSectionsVarargs(value: Items*): Self = this.set("sections", js.Array(value :_*))
    @scala.inline
    def setSections(value: js.Array[Items]): Self = this.set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeriesSection(value: Title): Self = this.set("seriesSection", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolHeight(value: Double): Self = this.set("symbolHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setSymbolWidth(value: Double): Self = this.set("symbolWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextStyle(value: js.Object): Self = this.set("textStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleHalign(value: center | end | start): Self = this.set("titleHalign", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleStyle(value: js.Object): Self = this.set("titleStyle", value.asInstanceOf[js.Any])
  }
  
}

