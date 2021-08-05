package typings.mobx.anon

import typings.mobx.coreActionMod.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enumerable extends StObject {
  
  var configurable: Boolean
  
  var enumerable: Boolean
  
  def initializer(): js.Function & IAction
  
  var value: Unit
  
  var writable: Boolean
}
object Enumerable {
  
  inline def apply(
    configurable: Boolean,
    enumerable: Boolean,
    initializer: () => js.Function & IAction,
    value: Unit,
    writable: Boolean
  ): Enumerable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], initializer = js.Any.fromFunction0(initializer), value = value.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enumerable]
  }
  
  extension [Self <: Enumerable](x: Self) {
    
    inline def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    inline def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    inline def setInitializer(value: () => js.Function & IAction): Self = StObject.set(x, "initializer", js.Any.fromFunction0(value))
    
    inline def setValue(value: Unit): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
