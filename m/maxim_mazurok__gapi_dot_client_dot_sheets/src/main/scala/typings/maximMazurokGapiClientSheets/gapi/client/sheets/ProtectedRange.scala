package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProtectedRange extends js.Object {
  
  /** The description of this protected range. */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The users and groups with edit access to the protected range. This field is only visible to users with edit access to the protected range and the document. Editors are not supported
    * with warning_only protection.
    */
  var editors: js.UndefOr[Editors] = js.native
  
  /** The named range this protected range is backed by, if any. When writing, only one of range or named_range_id may be set. */
  var namedRangeId: js.UndefOr[String] = js.native
  
  /** The ID of the protected range. This field is read-only. */
  var protectedRangeId: js.UndefOr[Double] = js.native
  
  /**
    * The range that is being protected. The range may be fully unbounded, in which case this is considered a protected sheet. When writing, only one of range or named_range_id may be
    * set.
    */
  var range: js.UndefOr[GridRange] = js.native
  
  /** True if the user who requested this protected range can edit the protected area. This field is read-only. */
  var requestingUserCanEdit: js.UndefOr[Boolean] = js.native
  
  /** The list of unprotected ranges within a protected sheet. Unprotected ranges are only supported on protected sheets. */
  var unprotectedRanges: js.UndefOr[js.Array[GridRange]] = js.native
  
  /**
    * True if this protected range will show a warning when editing. Warning-based protection means that every user can edit data in the protected range, except editing will prompt a
    * warning asking the user to confirm the edit. When writing: if this field is true, then editors is ignored. Additionally, if this field is changed from true to false and the
    * `editors` field is not set (nor included in the field mask), then the editors will be set to all the editors in the document.
    */
  var warningOnly: js.UndefOr[Boolean] = js.native
}
object ProtectedRange {
  
  @scala.inline
  def apply(): ProtectedRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProtectedRange]
  }
  
  @scala.inline
  implicit class ProtectedRangeOps[Self <: ProtectedRange] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEditors(value: Editors): Self = this.set("editors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditors: Self = this.set("editors", js.undefined)
    
    @scala.inline
    def setNamedRangeId(value: String): Self = this.set("namedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedRangeId: Self = this.set("namedRangeId", js.undefined)
    
    @scala.inline
    def setProtectedRangeId(value: Double): Self = this.set("protectedRangeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtectedRangeId: Self = this.set("protectedRangeId", js.undefined)
    
    @scala.inline
    def setRange(value: GridRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRequestingUserCanEdit(value: Boolean): Self = this.set("requestingUserCanEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestingUserCanEdit: Self = this.set("requestingUserCanEdit", js.undefined)
    
    @scala.inline
    def setUnprotectedRangesVarargs(value: GridRange*): Self = this.set("unprotectedRanges", js.Array(value :_*))
    
    @scala.inline
    def setUnprotectedRanges(value: js.Array[GridRange]): Self = this.set("unprotectedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnprotectedRanges: Self = this.set("unprotectedRanges", js.undefined)
    
    @scala.inline
    def setWarningOnly(value: Boolean): Self = this.set("warningOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarningOnly: Self = this.set("warningOnly", js.undefined)
  }
}
