package typings.pdfmake.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableOfContent extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var numberStyle: js.UndefOr[String | js.Array[String] | Style] = js.undefined
  var textMargin: js.UndefOr[Margins] = js.undefined
  var textStyle: js.UndefOr[String | js.Array[String] | Style] = js.undefined
  var title: js.UndefOr[Content] = js.undefined
}

object TableOfContent {
  @scala.inline
  def apply(
    id: String = null,
    numberStyle: String | js.Array[String] | Style = null,
    textMargin: Margins = null,
    textStyle: String | js.Array[String] | Style = null,
    title: Content = null
  ): TableOfContent = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (numberStyle != null) __obj.updateDynamic("numberStyle")(numberStyle.asInstanceOf[js.Any])
    if (textMargin != null) __obj.updateDynamic("textMargin")(textMargin.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableOfContent]
  }
}

