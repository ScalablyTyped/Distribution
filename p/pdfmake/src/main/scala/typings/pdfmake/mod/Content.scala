package typings.pdfmake.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content
  extends /* additionalProperty */ StringDictionary[js.Any] {
  var alignment: js.UndefOr[Alignment] = js.undefined
  var columns: js.UndefOr[js.Array[Content]] = js.undefined
  var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var height: js.UndefOr[String | Double] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var layout: js.UndefOr[Layout] = js.undefined
  var margin: js.UndefOr[Margins] = js.undefined
  /** for numbered lists set the ol key */
  var ol: js.UndefOr[js.Array[Content]] = js.undefined
  var pageBreak: js.UndefOr[PageBreak] = js.undefined
  var qr: js.UndefOr[String] = js.undefined
  var stack: js.UndefOr[js.Array[Content]] = js.undefined
  var style: js.UndefOr[String | js.Array[String]] = js.undefined
  var svg: js.UndefOr[String] = js.undefined
  var table: js.UndefOr[Table] = js.undefined
  var text: js.UndefOr[String | (js.Array[Content | String])] = js.undefined
  var toc: js.UndefOr[TableOfContent] = js.undefined
  var tocItem: js.UndefOr[Boolean | String | js.Array[String]] = js.undefined
  /** to treat a paragraph as a bulleted list, set an array of items under the ul key */
  var ul: js.UndefOr[js.Array[Content]] = js.undefined
  var width: js.UndefOr[String | Double] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    StringDictionary: /* additionalProperty */ StringDictionary[js.Any] = null,
    alignment: Alignment = null,
    columns: js.Array[Content] = null,
    fit: js.Tuple2[Double, Double] = null,
    height: String | Double = null,
    image: String = null,
    layout: Layout = null,
    margin: Margins = null,
    ol: js.Array[Content] = null,
    pageBreak: PageBreak = null,
    qr: String = null,
    stack: js.Array[Content] = null,
    style: String | js.Array[String] = null,
    svg: String = null,
    table: Table = null,
    text: String | (js.Array[Content | String]) = null,
    toc: TableOfContent = null,
    tocItem: Boolean | String | js.Array[String] = null,
    ul: js.Array[Content] = null,
    width: String | Double = null
  ): Content = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (fit != null) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (ol != null) __obj.updateDynamic("ol")(ol.asInstanceOf[js.Any])
    if (pageBreak != null) __obj.updateDynamic("pageBreak")(pageBreak.asInstanceOf[js.Any])
    if (qr != null) __obj.updateDynamic("qr")(qr.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (toc != null) __obj.updateDynamic("toc")(toc.asInstanceOf[js.Any])
    if (tocItem != null) __obj.updateDynamic("tocItem")(tocItem.asInstanceOf[js.Any])
    if (ul != null) __obj.updateDynamic("ul")(ul.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

