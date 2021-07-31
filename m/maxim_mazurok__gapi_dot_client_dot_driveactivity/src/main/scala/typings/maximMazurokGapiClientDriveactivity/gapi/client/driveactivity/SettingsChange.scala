package typings.maximMazurokGapiClientDriveactivity.gapi.client.driveactivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingsChange extends StObject {
  
  /** The set of changes made to restrictions. */
  var restrictionChanges: js.UndefOr[js.Array[RestrictionChange]] = js.undefined
}
object SettingsChange {
  
  @scala.inline
  def apply(): SettingsChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingsChange]
  }
  
  @scala.inline
  implicit class SettingsChangeMutableBuilder[Self <: SettingsChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRestrictionChanges(value: js.Array[RestrictionChange]): Self = StObject.set(x, "restrictionChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionChangesUndefined: Self = StObject.set(x, "restrictionChanges", js.undefined)
    
    @scala.inline
    def setRestrictionChangesVarargs(value: RestrictionChange*): Self = StObject.set(x, "restrictionChanges", js.Array(value :_*))
  }
}
