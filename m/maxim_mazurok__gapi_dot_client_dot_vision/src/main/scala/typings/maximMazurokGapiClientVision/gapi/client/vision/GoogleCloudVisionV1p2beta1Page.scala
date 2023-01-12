package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p2beta1Page extends StObject {
  
  /** List of blocks of text, images etc on this page. */
  var blocks: js.UndefOr[js.Array[GoogleCloudVisionV1p2beta1Block]] = js.undefined
  
  /** Confidence of the OCR results on the page. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Page height. For PDFs the unit is points. For images (including TIFFs) the unit is pixels. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** Additional information detected on the page. */
  var property: js.UndefOr[GoogleCloudVisionV1p2beta1TextAnnotationTextProperty] = js.undefined
  
  /** Page width. For PDFs the unit is points. For images (including TIFFs) the unit is pixels. */
  var width: js.UndefOr[Double] = js.undefined
}
object GoogleCloudVisionV1p2beta1Page {
  
  inline def apply(): GoogleCloudVisionV1p2beta1Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p2beta1Page]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudVisionV1p2beta1Page] (val x: Self) extends AnyVal {
    
    inline def setBlocks(value: js.Array[GoogleCloudVisionV1p2beta1Block]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
    
    inline def setBlocksVarargs(value: GoogleCloudVisionV1p2beta1Block*): Self = StObject.set(x, "blocks", js.Array(value*))
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setProperty(value: GoogleCloudVisionV1p2beta1TextAnnotationTextProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
