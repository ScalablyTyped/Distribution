package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slicer extends StObject {
  
  /**
    * The position of the slicer. Note that slicer can be positioned only on existing sheet. Also, width and height of slicer can be automatically adjusted to keep it within permitted
    * limits.
    */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.undefined
  
  /** The ID of the slicer. */
  var slicerId: js.UndefOr[Double] = js.undefined
  
  /** The specification of the slicer. */
  var spec: js.UndefOr[SlicerSpec] = js.undefined
}
object Slicer {
  
  inline def apply(): Slicer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slicer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Slicer] (val x: Self) extends AnyVal {
    
    inline def setPosition(value: EmbeddedObjectPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setSlicerId(value: Double): Self = StObject.set(x, "slicerId", value.asInstanceOf[js.Any])
    
    inline def setSlicerIdUndefined: Self = StObject.set(x, "slicerId", js.undefined)
    
    inline def setSpec(value: SlicerSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
