package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DicomConfig extends js.Object {
  
  /** Tag filtering profile that determines which tags to keep/remove. */
  var filterProfile: js.UndefOr[String] = js.native
  
  /** List of tags to keep. Remove all other tags. */
  var keepList: js.UndefOr[TagFilterList] = js.native
  
  /** List of tags to remove. Keep all other tags. */
  var removeList: js.UndefOr[TagFilterList] = js.native
  
  /**
    * If true, skip replacing StudyInstanceUID, SeriesInstanceUID, SOPInstanceUID, and MediaStorageSOPInstanceUID and leave them untouched. The Cloud Healthcare API regenerates these UIDs
    * by default based on the DICOM Standard's reasoning: "Whilst these UIDs cannot be mapped directly to an individual out of context, given access to the original images, or to a
    * database of the original images containing the UIDs, it would be possible to recover the individual's identity."
    * http://dicom.nema.org/medical/dicom/current/output/chtml/part15/sect_E.3.9.html
    */
  var skipIdRedaction: js.UndefOr[Boolean] = js.native
}
object DicomConfig {
  
  @scala.inline
  def apply(): DicomConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DicomConfig]
  }
  
  @scala.inline
  implicit class DicomConfigOps[Self <: DicomConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilterProfile(value: String): Self = this.set("filterProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterProfile: Self = this.set("filterProfile", js.undefined)
    
    @scala.inline
    def setKeepList(value: TagFilterList): Self = this.set("keepList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepList: Self = this.set("keepList", js.undefined)
    
    @scala.inline
    def setRemoveList(value: TagFilterList): Self = this.set("removeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveList: Self = this.set("removeList", js.undefined)
    
    @scala.inline
    def setSkipIdRedaction(value: Boolean): Self = this.set("skipIdRedaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipIdRedaction: Self = this.set("skipIdRedaction", js.undefined)
  }
}
