package typings.mobx

import typings.std.IArguments
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("mobx/lib/utils/decorators", "createPropDecorator")
  @js.native
  def createPropDecorator(propertyInitiallyEnumerable: Boolean, propertyCreator: PropertyCreator): js.Function = js.native
  
  @JSImport("mobx/lib/utils/decorators", "initializeInstance")
  @js.native
  def initializeInstance(target: js.Any): js.Any = js.native
  
  @JSImport("mobx/lib/utils/decorators", "mobxDidRunLazyInitializersSymbol")
  @js.native
  val mobxDidRunLazyInitializersSymbol: js.Symbol = js.native
  
  @JSImport("mobx/lib/utils/decorators", "mobxPendingDecorators")
  @js.native
  val mobxPendingDecorators: js.Symbol = js.native
  
  @JSImport("mobx/lib/utils/decorators", "quacksLikeADecorator")
  @js.native
  def quacksLikeADecorator(args: IArguments): Boolean = js.native
  
  /* Inlined std.PropertyDescriptor & {  initializer :(): any | undefined} */
  @js.native
  trait BabelDescriptor extends StObject {
    
    var configurable: js.UndefOr[Boolean] = js.native
    
    var enumerable: js.UndefOr[Boolean] = js.native
    
    var get: js.UndefOr[js.Function0[_]] = js.native
    
    var initializer: js.UndefOr[js.Function0[_]] = js.native
    
    var set: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.native
    
    var value: js.UndefOr[js.Any] = js.native
    
    var writable: js.UndefOr[Boolean] = js.native
  }
  object BabelDescriptor {
    
    @scala.inline
    def apply(): BabelDescriptor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BabelDescriptor]
    }
    
    @scala.inline
    implicit class BabelDescriptorMutableBuilder[Self <: BabelDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigurableUndefined: Self = StObject.set(x, "configurable", js.undefined)
      
      @scala.inline
      def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumerableUndefined: Self = StObject.set(x, "enumerable", js.undefined)
      
      @scala.inline
      def setGet(value: () => _): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      @scala.inline
      def setInitializer(value: () => _): Self = StObject.set(x, "initializer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
      
      @scala.inline
      def setSet(value: /* v */ js.Any => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
    }
  }
  
  type PropertyCreator = js.Function5[
    /* instance */ js.Any, 
    /* propertyName */ PropertyKey, 
    /* descriptor */ js.UndefOr[BabelDescriptor], 
    /* decoratorTarget */ js.Any, 
    /* decoratorArgs */ js.Array[js.Any], 
    Unit
  ]
}
