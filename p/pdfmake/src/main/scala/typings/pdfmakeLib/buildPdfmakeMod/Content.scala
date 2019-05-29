package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content
  extends /* additionalProperty */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var alignment: js.UndefOr[Alignment] = js.undefined
  var columns: js.UndefOr[js.Array[Content]] = js.undefined
  var fit: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var height: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var image: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[Margins] = js.undefined
  var ol: js.UndefOr[js.Array[Content]] = js.undefined
  var pageBreak: js.UndefOr[pdfmakeLib.pdfmakeLibStrings.before | pdfmakeLib.pdfmakeLibStrings.after] = js.undefined
  var stack: js.UndefOr[js.Array[Content]] = js.undefined
  var style: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var table: js.UndefOr[Table] = js.undefined
  var text: js.UndefOr[java.lang.String | (js.Array[Content | java.lang.String])] = js.undefined
  var ul: js.UndefOr[js.Array[Content]] = js.undefined
  var width: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    StringDictionary: /* additionalProperty */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    alignment: Alignment = null,
    columns: js.Array[Content] = null,
    fit: js.Tuple2[scala.Double, scala.Double] = null,
    height: java.lang.String | scala.Double = null,
    image: java.lang.String = null,
    margin: Margins = null,
    ol: js.Array[Content] = null,
    pageBreak: pdfmakeLib.pdfmakeLibStrings.before | pdfmakeLib.pdfmakeLibStrings.after = null,
    stack: js.Array[Content] = null,
    style: java.lang.String | js.Array[java.lang.String] = null,
    table: Table = null,
    text: java.lang.String | (js.Array[Content | java.lang.String]) = null,
    ul: js.Array[Content] = null,
    width: java.lang.String | scala.Double = null
  ): Content = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (fit != null) __obj.updateDynamic("fit")(fit)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (ol != null) __obj.updateDynamic("ol")(ol)
    if (pageBreak != null) __obj.updateDynamic("pageBreak")(pageBreak.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table)
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (ul != null) __obj.updateDynamic("ul")(ul)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

