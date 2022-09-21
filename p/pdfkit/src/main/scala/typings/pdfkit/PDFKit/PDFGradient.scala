package typings.pdfkit.PDFKit

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFGradient
  extends StObject
     with Instantiable1[/* document */ Any, PDFGradient] {
  
  @JSName("apply")
  def apply(): Unit = js.native
  
  def embed(): Unit = js.native
  
  def stop(pos: Double): PDFGradient = js.native
  def stop(pos: Double, color: String): PDFGradient = js.native
  def stop(pos: Double, color: String, opacity: Double): PDFGradient = js.native
  def stop(pos: Double, color: Unit, opacity: Double): PDFGradient = js.native
  def stop(pos: Double, color: PDFGradient): PDFGradient = js.native
  def stop(pos: Double, color: PDFGradient, opacity: Double): PDFGradient = js.native
}
