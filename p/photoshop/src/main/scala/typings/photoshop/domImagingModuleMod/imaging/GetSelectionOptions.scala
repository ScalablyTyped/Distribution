package typings.photoshop.domImagingModuleMod.imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSelectionOptions extends StObject {
  
  var documentID: js.UndefOr[Double] = js.undefined
  
  var sourceBounds: js.UndefOr[Bounds] = js.undefined
  
  var targetSize: js.UndefOr[Size] = js.undefined
}
object GetSelectionOptions {
  
  inline def apply(): GetSelectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSelectionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSelectionOptions] (val x: Self) extends AnyVal {
    
    inline def setDocumentID(value: Double): Self = StObject.set(x, "documentID", value.asInstanceOf[js.Any])
    
    inline def setDocumentIDUndefined: Self = StObject.set(x, "documentID", js.undefined)
    
    inline def setSourceBounds(value: Bounds): Self = StObject.set(x, "sourceBounds", value.asInstanceOf[js.Any])
    
    inline def setSourceBoundsUndefined: Self = StObject.set(x, "sourceBounds", js.undefined)
    
    inline def setTargetSize(value: Size): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
    
    inline def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
  }
}
