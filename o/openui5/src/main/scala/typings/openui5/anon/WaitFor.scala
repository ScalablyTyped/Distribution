package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WaitFor extends StObject {
  
  /**
    * Components that should be (pre-)loaded before the Component (experimental setting)
    */
  var components: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Libraries that should be (pre-)loaded before the Component (experimental setting)
    */
  var libs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * @since 1.37.0 a `Promise` or and array of `Promise`s for which the Component instantiation should wait
    * (experimental setting)
    */
  var waitFor: js.UndefOr[js.Promise[Any] | js.Array[js.Promise[Any]]] = js.undefined
}
object WaitFor {
  
  inline def apply(): WaitFor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WaitFor]
  }
  
  extension [Self <: WaitFor](x: Self) {
    
    inline def setComponents(value: js.Array[String]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setComponentsVarargs(value: String*): Self = StObject.set(x, "components", js.Array(value*))
    
    inline def setLibs(value: js.Array[String]): Self = StObject.set(x, "libs", value.asInstanceOf[js.Any])
    
    inline def setLibsUndefined: Self = StObject.set(x, "libs", js.undefined)
    
    inline def setLibsVarargs(value: String*): Self = StObject.set(x, "libs", js.Array(value*))
    
    inline def setWaitFor(value: js.Promise[Any] | js.Array[js.Promise[Any]]): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    
    inline def setWaitForUndefined: Self = StObject.set(x, "waitFor", js.undefined)
    
    inline def setWaitForVarargs(value: js.Promise[Any]*): Self = StObject.set(x, "waitFor", js.Array(value*))
  }
}
