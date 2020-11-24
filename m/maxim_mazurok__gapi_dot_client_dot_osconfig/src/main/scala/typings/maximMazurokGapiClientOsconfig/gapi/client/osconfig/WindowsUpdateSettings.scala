package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsUpdateSettings extends js.Object {
  
  /** Only apply updates of these windows update classifications. If empty, all updates are applied. */
  var classifications: js.UndefOr[js.Array[String]] = js.native
  
  /** List of KBs to exclude from update. */
  var excludes: js.UndefOr[js.Array[String]] = js.native
  
  /** An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations. */
  var exclusivePatches: js.UndefOr[js.Array[String]] = js.native
}
object WindowsUpdateSettings {
  
  @scala.inline
  def apply(): WindowsUpdateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateSettings]
  }
  
  @scala.inline
  implicit class WindowsUpdateSettingsOps[Self <: WindowsUpdateSettings] (val x: Self) extends AnyVal {
    
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
    def setClassificationsVarargs(value: String*): Self = this.set("classifications", js.Array(value :_*))
    
    @scala.inline
    def setClassifications(value: js.Array[String]): Self = this.set("classifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassifications: Self = this.set("classifications", js.undefined)
    
    @scala.inline
    def setExcludesVarargs(value: String*): Self = this.set("excludes", js.Array(value :_*))
    
    @scala.inline
    def setExcludes(value: js.Array[String]): Self = this.set("excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludes: Self = this.set("excludes", js.undefined)
    
    @scala.inline
    def setExclusivePatchesVarargs(value: String*): Self = this.set("exclusivePatches", js.Array(value :_*))
    
    @scala.inline
    def setExclusivePatches(value: js.Array[String]): Self = this.set("exclusivePatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusivePatches: Self = this.set("exclusivePatches", js.undefined)
  }
}
