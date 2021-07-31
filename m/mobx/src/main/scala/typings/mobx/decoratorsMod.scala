package typings.mobx

import typings.std.IArguments
import typings.std.PropertyDescriptor
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object decoratorsMod {
  
  @JSImport("mobx/lib/utils/decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createPropDecorator(propertyInitiallyEnumerable: Boolean, propertyCreator: PropertyCreator): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("createPropDecorator")(propertyInitiallyEnumerable.asInstanceOf[js.Any], propertyCreator.asInstanceOf[js.Any])).asInstanceOf[js.Function]
  
  @scala.inline
  def initializeInstance(target: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeInstance")(target.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @JSImport("mobx/lib/utils/decorators", "mobxDidRunLazyInitializersSymbol")
  @js.native
  val mobxDidRunLazyInitializersSymbol: js.Symbol = js.native
  
  @JSImport("mobx/lib/utils/decorators", "mobxPendingDecorators")
  @js.native
  val mobxPendingDecorators: js.Symbol = js.native
  
  @scala.inline
  def quacksLikeADecorator(args: IArguments): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("quacksLikeADecorator")(args.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait BabelDescriptor
    extends StObject
       with PropertyDescriptor {
    
    var initializer: js.UndefOr[js.Function0[js.Any]] = js.undefined
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
      def setInitializer(value: () => js.Any): Self = StObject.set(x, "initializer", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInitializerUndefined: Self = StObject.set(x, "initializer", js.undefined)
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
