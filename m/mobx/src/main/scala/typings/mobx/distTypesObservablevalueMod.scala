package typings.mobx

import typings.mobx.distInternalMod.Atom
import typings.mobx.distTypesInterceptUtilsMod.IInterceptable
import typings.mobx.distTypesInterceptUtilsMod.IInterceptor
import typings.mobx.distTypesListenUtilsMod.IListenable
import typings.mobx.distTypesModifiersMod.IEnhancer
import typings.mobx.distUtilsComparerMod.IEqualsComparer
import typings.mobx.distUtilsUtilsMod.Lambda
import typings.mobx.mobxStrings.update
import typings.mobx.mobxStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesObservablevalueMod {
  
  @JSImport("mobx/dist/types/observablevalue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/types/observablevalue", "ObservableValue")
  @js.native
  open class ObservableValue[T] protected ()
    extends Atom
       with IObservableValue[T]
       with IInterceptable[IValueWillChange[T]]
       with IListenable {
    def this(value: T, enhancer: IEnhancer[T]) = this()
    def this(value: T, enhancer: IEnhancer[T], name_ : String) = this()
    def this(value: T, enhancer: IEnhancer[T], name_ : String, notifySpy: Boolean) = this()
    def this(value: T, enhancer: IEnhancer[T], name_ : Unit, notifySpy: Boolean) = this()
    def this(value: T, enhancer: IEnhancer[T], name_ : String, notifySpy: Boolean, equals: IEqualsComparer[Any]) = this()
    def this(value: T, enhancer: IEnhancer[T], name_ : String, notifySpy: Unit, equals: IEqualsComparer[Any]) = this()
    def this(value: T, enhancer: IEnhancer[T], name_ : Unit, notifySpy: Boolean, equals: IEqualsComparer[Any]) = this()
    def this(value: T, enhancer: IEnhancer[T], name_ : Unit, notifySpy: Unit, equals: IEqualsComparer[Any]) = this()
    
    /* private */ var dehanceValue: Any = js.native
    
    var dehancer: Any = js.native
    
    def enhancer(newValue: T, oldValue: T, name: String): T = js.native
    def enhancer(newValue: T, oldValue: Unit, name: String): T = js.native
    @JSName("enhancer")
    var enhancer_Original: IEnhancer[T] = js.native
    
    /* private */ @JSName("equals")
    var equals_FObservableValue: Any = js.native
    
    /* CompleteClass */
    override def get(): T = js.native
    
    var hasUnreportedChange_ : Boolean = js.native
    
    def intercept_(handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
    
    def observe_(listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
    def observe_(listener: js.Function1[/* change */ IValueDidChange[T], Unit], fireImmediately: Boolean): Lambda = js.native
    
    /* private */ var prepareNewValue_ : Any = js.native
    
    def raw(): Any = js.native
    
    /* CompleteClass */
    override def set(value: T): Unit = js.native
    
    def setNewValue_(newValue: T): Unit = js.native
    
    def toJSON(): T = js.native
    
    @JSName(js.Symbol.toPrimitive)
    var toPrimitive: js.Function0[T] = js.native
    
    var value_ : Any = js.native
  }
  
  inline def isObservableValue(x: Any): /* is mobx.mobx/dist/types/observablevalue.IObservableValue<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableValue")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/dist/types/observablevalue.IObservableValue<any> */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.ObjectObservableKind[T]
    - typings.mobx.distTypesObservablevalueMod.IValueDidChange[T]
  */
  trait IBoxDidChange[T] extends StObject
  object IBoxDidChange {
    
    inline def IValueDidChange[T](debugObjectName: String, newValue: T, `object`: IObservableValue[T]): typings.mobx.distTypesObservablevalueMod.IValueDidChange[T] = {
      val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], observableKind = "value")
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[typings.mobx.distTypesObservablevalueMod.IValueDidChange[T]]
    }
    
    inline def ObjectObservableKind[T](debugObjectName: String, newValue: T, `object`: IObservableValue[T]): typings.mobx.anon.ObjectObservableKind[T] = {
      val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], observableKind = "value")
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("create")
      __obj.asInstanceOf[typings.mobx.anon.ObjectObservableKind[T]]
    }
  }
  
  trait IObservableValue[T] extends StObject {
    
    def get(): T
    
    def set(value: T): Unit
  }
  object IObservableValue {
    
    inline def apply[T](get: () => T, set: T => Unit): IObservableValue[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[IObservableValue[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IObservableValue[?], T] (val x: Self & IObservableValue[T]) extends AnyVal {
      
      inline def setGet(value: () => T): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  trait IValueDidChange[T]
    extends StObject
       with IBoxDidChange[T] {
    
    var debugObjectName: String
    
    var newValue: T
    
    var `object`: IObservableValue[T]
    
    var observableKind: value
    
    var oldValue: js.UndefOr[T] = js.undefined
    
    var `type`: update
  }
  object IValueDidChange {
    
    inline def apply[T](debugObjectName: String, newValue: T, `object`: IObservableValue[T]): IValueDidChange[T] = {
      val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], observableKind = "value")
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[IValueDidChange[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IValueDidChange[?], T] (val x: Self & IValueDidChange[T]) extends AnyVal {
      
      inline def setDebugObjectName(value: String): Self = StObject.set(x, "debugObjectName", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setObject(value: IObservableValue[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObservableKind(value: value): Self = StObject.set(x, "observableKind", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IValueWillChange[T] extends StObject {
    
    var newValue: T
    
    var `object`: IObservableValue[T]
    
    var `type`: update
  }
  object IValueWillChange {
    
    inline def apply[T](newValue: T, `object`: IObservableValue[T]): IValueWillChange[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[IValueWillChange[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IValueWillChange[?], T] (val x: Self & IValueWillChange[T]) extends AnyVal {
      
      inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setObject(value: IObservableValue[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
