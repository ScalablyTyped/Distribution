package typings.pdfmake

import org.scalablytyped.runtime.StringDictionary
import typings.pdfmake.Anon_Height
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildPdfmakeMod {
  /* Rewritten from type alias, can be one of: 
    - typings.pdfmake.pdfmakeStrings.left
    - typings.pdfmake.pdfmakeStrings.right
    - typings.pdfmake.pdfmakeStrings.justify
    - typings.pdfmake.pdfmakeStrings.center
    - java.lang.String
  */
  type Alignment = _Alignment | String
  type CreatedPdfBufferParams = js.Function2[
    /* cb */ js.Function2[/* result */ js.Any, /* pages */ js.Array[Page], Unit], 
    /* options */ js.UndefOr[BufferOptions], 
    Unit
  ]
  type CreatedPdfDownloadParams = js.Function3[
    /* defaultFileName */ js.UndefOr[String], 
    /* cb */ js.UndefOr[js.Function0[Unit]], 
    /* options */ js.UndefOr[BufferOptions], 
    Unit
  ]
  type CreatedPdfOpenPrintParams = js.Function2[/* options */ js.UndefOr[BufferOptions], /* win */ js.UndefOr[Window | Null], Unit]
  type Margins = Double | (js.Tuple2[Double, Double]) | (js.Tuple4[Double, Double, Double, Double])
  type TDocumentHeaderFooterFunction = js.Function3[
    /* currentPage */ Double, 
    /* pageCount */ Double, 
    /* pageSize */ js.UndefOr[Anon_Height], 
    js.Any
  ]
  type TFontFamily = StringDictionary[String]
  type TableRowFunction = js.Function1[/* row */ Double, Double]
}
