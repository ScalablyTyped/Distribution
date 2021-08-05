package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Word extends StObject {
  
  /**
    * The bounding box for the word. The vertices are in the order of top-left, top-right, bottom-right, bottom-left. When a rotation of the bounding box is detected the rotation is
    * represented as around the top-left corner as defined when the text is read in the 'natural' orientation. For example: * when the text is horizontal it might look like: 0----1 | |
    * 3----2 * when it's rotated 180 degrees around the top-left corner it becomes: 2----3 | | 1----0 and the vertex order will still be (0, 1, 2, 3).
    */
  var boundingBox: js.UndefOr[BoundingPoly] = js.undefined
  
  /** Confidence of the OCR results for the word. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Additional information detected for the word. */
  var property: js.UndefOr[TextProperty] = js.undefined
  
  /** List of symbols in the word. The order of the symbols follows the natural reading order. */
  // tslint:disable-next-line:ban-types
  var symbols: js.UndefOr[js.Array[Symbol]] = js.undefined
}
object Word {
  
  inline def apply(): Word = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Word]
  }
  
  extension [Self <: Word](x: Self) {
    
    inline def setBoundingBox(value: BoundingPoly): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setBoundingBoxUndefined: Self = StObject.set(x, "boundingBox", js.undefined)
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setProperty(value: TextProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setSymbols(value: js.Array[Symbol]): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
    
    inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    
    inline def setSymbolsVarargs(value: Symbol*): Self = StObject.set(x, "symbols", js.Array(value :_*))
  }
}
