package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentNode extends js.Object {
  var canvas: java.lang.String
  var columns: js.Array[Content]
  var headlineLevel: java.lang.String
  var id: java.lang.String
  var image: java.lang.String
  var ol: js.Array[Content]
  var pageNumbers: js.Array[scala.Double]
  var pageOrientation: PageOrientation
  var pages: scala.Double
  var qr: java.lang.String
  var stack: scala.Boolean
  var startPosition: pdfmakeLib.Anon_HorizontalRatio
  var style: java.lang.String | js.Array[java.lang.String]
  var table: Table
  var text: java.lang.String | (js.Array[Content | java.lang.String])
  var ul: js.Array[Content]
}

object CurrentNode {
  @scala.inline
  def apply(
    canvas: java.lang.String,
    columns: js.Array[Content],
    headlineLevel: java.lang.String,
    id: java.lang.String,
    image: java.lang.String,
    ol: js.Array[Content],
    pageNumbers: js.Array[scala.Double],
    pageOrientation: PageOrientation,
    pages: scala.Double,
    qr: java.lang.String,
    stack: scala.Boolean,
    startPosition: pdfmakeLib.Anon_HorizontalRatio,
    style: java.lang.String | js.Array[java.lang.String],
    table: Table,
    text: java.lang.String | (js.Array[Content | java.lang.String]),
    ul: js.Array[Content]
  ): CurrentNode = {
    val __obj = js.Dynamic.literal(canvas = canvas, columns = columns, headlineLevel = headlineLevel, id = id, image = image, ol = ol, pageNumbers = pageNumbers, pageOrientation = pageOrientation, pages = pages, qr = qr, stack = stack, startPosition = startPosition, style = style.asInstanceOf[js.Any], table = table, text = text.asInstanceOf[js.Any], ul = ul)
  
    __obj.asInstanceOf[CurrentNode]
  }
}

