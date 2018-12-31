package typings
package pdf2imageLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pdf2imageMod {
  type OutputFormat = (js.Function7[
    /* pageNum */ scala.Double, 
    /* pageIndex */ scala.Double, 
    /* totalPagesProcessed */ scala.Double, 
    /* totalPDFPages */ scala.Double, 
    /* name */ java.lang.String, 
    /* path */ java.lang.String, 
    /* vm */ pdf2imageLib.Anon_RunInContext, 
    java.lang.String
  ]) | java.lang.String
}
