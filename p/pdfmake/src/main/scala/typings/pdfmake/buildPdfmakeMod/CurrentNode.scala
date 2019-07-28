package typings.pdfmake.buildPdfmakeMod

import typings.pdfmake.Anon_HorizontalRatio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentNode extends js.Object {
  var canvas: String
  var columns: js.Array[Content]
  var headlineLevel: String
  var id: String
  var image: String
  var ol: js.Array[Content]
  var pageNumbers: js.Array[Double]
  var pageOrientation: PageOrientation
  var pages: Double
  var qr: String
  var stack: Boolean
  var startPosition: Anon_HorizontalRatio
  var style: String | js.Array[String]
  var table: Table
  var text: String | (js.Array[Content | String])
  var ul: js.Array[Content]
}

object CurrentNode {
  @scala.inline
  def apply(
    canvas: String,
    columns: js.Array[Content],
    headlineLevel: String,
    id: String,
    image: String,
    ol: js.Array[Content],
    pageNumbers: js.Array[Double],
    pageOrientation: PageOrientation,
    pages: Double,
    qr: String,
    stack: Boolean,
    startPosition: Anon_HorizontalRatio,
    style: String | js.Array[String],
    table: Table,
    text: String | (js.Array[Content | String]),
    ul: js.Array[Content]
  ): CurrentNode = {
    val __obj = js.Dynamic.literal(canvas = canvas, columns = columns, headlineLevel = headlineLevel, id = id, image = image, ol = ol, pageNumbers = pageNumbers, pageOrientation = pageOrientation, pages = pages, qr = qr, stack = stack, startPosition = startPosition, style = style.asInstanceOf[js.Any], table = table, text = text.asInstanceOf[js.Any], ul = ul)
  
    __obj.asInstanceOf[CurrentNode]
  }
}

