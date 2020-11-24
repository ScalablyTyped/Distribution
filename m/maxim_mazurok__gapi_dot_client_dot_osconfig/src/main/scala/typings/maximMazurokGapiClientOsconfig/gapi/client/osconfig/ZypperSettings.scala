package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZypperSettings extends js.Object {
  
  /** Install only patches with these categories. Common categories include security, recommended, and feature. */
  var categories: js.UndefOr[js.Array[String]] = js.native
  
  /** List of patches to exclude from update. */
  var excludes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An exclusive list of patches to be updated. These are the only patches that will be installed using 'zypper patch patch:' command. This field must not be used with any other patch
    * configuration fields.
    */
  var exclusivePatches: js.UndefOr[js.Array[String]] = js.native
  
  /** Install only patches with these severities. Common severities include critical, important, moderate, and low. */
  var severities: js.UndefOr[js.Array[String]] = js.native
  
  /** Adds the `--with-optional` flag to `zypper patch`. */
  var withOptional: js.UndefOr[Boolean] = js.native
  
  /** Adds the `--with-update` flag, to `zypper patch`. */
  var withUpdate: js.UndefOr[Boolean] = js.native
}
object ZypperSettings {
  
  @scala.inline
  def apply(): ZypperSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZypperSettings]
  }
  
  @scala.inline
  implicit class ZypperSettingsOps[Self <: ZypperSettings] (val x: Self) extends AnyVal {
    
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
    def setCategoriesVarargs(value: String*): Self = this.set("categories", js.Array(value :_*))
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = this.set("categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    
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
    
    @scala.inline
    def setSeveritiesVarargs(value: String*): Self = this.set("severities", js.Array(value :_*))
    
    @scala.inline
    def setSeverities(value: js.Array[String]): Self = this.set("severities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeverities: Self = this.set("severities", js.undefined)
    
    @scala.inline
    def setWithOptional(value: Boolean): Self = this.set("withOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithOptional: Self = this.set("withOptional", js.undefined)
    
    @scala.inline
    def setWithUpdate(value: Boolean): Self = this.set("withUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithUpdate: Self = this.set("withUpdate", js.undefined)
  }
}
