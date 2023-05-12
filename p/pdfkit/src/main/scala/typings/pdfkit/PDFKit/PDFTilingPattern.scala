package typings.pdfkit.PDFKit

import org.scalablytyped.runtime.Instantiable5
import typings.pdfkit.PDFKit.Mixins.BoundingBox
import typings.pdfkit.PDFKit.Mixins.TilingPatternColorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFTilingPattern
  extends StObject
     with Instantiable5[
      /* document */ Any, 
      /* bbox */ BoundingBox, 
      /* xStep */ Double, 
      /* yStep */ Double, 
      /* stream */ String, 
      PDFTilingPattern
    ] {
  
  @JSName("apply")
  def apply(stroke: Boolean, patternColor: TilingPatternColorValue): PDFDocument = js.native
  
  def createPattern(): PDFKitReference = js.native
  
  def embed(): Unit = js.native
  
  def embedPatternColorSpaces(): Unit = js.native
  
  def getPatternColorSpaceId(underlyingColorspace: String): String = js.native
}
