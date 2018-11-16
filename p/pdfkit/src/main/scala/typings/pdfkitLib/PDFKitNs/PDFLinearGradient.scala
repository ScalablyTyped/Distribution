package typings
package pdfkitLib.PDFKitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFLinearGradient
  extends PDFGradient
     with ScalablyTyped.runtime.Instantiable5[
      /* document */ js.Any, 
      /* x1 */ scala.Double, 
      /* y1 */ scala.Double, 
      /* x2 */ scala.Double, 
      /* y2 */ scala.Double, 
      PDFLinearGradient
    ] {
  def opacityGradient(): PDFLinearGradient = js.native
  def shader(fn: js.Function0[_]): js.Any = js.native
}

