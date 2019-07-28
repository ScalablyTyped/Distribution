package typings.pdf2image

import typings.pdf2image.Typeofimported_vm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pdf2imageMod {
  type OutputFormat = (js.Function7[
    /* pageNum */ Double, 
    /* pageIndex */ Double, 
    /* totalPagesProcessed */ Double, 
    /* totalPDFPages */ Double, 
    /* name */ String, 
    /* path */ String, 
    /* vm */ Typeofimported_vm, 
    String
  ]) | String
}
