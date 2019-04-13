package typings
package pdfmakeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildPdfmakeMod {
  /* Rewritten from type alias, can be one of: 
    - pdfmakeLib.pdfmakeLibStrings.left
    - pdfmakeLib.pdfmakeLibStrings.right
    - pdfmakeLib.pdfmakeLibStrings.justify
    - pdfmakeLib.pdfmakeLibStrings.center
    - java.lang.String
  */
  type Alignment = _Alignment | java.lang.String
  type CreatedPdfParams = js.Function3[
    /* defaultFileName */ js.UndefOr[java.lang.String], 
    /* cb */ js.UndefOr[java.lang.String], 
    /* options */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type Margins = scala.Double | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  type TDocumentHeaderFooterFunction = js.Function2[/* currentPage */ scala.Double, /* pageCount */ scala.Double, js.Any]
  type TFontFamily = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type TableRowFunction = js.Function1[/* row */ scala.Double, scala.Double]
}
