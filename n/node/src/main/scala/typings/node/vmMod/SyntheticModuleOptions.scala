package typings.node.vmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyntheticModuleOptions extends StObject {
  
  /**
    * The contextified object as returned by the `vm.createContext()` method, to compile and evaluate this module in.
    */
  var context: js.UndefOr[Context] = js.undefined
  
  /**
    * String used in stack traces.
    * @default 'vm:module(i)' where i is a context-specific ascending index.
    */
  var identifier: js.UndefOr[String] = js.undefined
}
object SyntheticModuleOptions {
  
  inline def apply(): SyntheticModuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntheticModuleOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyntheticModuleOptions] (val x: Self) extends AnyVal {
    
    inline def setContext(value: Context): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
  }
}
