package typings.mobx

import org.scalablytyped.runtime.StringDictionary
import typings.mobx.interceptUtilsMod.IInterceptable
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablemapMod {
  
  @JSImport("mobx/lib/types/observablemap", "ObservableMap")
  @js.native
  class ObservableMap[K, V] ()
    extends Map[K, V]
       with IInterceptable[IMapWillChange[K, V]]
       with IListenable {
    def this(initialData: IObservableMapInitialValues[K, V]) = this()
    def this(initialData: js.UndefOr[IObservableMapInitialValues[K, V]], enhancer: IEnhancer[V]) = this()
    def this(
      initialData: js.UndefOr[IObservableMapInitialValues[K, V]],
      enhancer: js.UndefOr[scala.Nothing],
      name: String
    ) = this()
    def this(initialData: js.UndefOr[IObservableMapInitialValues[K, V]], enhancer: IEnhancer[V], name: String) = this()
    
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
    def enhancer(newValue: V, oldValue: js.UndefOr[scala.Nothing], name: String): V = js.native
    @JSName("enhancer")
    var enhancer_Original: IEnhancer[V] = js.native
    
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
  
  @JSImport("mobx/lib/types/observablemap", "isObservableMap")
  @js.native
  def isObservableMap(thing: js.Any): /* is mobx.mobx/lib/types/observablemap.ObservableMap<any, any> */ Boolean = js.native
  
  type IKeyValueMap[V] = StringDictionary[V]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.Name[K, V]
    - typings.mobx.anon.NewValue[K, V]
    - typings.mobx.anon.Object[K, V]
  */
  trait IMapDidChange[K, V] extends StObject
  object IMapDidChange {
    
    @scala.inline
    def Name[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], oldValue: V, `type`: update): typings.mobx.anon.Name[K, V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mobx.anon.Name[K, V]]
    }
    
    @scala.inline
    def NewValue[K, V](name: K, newValue: V, `object`: ObservableMap[K, V], `type`: add): typings.mobx.anon.NewValue[K, V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mobx.anon.NewValue[K, V]]
    }
    
    @scala.inline
    def Object[K, V](name: K, `object`: ObservableMap[K, V], oldValue: V, `type`: delete): typings.mobx.anon.Object[K, V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.mobx.anon.Object[K, V]]
    }
  }
  
  type IMapEntries[K, V] = js.Array[IMapEntry[K, V]]
  
  type IMapEntry[K, V] = js.Tuple2[K, V]
  
  @js.native
  trait IMapWillChange[K, V] extends StObject {
    
    var name: K = js.native
    
    var newValue: js.UndefOr[V] = js.native
    
    var `object`: ObservableMap[K, V] = js.native
    
    var `type`: update | add | delete = js.native
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
    implicit class IMapWillChangeMutableBuilder[Self <: IMapWillChange[_, _], K, V] (val x: Self with (IMapWillChange[K, V])) extends AnyVal {
      
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
