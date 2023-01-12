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
  
  inline def apply(): WindowsUpdateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUpdateSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsUpdateSettings] (val x: Self) extends AnyVal {
    
    inline def setClassifications(value: js.Array[String]): Self = StObject.set(x, "classifications", value.asInstanceOf[js.Any])
    
    inline def setClassificationsUndefined: Self = StObject.set(x, "classifications", js.undefined)
    
    inline def setClassificationsVarargs(value: String*): Self = StObject.set(x, "classifications", js.Array(value*))
    
    inline def setExcludes(value: js.Array[String]): Self = StObject.set(x, "excludes", value.asInstanceOf[js.Any])
    
    inline def setExcludesUndefined: Self = StObject.set(x, "excludes", js.undefined)
    
    inline def setExcludesVarargs(value: String*): Self = StObject.set(x, "excludes", js.Array(value*))
    
    inline def setExclusivePatches(value: js.Array[String]): Self = StObject.set(x, "exclusivePatches", value.asInstanceOf[js.Any])
    
    inline def setExclusivePatchesUndefined: Self = StObject.set(x, "exclusivePatches", js.undefined)
    
    inline def setExclusivePatchesVarargs(value: String*): Self = StObject.set(x, "exclusivePatches", js.Array(value*))
  }
}
