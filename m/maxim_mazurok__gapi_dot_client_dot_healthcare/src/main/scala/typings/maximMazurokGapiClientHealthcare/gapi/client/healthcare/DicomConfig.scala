package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DicomConfig extends StObject {
  
  /** Tag filtering profile that determines which tags to keep/remove. */
  var filterProfile: js.UndefOr[String] = js.undefined
  
  /** List of tags to keep. Remove all other tags. */
  var keepList: js.UndefOr[TagFilterList] = js.undefined
  
  /** List of tags to remove. Keep all other tags. */
  var removeList: js.UndefOr[TagFilterList] = js.undefined
  
  /**
    * If true, skip replacing StudyInstanceUID, SeriesInstanceUID, SOPInstanceUID, and MediaStorageSOPInstanceUID and leave them untouched. The Cloud Healthcare API regenerates these UIDs
    * by default based on the DICOM Standard's reasoning: "Whilst these UIDs cannot be mapped directly to an individual out of context, given access to the original images, or to a
    * database of the original images containing the UIDs, it would be possible to recover the individual's identity."
    * http://dicom.nema.org/medical/dicom/current/output/chtml/part15/sect_E.3.9.html
    */
  var skipIdRedaction: js.UndefOr[Boolean] = js.undefined
}
object DicomConfig {
  
  @scala.inline
  def apply(): DicomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DicomConfig]
  }
  
  @scala.inline
  implicit class DicomConfigMutableBuilder[Self <: DicomConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterProfile(value: String): Self = StObject.set(x, "filterProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterProfileUndefined: Self = StObject.set(x, "filterProfile", js.undefined)
    
    @scala.inline
    def setKeepList(value: TagFilterList): Self = StObject.set(x, "keepList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeepListUndefined: Self = StObject.set(x, "keepList", js.undefined)
    
    @scala.inline
    def setRemoveList(value: TagFilterList): Self = StObject.set(x, "removeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveListUndefined: Self = StObject.set(x, "removeList", js.undefined)
    
    @scala.inline
    def setSkipIdRedaction(value: Boolean): Self = StObject.set(x, "skipIdRedaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipIdRedactionUndefined: Self = StObject.set(x, "skipIdRedaction", js.undefined)
  }
}
