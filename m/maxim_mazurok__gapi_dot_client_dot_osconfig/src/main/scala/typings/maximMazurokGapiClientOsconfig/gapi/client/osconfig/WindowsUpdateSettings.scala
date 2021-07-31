package typings.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsUpdateSettings extends StObject {
  
  /** Only apply updates of these windows update classifications. If empty, all updates are applied. */
  var classifications: js.UndefOr[js.Array[String]] = js.undefined
  
  /** List of KBs to exclude from update. */
  var excludes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** An exclusive list of kbs to be updated. These are the only patches that will be updated. This field must not be used with other patch configurations. */
  var exclusivePatches: js.UndefOr[js.Array[String]] = js.undefined
}
object WindowsUpdateSettings {
  
  @scala.inline
  def apply(): WindowsUpdateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateSettings]
  }
  
  @scala.inline
  implicit class WindowsUpdateSettingsMutableBuilder[Self <: WindowsUpdateSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassifications(value: js.Array[String]): Self = StObject.set(x, "classifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassificationsUndefined: Self = StObject.set(x, "classifications", js.undefined)
    
    @scala.inline
    def setClassificationsVarargs(value: String*): Self = StObject.set(x, "classifications", js.Array(value :_*))
    
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
  }
}
