package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentConfig extends StObject {
  
  /**
    * Since 1.53, activates autoWait while the application is starting up. This allows more time for application
    * startup and stabilizes tests for slow-loading applications. This parameter is false by default, regardless
    * of the global autoWait value, to prevent issues in existing tests.
    */
  var autoWait: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Will be passed to {@link sap.ui.core.UIComponent UIComponent}, please read the respective documentation.
    */
  var componentConfig: js.Object
  
  /**
    * Sets the hash {@link sap.ui.core.routing.HashChanger#setHash} to the given value. If this parameter is
    * omitted, the hash will always be reset to the empty hash - "".
    */
  var hash: js.UndefOr[String] = js.undefined
  
  /**
    * The timeout for loading the UIComponent in seconds - {@link sap.ui.test.Opa5#waitFor}.
    */
  var timeout: js.UndefOr[Double] = js.undefined
}
object ComponentConfig {
  
  inline def apply(componentConfig: js.Object): ComponentConfig = {
    val __obj = js.Dynamic.literal(componentConfig = componentConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfig]
  }
  
  extension [Self <: ComponentConfig](x: Self) {
    
    inline def setAutoWait(value: Boolean): Self = StObject.set(x, "autoWait", value.asInstanceOf[js.Any])
    
    inline def setAutoWaitUndefined: Self = StObject.set(x, "autoWait", js.undefined)
    
    inline def setComponentConfig(value: js.Object): Self = StObject.set(x, "componentConfig", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
