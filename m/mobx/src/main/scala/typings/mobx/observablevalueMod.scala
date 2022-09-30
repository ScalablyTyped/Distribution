package typings.mobx

import typings.mobx.comparerMod.IEqualsComparer
import typings.mobx.interceptUtilsMod.IInterceptable
import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.internalMod.Atom
import typings.mobx.listenUtilsMod.IListenable
import typings.mobx.mobxStrings.update
import typings.mobx.mobxStrings.value
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablevalueMod {
  
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
    
    var hasUnreportedChange_ : Boolean = js.native
    
    /* private */ var prepareNewValue_ : Any = js.native
    
    def raw(): Any = js.native
    
    def setNewValue_(newValue: T): Unit = js.native
    
    def toJSON(): T = js.native
    
    @JSName(js.Symbol.toPrimitive)
    var toPrimitive: js.Function0[T] = js.native
    
    var value_ : Any = js.native
  }
  
  inline def isObservableValue(x: Any): /* is mobx.mobx/dist/types/observablevalue.IObservableValue<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableValue")(x.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/dist/types/observablevalue.IObservableValue<any> */ Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.ObjectObservableKind[T]
    - typings.mobx.observablevalueMod.IValueDidChange[T]
  */
  trait IBoxDidChange[T] extends StObject
  object IBoxDidChange {
    
    inline def IValueDidChange[T](debugObjectName: String, newValue: Any, `object`: IObservableValue[T], oldValue: Any): typings.mobx.observablevalueMod.IValueDidChange[T] = {
      val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], observableKind = "value", oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[typings.mobx.observablevalueMod.IValueDidChange[T]]
    }
    
    inline def ObjectObservableKind[T](debugObjectName: String, newValue: Any, `object`: IObservableValue[T]): typings.mobx.anon.ObjectObservableKind[T] = {
      val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], observableKind = "value")
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("create")
      __obj.asInstanceOf[typings.mobx.anon.ObjectObservableKind[T]]
    }
  }
  
  @js.native
  trait IObservableValue[T] extends StObject {
    
    def get(): T = js.native
    
    def intercept_(handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
    
    def observe_(listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
    def observe_(listener: js.Function1[/* change */ IValueDidChange[T], Unit], fireImmediately: Boolean): Lambda = js.native
    
    def set(value: T): Unit = js.native
  }
  
  trait IValueDidChange[T]
    extends StObject
       with IBoxDidChange[T] {
    
    var debugObjectName: String
    
    var newValue: Any
    
    var `object`: IObservableValue[T]
    
    var observableKind: value
    
    var oldValue: Any
    
    var `type`: update
  }
  object IValueDidChange {
    
    inline def apply[T](debugObjectName: String, newValue: Any, `object`: IObservableValue[T], oldValue: Any): IValueDidChange[T] = {
      val __obj = js.Dynamic.literal(debugObjectName = debugObjectName.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], observableKind = "value", oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[IValueDidChange[T]]
    }
    
    extension [Self <: IValueDidChange[?], T](x: Self & IValueDidChange[T]) {
      
      inline def setDebugObjectName(value: String): Self = StObject.set(x, "debugObjectName", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setObject(value: IObservableValue[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setObservableKind(value: value): Self = StObject.set(x, "observableKind", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
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
    
    extension [Self <: IValueWillChange[?], T](x: Self & IValueWillChange[T]) {
      
      inline def setNewValue(value: T): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setObject(value: IObservableValue[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setType(value: update): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
