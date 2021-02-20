package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CropHintsAnnotation extends StObject {
  
  /** Crop hint results. */
  var cropHints: js.UndefOr[js.Array[CropHint]] = js.native
}
object CropHintsAnnotation {
  
  @scala.inline
  def apply(): CropHintsAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropHintsAnnotation]
  }
  
  @scala.inline
  implicit class CropHintsAnnotationMutableBuilder[Self <: CropHintsAnnotation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCropHints(value: js.Array[CropHint]): Self = StObject.set(x, "cropHints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropHintsUndefined: Self = StObject.set(x, "cropHints", js.undefined)
    
    @scala.inline
    def setCropHintsVarargs(value: CropHint*): Self = StObject.set(x, "cropHints", js.Array(value :_*))
  }
}
