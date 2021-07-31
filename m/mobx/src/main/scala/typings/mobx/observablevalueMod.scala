package typings.mobx

import typings.mobx.comparerMod.IEqualsComparer
import typings.mobx.interceptUtilsMod.IInterceptable
import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.internalMod.Atom
import typings.mobx.listenUtilsMod.IListenable
import typings.mobx.mobxStrings.update
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablevalueMod {
  
  @JSImport("mobx/lib/types/observablevalue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/lib/types/observablevalue", "ObservableValue")
  @js.native
  class ObservableValue[T] protected ()
    extends Atom
       with IObservableValue[T]
       with IInterceptable[IValueWillChange[T]]
       with IListenable {
    def this(value: T, enhancer: IEnhancer[T]) = this()
    def this(value: T, enhancer: IEnhancer[T], name: String) = this()
    def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Boolean) = this()
    def this(value: T, enhancer: IEnhancer[T], name: Unit, notifySpy: Boolean) = this()
    def this(
      value: T,
      enhancer: IEnhancer[T],
      name: String,
      notifySpy: Boolean,
      equals: IEqualsComparer[js.Any]
    ) = this()
    def this(value: T, enhancer: IEnhancer[T], name: String, notifySpy: Unit, equals: IEqualsComparer[js.Any]) = this()
    def this(value: T, enhancer: IEnhancer[T], name: Unit, notifySpy: Boolean, equals: IEqualsComparer[js.Any]) = this()
    def this(value: T, enhancer: IEnhancer[T], name: Unit, notifySpy: Unit, equals: IEqualsComparer[js.Any]) = this()
    
    var dehanceValue: js.Any = js.native
    
    var dehancer: js.Any = js.native
    
    def enhancer(newValue: T, oldValue: T, name: String): T = js.native
    def enhancer(newValue: T, oldValue: Unit, name: String): T = js.native
    @JSName("enhancer")
    var enhancer_Original: IEnhancer[T] = js.native
    
    @JSName("equals")
    var equals_FObservableValue: js.Any = js.native
    
    var hasUnreportedChange: Boolean = js.native
    
    /* InferMemberOverrides */
    override def intercept(handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
    
    var prepareNewValue: js.Any = js.native
    
    def setNewValue(newValue: T): Unit = js.native
    
    def toJSON(): T = js.native
    
    @JSName(js.Symbol.toPrimitive)
    var toPrimitive: js.Function0[T] = js.native
    
    var value: js.Any = js.native
  }
  
  @scala.inline
  def isObservableValue(x: js.Any): /* is mobx.mobx/lib/types/observablevalue.IObservableValue<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableValue")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observablevalue.IObservableValue<any> */ Boolean]
  
  @js.native
  trait IObservableValue[T] extends StObject {
    
    def get(): T = js.native
    
    def intercept(handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
    
    def observe(listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
    def observe(listener: js.Function1[/* change */ IValueDidChange[T], Unit], fireImmediately: Boolean): Lambda = js.native
    
    def set(value: T): Unit = js.native
  }
  
  trait IValueDidChange[T]
    extends StObject
       with IValueWillChange[T] {
    
    var oldValue: js.UndefOr[T] = js.undefined
  }
  object IValueDidChange {
    
    @scala.inline
    def apply[T](newValue: T, `object`: js.Any): IValueDidChange[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[IValueDidChange[T]]
    }
    
    @scala.inline
    implicit class IValueDidChangeMutableBuilder[Self <: IValueDidChange[?], T] (val x: Self & IValueDidChange[T]) extends AnyVal {
      
      @scala.inline
      def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    }
  }
  
  trait IValueWillChange[T] extends StObject {
    
    var newValue: T
    
    var `object`: js.Any
    
    var `type`: update
  }
  object IValueWillChange {
    
    @scala.inline
    def apply[T](newValue: T, `object`: js.Any): IValueWillChange[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[IValueWillChange[T]]
    }
    
    @scala.inline
    implicit class IValueWillChangeMutableBuilder[Self <: IValueWillChange[?], T] (val x: Self & IValueWillChange[T]) extends AnyVal {
      
      @scala.inline
      def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObject(value: js.Any): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
