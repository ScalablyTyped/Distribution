package typings.pdfmake.interfacesMod

import typings.pdfmake.AnonHorizontalRatio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  var canvas: js.UndefOr[CanvasElement] = js.undefined
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  var headlineLevel: js.UndefOr[Double] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var ol: js.UndefOr[js.Array[OrderedListElement]] = js.undefined
  var pageBreak: js.UndefOr[PageBreak] = js.undefined
  var pageNumbers: js.Array[Double]
  var pageOrientation: js.UndefOr[PageOrientation] = js.undefined
  var pages: Double
  var qr: js.UndefOr[String] = js.undefined
  var stack: Boolean
  var startPosition: AnonHorizontalRatio
  var style: js.UndefOr[String | js.Array[String] | Style] = js.undefined
  var svg: js.UndefOr[String] = js.undefined
  var table: js.UndefOr[Table] = js.undefined
  var text: js.UndefOr[Content] = js.undefined
  var ul: js.UndefOr[js.Array[UnorderedListElement]] = js.undefined
}

object Node {
  @scala.inline
  def apply(
    pageNumbers: js.Array[Double],
    pages: Double,
    stack: Boolean,
    startPosition: AnonHorizontalRatio,
    canvas: CanvasElement = null,
    columns: js.Array[Column] = null,
    headlineLevel: Int | Double = null,
    id: String = null,
    image: String = null,
    ol: js.Array[OrderedListElement] = null,
    pageBreak: PageBreak = null,
    pageOrientation: PageOrientation = null,
    qr: String = null,
    style: String | js.Array[String] | Style = null,
    svg: String = null,
    table: Table = null,
    text: Content = null,
    ul: js.Array[UnorderedListElement] = null
  ): Node = {
    val __obj = js.Dynamic.literal(pageNumbers = pageNumbers.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    if (canvas != null) __obj.updateDynamic("canvas")(canvas.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (headlineLevel != null) __obj.updateDynamic("headlineLevel")(headlineLevel.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (ol != null) __obj.updateDynamic("ol")(ol.asInstanceOf[js.Any])
    if (pageBreak != null) __obj.updateDynamic("pageBreak")(pageBreak.asInstanceOf[js.Any])
    if (pageOrientation != null) __obj.updateDynamic("pageOrientation")(pageOrientation.asInstanceOf[js.Any])
    if (qr != null) __obj.updateDynamic("qr")(qr.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (svg != null) __obj.updateDynamic("svg")(svg.asInstanceOf[js.Any])
    if (table != null) __obj.updateDynamic("table")(table.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (ul != null) __obj.updateDynamic("ul")(ul.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
}

