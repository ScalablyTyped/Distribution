package typings.mobx.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set extends StObject {
  
  var configurable: Boolean = js.native
  
  var enumerable: Boolean = js.native
  
  def get(): js.UndefOr[scala.Nothing] = js.native
  
  def set(v: js.Any): Unit = js.native
}
object Set {
  
  @scala.inline
  def apply(
    configurable: Boolean,
    enumerable: Boolean,
    get: () => js.UndefOr[scala.Nothing],
    set: js.Any => Unit
  ): Set = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Set]
  }
  
  @scala.inline
  implicit class SetMutableBuilder[Self <: Set] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: () => js.UndefOr[scala.Nothing]): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: js.Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
