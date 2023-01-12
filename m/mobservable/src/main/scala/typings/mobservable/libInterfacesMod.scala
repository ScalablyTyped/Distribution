package typings.mobservable

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInterfacesMod {
  
  trait IArrayChange[T] extends StObject {
    
    var index: Double
    
    var `object`: IObservableArray[T]
    
    var oldValue: T
    
    var `type`: String
  }
  object IArrayChange {
    
    inline def apply[T](index: Double, `object`: IObservableArray[T], oldValue: T, `type`: String): IArrayChange[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IArrayChange[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IArrayChange[?], T] (val x: Self & IArrayChange[T]) extends AnyVal {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setObject(value: IObservableArray[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IArraySplice[T] extends StObject {
    
    var addedCount: Double
    
    var index: Double
    
    var `object`: IObservableArray[T]
    
    var removed: js.Array[T]
    
    var `type`: String
  }
  object IArraySplice {
    
    inline def apply[T](
      addedCount: Double,
      index: Double,
      `object`: IObservableArray[T],
      removed: js.Array[T],
      `type`: String
    ): IArraySplice[T] = {
      val __obj = js.Dynamic.literal(addedCount = addedCount.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IArraySplice[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IArraySplice[?], T] (val x: Self & IArraySplice[T]) extends AnyVal {
      
      inline def setAddedCount(value: Double): Self = StObject.set(x, "addedCount", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setObject(value: IObservableArray[T]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setRemoved(value: js.Array[T]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRemovedVarargs(value: T*): Self = StObject.set(x, "removed", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type IContextInfo = IContextInfoStruct | String
  
  trait IContextInfoStruct extends StObject {
    
    var name: String
    
    var `object`: js.Object
  }
  object IContextInfoStruct {
    
    inline def apply(name: String, `object`: js.Object): IContextInfoStruct = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextInfoStruct]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IContextInfoStruct] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObject(value: js.Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDependencyTree extends StObject {
    
    var context: Any
    
    var dependencies: js.UndefOr[js.Array[IDependencyTree]] = js.undefined
    
    var id: Double
    
    var name: String
  }
  object IDependencyTree {
    
    inline def apply(context: Any, id: Double, name: String): IDependencyTree = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDependencyTree]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDependencyTree] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDependencies(value: js.Array[IDependencyTree]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: IDependencyTree*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IObjectChange[T, R] extends StObject {
    
    var name: String
    
    var `object`: R
    
    var oldValue: js.UndefOr[T] = js.undefined
    
    var `type`: String
  }
  object IObjectChange {
    
    inline def apply[T, R](name: String, `object`: R, `type`: String): IObjectChange[T, R] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObjectChange[T, R]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IObjectChange[?, ?], T, R] (val x: Self & (IObjectChange[T, R])) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObject(value: R): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: T): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IObservable extends StObject {
    
    def observe(callback: js.Function1[/* repeated */ Any, Unit]): Lambda = js.native
    def observe(callback: js.Function1[/* repeated */ Any, Unit], fireImmediately: Boolean): Lambda = js.native
  }
  
  @js.native
  trait IObservableArray[T]
    extends StObject
       with IObservable
       with Array[T] {
    
    def clear(): js.Array[T] = js.native
    
    def find(
      predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ IObservableArray[T], Boolean],
      thisArg: Any,
      fromIndex: Double
    ): T = js.native
    def find(
      predicate: js.Function3[/* item */ T, /* index */ Double, /* array */ IObservableArray[T], Boolean],
      thisArg: Unit,
      fromIndex: Double
    ): T = js.native
    
    def peek(): js.Array[T] = js.native
    
    def remove(value: T): Boolean = js.native
    
    def replace(newItems: js.Array[T]): js.Array[T] = js.native
    
    def spliceWithArray(index: Double): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Double): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Double, newItems: js.Array[T]): js.Array[T] = js.native
    def spliceWithArray(index: Double, deleteCount: Unit, newItems: js.Array[T]): js.Array[T] = js.native
  }
  
  @js.native
  trait IObservableValue[T]
    extends StObject
       with IObservable {
    
    def apply(): T = js.native
    def apply(value: T): Unit = js.native
    
    def observe(callback: js.Function2[/* newValue */ T, /* oldValue */ T, Unit]): Lambda = js.native
    def observe(callback: js.Function2[/* newValue */ T, /* oldValue */ T, Unit], fireImmediately: Boolean): Lambda = js.native
  }
  
  trait IObserverTree extends StObject {
    
    var context: Any
    
    var id: Double
    
    var listeners: js.UndefOr[Double] = js.undefined
    
    var name: String
    
    var observers: js.UndefOr[js.Array[IObserverTree]] = js.undefined
  }
  object IObserverTree {
    
    inline def apply(context: Any, id: Double, name: String): IObserverTree = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IObserverTree]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IObserverTree] (val x: Self) extends AnyVal {
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setListeners(value: Double): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      inline def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObservers(value: js.Array[IObserverTree]): Self = StObject.set(x, "observers", value.asInstanceOf[js.Any])
      
      inline def setObserversUndefined: Self = StObject.set(x, "observers", js.undefined)
      
      inline def setObserversVarargs(value: IObserverTree*): Self = StObject.set(x, "observers", js.Array(value*))
    }
  }
  
  trait ITransitionEvent extends StObject {
    
    var changed: Boolean
    
    var context: js.Object
    
    var id: Double
    
    var name: String
    
    var newValue: String
    
    var state: String
  }
  object ITransitionEvent {
    
    inline def apply(changed: Boolean, context: js.Object, id: Double, name: String, newValue: String, state: String): ITransitionEvent = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITransitionEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITransitionEvent] (val x: Self) extends AnyVal {
      
      inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
      
      inline def setContext(value: js.Object): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Lambda extends StObject {
    
    def apply(): Unit = js.native
    
    var name: js.UndefOr[String] = js.native
  }
}
