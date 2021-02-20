package typings.mobx.anon

import typings.mobx.coreActionMod.IAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Enumerable extends StObject {
  
  var configurable: Boolean = js.native
  
  var enumerable: Boolean = js.native
  
  def initializer(): js.Function with IAction = js.native
  
  var value: js.UndefOr[scala.Nothing] = js.native
  
  var writable: Boolean = js.native
}
object Enumerable {
  
  @scala.inline
  def apply(
    configurable: Boolean,
    enumerable: Boolean,
    initializer: () => js.Function with IAction,
    writable: Boolean
  ): Enumerable = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], initializer = js.Any.fromFunction0(initializer), writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enumerable]
  }
  
  @scala.inline
  implicit class EnumerableMutableBuilder[Self <: Enumerable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitializer(value: () => js.Function with IAction): Self = StObject.set(x, "initializer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
