package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Setting extends StObject {
  
  /** @description The `id` of the GitHub App. */
  var app_id: Double
  
  /**
    * @description Set to `true` to enable automatic creation of CheckSuite events upon pushes to the repository, or `false` to disable them.
    * @default true
    */
  var setting: Boolean
}
object Setting {
  
  inline def apply(app_id: Double, setting: Boolean): Setting = {
    val __obj = js.Dynamic.literal(app_id = app_id.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setting]
  }
  
  extension [Self <: Setting](x: Self) {
    
    inline def setApp_id(value: Double): Self = StObject.set(x, "app_id", value.asInstanceOf[js.Any])
    
    inline def setSetting(value: Boolean): Self = StObject.set(x, "setting", value.asInstanceOf[js.Any])
  }
}
