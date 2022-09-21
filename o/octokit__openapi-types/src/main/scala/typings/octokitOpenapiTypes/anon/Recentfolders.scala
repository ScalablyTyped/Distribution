package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Recentfolders extends StObject {
  
  /** @description Display name for this codespace */
  var display_name: js.UndefOr[String] = js.undefined
  
  /** @description A valid machine to transition this codespace to. */
  var machine: js.UndefOr[String] = js.undefined
  
  /** @description Recently opened folders inside the codespace. It is currently used by the clients to determine the folder path to load the codespace in. */
  var recent_folders: js.UndefOr[js.Array[String]] = js.undefined
}
object Recentfolders {
  
  inline def apply(): Recentfolders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Recentfolders]
  }
  
  extension [Self <: Recentfolders](x: Self) {
    
    inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
    
    inline def setDisplay_nameUndefined: Self = StObject.set(x, "display_name", js.undefined)
    
    inline def setMachine(value: String): Self = StObject.set(x, "machine", value.asInstanceOf[js.Any])
    
    inline def setMachineUndefined: Self = StObject.set(x, "machine", js.undefined)
    
    inline def setRecent_folders(value: js.Array[String]): Self = StObject.set(x, "recent_folders", value.asInstanceOf[js.Any])
    
    inline def setRecent_foldersUndefined: Self = StObject.set(x, "recent_folders", js.undefined)
    
    inline def setRecent_foldersVarargs(value: String*): Self = StObject.set(x, "recent_folders", js.Array(value*))
  }
}
