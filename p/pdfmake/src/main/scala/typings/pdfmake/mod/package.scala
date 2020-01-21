package typings.pdfmake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /* Rewritten from type alias, can be one of: 
    - typings.pdfmake.pdfmakeStrings.left
    - typings.pdfmake.pdfmakeStrings.right
    - typings.pdfmake.pdfmakeStrings.justify
    - typings.pdfmake.pdfmakeStrings.center
    - java.lang.String
  */
  type Alignment = typings.pdfmake.mod._Alignment | java.lang.String
  type CreatedPdfBufferParams = js.Function2[
    /* cb */ js.Function2[/* result */ js.Any, /* pages */ js.Array[typings.pdfmake.mod.Page], scala.Unit], 
    /* options */ js.UndefOr[typings.pdfmake.mod.BufferOptions], 
    scala.Unit
  ]
  type CreatedPdfDownloadParams = js.Function3[
    /* defaultFileName */ js.UndefOr[java.lang.String], 
    /* cb */ js.UndefOr[js.Function0[scala.Unit]], 
    /* options */ js.UndefOr[typings.pdfmake.mod.BufferOptions], 
    scala.Unit
  ]
  type CreatedPdfOpenPrintParams = js.Function2[
    /* options */ js.UndefOr[typings.pdfmake.mod.BufferOptions], 
    /* win */ js.UndefOr[typings.std.Window_ | scala.Null], 
    scala.Unit
  ]
  type Margins = scala.Double | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  type TDocumentHeaderFooterFunction = js.Function3[
    /* currentPage */ scala.Double, 
    /* pageCount */ scala.Double, 
    /* pageSize */ js.UndefOr[typings.pdfmake.AnonHeight], 
    js.Any
  ]
  type TFontFamily = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type TableRowFunction = js.Function1[/* row */ scala.Double, scala.Double]
}
