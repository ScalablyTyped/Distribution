package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Slicer extends StObject {
  
  /**
    * The position of the slicer. Note that slicer can be positioned only on existing sheet. Also, width and height of slicer can be automatically adjusted to keep it within permitted
    * limits.
    */
  var position: js.UndefOr[EmbeddedObjectPosition] = js.native
  
  /** The ID of the slicer. */
  var slicerId: js.UndefOr[Double] = js.native
  
  /** The specification of the slicer. */
  var spec: js.UndefOr[SlicerSpec] = js.native
}
object Slicer {
  
  @scala.inline
  def apply(): Slicer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slicer]
  }
  
  @scala.inline
  implicit class SlicerMutableBuilder[Self <: Slicer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(value: EmbeddedObjectPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSlicerId(value: Double): Self = StObject.set(x, "slicerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicerIdUndefined: Self = StObject.set(x, "slicerId", js.undefined)
    
    @scala.inline
    def setSpec(value: SlicerSpec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "spec", js.undefined)
  }
}
