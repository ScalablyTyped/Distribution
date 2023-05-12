package typings.photoshop.domImagingModuleMod.imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSelectionOptions extends StObject {
  
  var commandName: js.UndefOr[String] = js.undefined
  
  var documentID: js.UndefOr[Double] = js.undefined
  
  var imageData: PhotoshopImageData
  
  var replace: js.UndefOr[Boolean] = js.undefined
  
  var targetBounds: js.UndefOr[BoundsSize | Bounds] = js.undefined
}
object PutSelectionOptions {
  
  inline def apply(imageData: PhotoshopImageData): PutSelectionOptions = {
    val __obj = js.Dynamic.literal(imageData = imageData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSelectionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSelectionOptions] (val x: Self) extends AnyVal {
    
    inline def setCommandName(value: String): Self = StObject.set(x, "commandName", value.asInstanceOf[js.Any])
    
    inline def setCommandNameUndefined: Self = StObject.set(x, "commandName", js.undefined)
    
    inline def setDocumentID(value: Double): Self = StObject.set(x, "documentID", value.asInstanceOf[js.Any])
    
    inline def setDocumentIDUndefined: Self = StObject.set(x, "documentID", js.undefined)
    
    inline def setImageData(value: PhotoshopImageData): Self = StObject.set(x, "imageData", value.asInstanceOf[js.Any])
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setTargetBounds(value: BoundsSize | Bounds): Self = StObject.set(x, "targetBounds", value.asInstanceOf[js.Any])
    
    inline def setTargetBoundsUndefined: Self = StObject.set(x, "targetBounds", js.undefined)
  }
}
