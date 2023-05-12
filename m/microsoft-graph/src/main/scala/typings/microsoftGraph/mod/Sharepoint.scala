package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sharepoint
  extends StObject
     with Entity {
  
  var settings: js.UndefOr[NullableOption[SharepointSettings]] = js.undefined
}
object Sharepoint {
  
  inline def apply(): Sharepoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sharepoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Sharepoint] (val x: Self) extends AnyVal {
    
    inline def setSettings(value: NullableOption[SharepointSettings]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsNull: Self = StObject.set(x, "settings", null)
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
