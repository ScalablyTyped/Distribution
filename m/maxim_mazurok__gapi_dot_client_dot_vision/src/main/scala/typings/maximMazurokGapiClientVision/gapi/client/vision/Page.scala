package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Page extends StObject {
  
  /** List of blocks of text, images etc on this page. */
  var blocks: js.UndefOr[js.Array[Block]] = js.undefined
  
  /** Confidence of the OCR results on the page. Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** Page height. For PDFs the unit is points. For images (including TIFFs) the unit is pixels. */
  var height: js.UndefOr[Double] = js.undefined
  
  /** Additional information detected on the page. */
  var property: js.UndefOr[TextProperty] = js.undefined
  
  /** Page width. For PDFs the unit is points. For images (including TIFFs) the unit is pixels. */
  var width: js.UndefOr[Double] = js.undefined
}
object Page {
  
  @scala.inline
  def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  
  @scala.inline
  implicit class PageMutableBuilder[Self <: Page] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocks(value: js.Array[Block]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksUndefined: Self = StObject.set(x, "blocks", js.undefined)
    
    @scala.inline
    def setBlocksVarargs(value: Block*): Self = StObject.set(x, "blocks", js.Array(value :_*))
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setProperty(value: TextProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
