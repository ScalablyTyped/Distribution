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
  type CreatedPdfBufferParams = js.Function2[
    /* cb */ js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], scala.Unit], 
    /* options */ js.UndefOr[BufferOptions], 
    scala.Unit
  ]
  type CreatedPdfDownloadParams = js.Function3[
    /* defaultFileName */ js.UndefOr[java.lang.String], 
    /* cb */ js.UndefOr[js.Function0[scala.Unit]], 
    /* options */ js.UndefOr[BufferOptions], 
    scala.Unit
  ]
  type CreatedPdfOpenPrintParams = js.Function2[
    /* options */ js.UndefOr[BufferOptions], 
    /* win */ js.UndefOr[stdLib.Window | scala.Null], 
    scala.Unit
  ]
  type Margins = scala.Double | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  type TDocumentHeaderFooterFunction = js.Function3[
    /* currentPage */ scala.Double, 
    /* pageCount */ scala.Double, 
    /* pageSize */ js.UndefOr[pdfmakeLib.Anon_Height], 
    js.Any
  ]
  type TFontFamily = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type TableRowFunction = js.Function1[/* row */ scala.Double, scala.Double]
}
