package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotateFileRequest extends StObject {
  
  /** Required. Requested features. */
  var features: js.UndefOr[js.Array[Feature]] = js.undefined
  
  /** Additional context that may accompany the image(s) in the file. */
  var imageContext: js.UndefOr[ImageContext] = js.undefined
  
  /** Required. Information about the input file. */
  var inputConfig: js.UndefOr[InputConfig] = js.undefined
  
  /**
    * Pages of the file to perform image annotation. Pages starts from 1, we assume the first page of the file is page 1. At most 5 pages are supported per request. Pages can be negative.
    * Page 1 means the first page. Page 2 means the second page. Page -1 means the last page. Page -2 means the second to the last page. If the file is GIF instead of PDF or TIFF, page
    * refers to GIF frames. If this field is empty, by default the service performs image annotation for the first 5 pages of the file.
    */
  var pages: js.UndefOr[js.Array[Double]] = js.undefined
}
object AnnotateFileRequest {
  
  inline def apply(): AnnotateFileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnnotateFileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnnotateFileRequest] (val x: Self) extends AnyVal {
    
    inline def setFeatures(value: js.Array[Feature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setImageContext(value: ImageContext): Self = StObject.set(x, "imageContext", value.asInstanceOf[js.Any])
    
    inline def setImageContextUndefined: Self = StObject.set(x, "imageContext", js.undefined)
    
    inline def setInputConfig(value: InputConfig): Self = StObject.set(x, "inputConfig", value.asInstanceOf[js.Any])
    
    inline def setInputConfigUndefined: Self = StObject.set(x, "inputConfig", js.undefined)
    
    inline def setPages(value: js.Array[Double]): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setPagesVarargs(value: Double*): Self = StObject.set(x, "pages", js.Array(value*))
  }
}
