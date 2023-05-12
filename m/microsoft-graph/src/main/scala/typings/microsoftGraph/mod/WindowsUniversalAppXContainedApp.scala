package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowsUniversalAppXContainedApp
  extends StObject
     with Entity {
  
  // The app user model ID of the contained app of a WindowsUniversalAppX app.
  var appUserModelId: js.UndefOr[NullableOption[String]] = js.undefined
}
object WindowsUniversalAppXContainedApp {
  
  inline def apply(): WindowsUniversalAppXContainedApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsUniversalAppXContainedApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowsUniversalAppXContainedApp] (val x: Self) extends AnyVal {
    
    inline def setAppUserModelId(value: NullableOption[String]): Self = StObject.set(x, "appUserModelId", value.asInstanceOf[js.Any])
    
    inline def setAppUserModelIdNull: Self = StObject.set(x, "appUserModelId", null)
    
    inline def setAppUserModelIdUndefined: Self = StObject.set(x, "appUserModelId", js.undefined)
  }
}
