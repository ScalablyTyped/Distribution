package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeveloperMode extends StObject {
  
  /**
    * Whether RTA is started in developerMode mode. Default: `false`
    */
  var developerMode: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Layer in which RTA should be started. Default: "CUSTOMER"
    */
  var layer: js.UndefOr[String] = js.undefined
}
object DeveloperMode {
  
  inline def apply(): DeveloperMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeveloperMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeveloperMode] (val x: Self) extends AnyVal {
    
    inline def setDeveloperMode(value: Boolean): Self = StObject.set(x, "developerMode", value.asInstanceOf[js.Any])
    
    inline def setDeveloperModeUndefined: Self = StObject.set(x, "developerMode", js.undefined)
    
    inline def setLayer(value: String): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
  }
}
