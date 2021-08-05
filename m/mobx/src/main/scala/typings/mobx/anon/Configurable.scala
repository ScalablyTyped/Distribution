package typings.mobx.anon

import typings.mobx.coreActionMod.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Configurable extends StObject {
  
  var configurable: Boolean
  
  var enumerable: Boolean
  
  var value: js.Function & IAction
  
  var writable: Boolean
}
object Configurable {
  
  inline def apply(configurable: Boolean, enumerable: Boolean, value: js.Function & IAction, writable: Boolean): Configurable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configurable]
  }
  
  extension [Self <: Configurable](x: Self) {
    
    inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Function & IAction): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
