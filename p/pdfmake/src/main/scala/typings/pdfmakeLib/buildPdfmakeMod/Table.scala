package typings
package pdfmakeLib.buildPdfmakeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Table extends js.Object {
  var body: js.Array[js.Array[Content]] | js.Array[js.Array[TableCell]]
  var headerRows: js.UndefOr[scala.Double] = js.undefined
  var heights: js.UndefOr[(js.Array[java.lang.String | scala.Double]) | TableRowFunction] = js.undefined
  var layout: js.UndefOr[java.lang.String | TableLayoutFunctions] = js.undefined
  var widths: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.undefined
}

