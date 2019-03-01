package typings
package pdfmakeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildPdfmakeMod {
  type Alignment = _Alignment | java.lang.String
  type CreatedPdfParams = js.Function3[
    /* defaultFileName */ js.UndefOr[java.lang.String], 
    /* cb */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type Margins = scala.Double | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  type TDocumentHeaderFooterFunction = js.Function2[/* currentPage */ scala.Double, /* pageCount */ scala.Double, js.Any]
  type TableRowFunction = js.Function1[/* row */ scala.Double, scala.Double]
}
