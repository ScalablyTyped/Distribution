package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZypperSettings extends StObject {
  
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
  implicit class ZypperSettingsMutableBuilder[Self <: ZypperSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[String]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: String*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    @scala.inline
    def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value :_*))
    
    @scala.inline
    def setExclusivePatches(value: js.Array[String]): Self = StObject.set(x, "exclusivePatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusivePatchesUndefined: Self = StObject.set(x, "exclusivePatches", js.undefined)
    
    @scala.inline
    def setExclusivePatchesVarargs(value: String*): Self = StObject.set(x, "exclusivePatches", js.Array(value :_*))
    
    @scala.inline
    def setSeverities(value: js.Array[String]): Self = StObject.set(x, "severities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeveritiesUndefined: Self = StObject.set(x, "severities", js.undefined)
    
    @scala.inline
    def setSeveritiesVarargs(value: String*): Self = StObject.set(x, "severities", js.Array(value :_*))
    
    @scala.inline
    def setWithOptional(value: Boolean): Self = StObject.set(x, "withOptional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithOptionalUndefined: Self = StObject.set(x, "withOptional", js.undefined)
    
    @scala.inline
    def setWithUpdate(value: Boolean): Self = StObject.set(x, "withUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithUpdateUndefined: Self = StObject.set(x, "withUpdate", js.undefined)
  }
}
