package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSlicerSpecRequest extends StObject {
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `SlicerSpec` is implied and should not be specified. A single "*"` can be used as short-hand for
    * listing every field.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The id of the slicer to update. */
  var slicerId: js.UndefOr[Double] = js.undefined
  
  /** The specification to apply to the slicer. */
  var spec: js.UndefOr[SlicerSpec] = js.undefined
}
object UpdateSlicerSpecRequest {
  
  @scala.inline
  def apply(): UpdateSlicerSpecRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSlicerSpecRequest]
  }
  
  @scala.inline
  implicit class UpdateSlicerSpecRequestMutableBuilder[Self <: UpdateSlicerSpecRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
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
