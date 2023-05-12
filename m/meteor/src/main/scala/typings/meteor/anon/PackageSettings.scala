package typings.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PackageSettings extends StObject {
  
  var packageSettings: js.UndefOr[Any] = js.undefined
}
object PackageSettings {
  
  inline def apply(): PackageSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PackageSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PackageSettings] (val x: Self) extends AnyVal {
    
    inline def setPackageSettings(value: Any): Self = StObject.set(x, "packageSettings", value.asInstanceOf[js.Any])
    
    inline def setPackageSettingsUndefined: Self = StObject.set(x, "packageSettings", js.undefined)
  }
}
