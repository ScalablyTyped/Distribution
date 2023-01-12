package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Init extends StObject {
  
  /**
    * Called on Fragment instantiation with the settings map as argument. Function needs to return a promise
    * which resolves with sap.ui.core.Control|sap.ui.core.Control[]
    */
  var init: js.Function
  
  /**
    * Called to load the fragment content. Must return a Promise which resolves with the loaded resource. This
    * resource is passed as 'fragmentContent' to the init() function via a parameter object.
    */
  var load: js.Function
}
object Init {
  
  inline def apply(init: js.Function, load: js.Function): Init = {
    val __obj = js.Dynamic.literal(init = init.asInstanceOf[js.Any], load = load.asInstanceOf[js.Any])
    __obj.asInstanceOf[Init]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Init] (val x: Self) extends AnyVal {
    
    inline def setInit(value: js.Function): Self = StObject.set(x, "init", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: js.Function): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
  }
}
