package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsChange extends StObject {
  
  /** The set of changes made to restrictions. */
  var restrictionChanges: js.UndefOr[js.Array[RestrictionChange]] = js.undefined
}
object SettingsChange {
  
  inline def apply(): SettingsChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettingsChange] (val x: Self) extends AnyVal {
    
    inline def setRestrictionChanges(value: js.Array[RestrictionChange]): Self = StObject.set(x, "restrictionChanges", value.asInstanceOf[js.Any])
    
    inline def setRestrictionChangesUndefined: Self = StObject.set(x, "restrictionChanges", js.undefined)
    
    inline def setRestrictionChangesVarargs(value: RestrictionChange*): Self = StObject.set(x, "restrictionChanges", js.Array(value*))
  }
}
