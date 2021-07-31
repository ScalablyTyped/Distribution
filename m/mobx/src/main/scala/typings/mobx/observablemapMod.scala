package typings.mobx

import org.scalablytyped.runtime.StringDictionary
import typings.mobx.interceptUtilsMod.IInterceptable
import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.listenUtilsMod.IListenable
import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.delete
import typings.mobx.mobxStrings.update
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablemapMod {
  
  @JSImport("mobx/lib/types/observablemap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/lib/types/observablemap", "ObservableMap")
  @js.native
  class ObservableMap[K, V] ()
    extends StObject
       with Map[K, V]
       with IInterceptable[IMapWillChange[K, V]]
       with IListenable {
    def this(initialData: IObservableMapInitialValues[K, V]) = this()
    def this(initialData: Unit, enhancer: IEnhancer[V]) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V]) = this()
    def this(initialData: Unit, enhancer: Unit, name: String) = this()
    def this(initialData: Unit, enhancer: IEnhancer[V], name: String) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: Unit, name: String) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer: IEnhancer[V], name: String) = this()
    
    var _addValue: js.Any = js.native
    
    var _data: js.Any = js.native
    
    var _has: js.Any = js.native
    
    var _hasMap: js.Any = js.native
    
    var _keysAtom: js.Any = js.native
    
    var _updateHasMapEntry: js.Any = js.native
    
    var _updateValue: js.Any = js.native
    
    var dehanceValue: js.Any = js.native
    
    var dehancer: js.Any = js.native
    
    def enhancer(newValue: V, oldValue: V, name: String): V = js.native
    def enhancer(newValue: V, oldValue: Unit, name: String): V = js.native
    @JSName("enhancer")
    var enhancer_Original: IEnhancer[V] = js.native
    
    /* CompleteClass */
    override def intercept(handler: IInterceptor[IMapWillChange[K, V]]): Lambda = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_ObservableMap: js.Function0[IterableIterator[IMapEntry[K, V]]] = js.native
    
    def merge(other: js.Any): ObservableMap[K, V] = js.native
    def merge(other: IKeyValueMap[V]): ObservableMap[K, V] = js.native
    /** Merge another object into this object, returns this. */
    def merge(other: ObservableMap[K, V]): ObservableMap[K, V] = js.native
    
    var name: String = js.native
    
    /**
      * Observes this object. Triggers for the events 'add', 'update' and 'delete'.
      * See: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/observe
      * for callback details
      */
    def observe(listener: js.Function1[/* changes */ IMapDidChange[K, V], Unit]): Lambda = js.native
    def observe(listener: js.Function1[/* changes */ IMapDidChange[K, V], Unit], fireImmediately: Boolean): Lambda = js.native
    
    def replace(values: js.Any): ObservableMap[K, V] = js.native
    def replace(values: IKeyValueMap[V]): ObservableMap[K, V] = js.native
    def replace(values: ObservableMap[K, V]): ObservableMap[K, V] = js.native
    
    @JSName("size")
    def size_MObservableMap: Double = js.native
    
    /**
      * Returns a shallow non observable object clone of this map.
      * Note that the values migth still be observable. For a deep clone use mobx.toJS.
      */
    def toJS(): Map[K, V] = js.native
    
    def toJSON(): IKeyValueMap[V] = js.native
    
    /**
      * Returns a plain object that represents this map.
      * Note that all the keys being stringified.
      * If there are duplicating keys after converting them to strings, behaviour is undetermined.
      */
    def toPOJO(): IKeyValueMap[V] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_ObservableMap: typings.mobx.mobxStrings.Map = js.native
  }
  
  @scala.inline
  def isObservableMap(thing: js.Any): /* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableMap")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ Boolean]
  
  type IKeyValueMap[V] = StringDictionary[V]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.Name[K, V]
    - typings.mobx.anon.NewValue[K, V]
    - typings.mobx.anon.Object[K, V]
  */
  trait IMapDidChange[K, V] extends StObject
  object IMapDidChange {
    
    @scala.inline
    def Name[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], oldValue: V): typings.mobx.anon.Name[K, V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("update")
      __obj.asInstanceOf[typings.mobx.anon.Name[K, V]]
    }
    
    @scala.inline
    def NewValue[K, V](name: K, newValue: V, `object`: ObservableMap[K, V]): typings.mobx.anon.NewValue[K, V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("add")
      __obj.asInstanceOf[typings.mobx.anon.NewValue[K, V]]
    }
    
    @scala.inline
    def Object[K, V](name: K, `object`: ObservableMap[K, V], oldValue: V): typings.mobx.anon.Object[K, V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("delete")
      __obj.asInstanceOf[typings.mobx.anon.Object[K, V]]
    }
  }
  
  type IMapEntries[K, V] = js.Array[IMapEntry[K, V]]
  
  type IMapEntry[K, V] = js.Tuple2[K, V]
  
  trait IMapWillChange[K, V] extends StObject {
    
    var name: K
    
    var newValue: js.UndefOr[V] = js.undefined
    
    var `object`: ObservableMap[K, V]
    
    var `type`: update | add | delete
  }
  object IMapWillChange {
    
    @scala.inline
    def apply[K, V](name: K, `object`: ObservableMap[K, V], `type`: update | add | delete): IMapWillChange[K, V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMapWillChange[K, V]]
    }
    
    @scala.inline
    implicit class IMapWillChangeMutableBuilder[Self <: IMapWillChange[?, ?], K, V] (val x: Self & (IMapWillChange[K, V])) extends AnyVal {
      
      @scala.inline
      def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValue(value: V): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      @scala.inline
      def setObject(value: ObservableMap[K, V]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: update | add | delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type IObservableMapInitialValues[K, V] = (IMapEntries[K, V]) | IKeyValueMap[V] | (Map[K, V])
}
