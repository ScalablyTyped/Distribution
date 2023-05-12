package typings.photoshop.domImagingModuleMod.imaging

import typings.photoshop.photoshopStrings.user
import typings.photoshop.photoshopStrings.vector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLayerMaskOptions extends StObject {
  
  var documentID: js.UndefOr[Double] = js.undefined
  
  var kind: js.UndefOr[user | vector] = js.undefined
  
  var layerID: Double
  
  var sourceBounds: js.UndefOr[Bounds] = js.undefined
  
  var targetSize: js.UndefOr[Size] = js.undefined
}
object GetLayerMaskOptions {
  
  inline def apply(layerID: Double): GetLayerMaskOptions = {
    val __obj = js.Dynamic.literal(layerID = layerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLayerMaskOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLayerMaskOptions] (val x: Self) extends AnyVal {
    
    inline def setDocumentID(value: Double): Self = StObject.set(x, "documentID", value.asInstanceOf[js.Any])
    
    inline def setDocumentIDUndefined: Self = StObject.set(x, "documentID", js.undefined)
    
    inline def setKind(value: user | vector): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLayerID(value: Double): Self = StObject.set(x, "layerID", value.asInstanceOf[js.Any])
    
    inline def setSourceBounds(value: Bounds): Self = StObject.set(x, "sourceBounds", value.asInstanceOf[js.Any])
    
    inline def setSourceBoundsUndefined: Self = StObject.set(x, "sourceBounds", js.undefined)
    
    inline def setTargetSize(value: Size): Self = StObject.set(x, "targetSize", value.asInstanceOf[js.Any])
    
    inline def setTargetSizeUndefined: Self = StObject.set(x, "targetSize", js.undefined)
  }
}
