package typings.pdfmake.mod

import typings.pdfmake.AnonHorizontalRatio
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
  var startPosition: AnonHorizontalRatio
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
    startPosition: AnonHorizontalRatio,
    style: String | js.Array[String],
    table: Table,
    text: String | (js.Array[Content | String]),
    ul: js.Array[Content]
  ): CurrentNode = {
    val __obj = js.Dynamic.literal(canvas = canvas.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], headlineLevel = headlineLevel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], ol = ol.asInstanceOf[js.Any], pageNumbers = pageNumbers.asInstanceOf[js.Any], pageOrientation = pageOrientation.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], qr = qr.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], ul = ul.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CurrentNode]
  }
}

