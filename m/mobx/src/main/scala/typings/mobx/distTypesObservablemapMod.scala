package typings.mobx

import org.scalablytyped.runtime.StringDictionary
import typings.mobx.anon.DebugObjectName
import typings.mobx.anon.NewValue
import typings.mobx.anon.Object
import typings.mobx.anon.OldValue
import typings.mobx.distCoreAtomMod.IAtom
import typings.mobx.distInternalMod.ObservableValue
import typings.mobx.distTypesInterceptUtilsMod.IInterceptable
import typings.mobx.distTypesInterceptUtilsMod.IInterceptor
import typings.mobx.distTypesListenUtilsMod.IListenable
import typings.mobx.distTypesModifiersMod.IEnhancer
import typings.mobx.distUtilsUtilsMod.Lambda
import typings.mobx.mobxStrings.add
import typings.mobx.mobxStrings.delete
import typings.mobx.mobxStrings.update
import typings.std.IterableIterator
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesObservablemapMod {
  
  @JSImport("mobx/dist/types/observablemap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/dist/types/observablemap", "ADD")
  @js.native
  val ADD: /* "add" */ String = js.native
  
  @JSImport("mobx/dist/types/observablemap", "DELETE")
  @js.native
  val DELETE: /* "delete" */ String = js.native
  
  @JSImport("mobx/dist/types/observablemap", "ObservableMap")
  @js.native
  open class ObservableMap[K, V] ()
    extends StObject
       with Map[K, V]
       with IInterceptable[IMapWillChange[K, V]]
       with IListenable {
    def this(initialData: IObservableMapInitialValues[K, V]) = this()
    def this(initialData: Unit, enhancer_ : IEnhancer[V]) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer_ : IEnhancer[V]) = this()
    def this(initialData: Unit, enhancer_ : Unit, name_ : String) = this()
    def this(initialData: Unit, enhancer_ : IEnhancer[V], name_ : String) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer_ : Unit, name_ : String) = this()
    def this(initialData: IObservableMapInitialValues[K, V], enhancer_ : IEnhancer[V], name_ : String) = this()
    
    /* private */ var addValue_ : Any = js.native
    
    var data_ : Map[K, ObservableValue[V]] = js.native
    
    /* private */ var dehanceValue_ : Any = js.native
    
    var dehancer: Any = js.native
    
    def enhancer_(newValue: V, oldValue: V, name: String): V = js.native
    def enhancer_(newValue: V, oldValue: Unit, name: String): V = js.native
    @JSName("enhancer_")
    var enhancer__Original: IEnhancer[V] = js.native
    
    var get: Any = js.native
    
    var hasMap_ : Map[K, ObservableValue[Boolean]] = js.native
    
    /* private */ var has_ : Any = js.native
    
    def intercept_(handler: IInterceptor[IMapWillChange[K, V]]): Lambda = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_ObservableMap: js.Function0[IterableIterator[IMapEntry[K, V]]] = js.native
    
    var keysAtom_ : IAtom = js.native
    
    /** Merge another object into this object, returns this. */
    def merge(): ObservableMap[K, V] = js.native
    def merge(other: IObservableMapInitialValues[K, V]): ObservableMap[K, V] = js.native
    
    var name_ : String = js.native
    
    /**
      * Observes this object. Triggers for the events 'add', 'update' and 'delete'.
      * See: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/observe
      * for callback details
      */
    def observe_(listener: js.Function1[/* changes */ IMapDidChange[K, V], Unit]): Lambda = js.native
    def observe_(listener: js.Function1[/* changes */ IMapDidChange[K, V], Unit], fireImmediately: Boolean): Lambda = js.native
    
    def replace(values: IObservableMapInitialValues[K, V]): ObservableMap[K, V] = js.native
    
    @JSName("size")
    def size_MObservableMap: Double = js.native
    
    def toJSON(): js.Array[js.Tuple2[K, V]] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_ObservableMap: js.Function0[String] = js.native
    
    /* private */ var updateValue_ : Any = js.native
  }
  
  @JSImport("mobx/dist/types/observablemap", "isObservableMap")
  @js.native
  def isObservableMap: js.Function1[
    /* thing */ Any, 
    /* is mobx.mobx/dist/types/observablemap.ObservableMap<any, any> */ Boolean
  ] = js.native
  inline def isObservableMap_=(
    x: js.Function1[
      /* thing */ Any, 
      /* is mobx.mobx/dist/types/observablemap.ObservableMap<any, any> */ Boolean
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isObservableMap")(x.asInstanceOf[js.Any])
  
  type IKeyValueMap[V] = StringDictionary[V]
  
  type IMapDidChange[K, V] = ((NewValue[K, V]) & DebugObjectName) | ((Object[K, V]) & DebugObjectName) | ((OldValue[K, V]) & DebugObjectName)
  
  type IMapEntries[K, V] = js.Array[IMapEntry[K, V]]
  
  type IMapEntry[K, V] = js.Tuple2[K, V]
  
  trait IMapWillChange[K, V] extends StObject {
    
    var name: K
    
    var newValue: js.UndefOr[V] = js.undefined
    
    var `object`: ObservableMap[K, V]
    
    var `type`: update | add | delete
  }
  object IMapWillChange {
    
    inline def apply[K, V](name: K, `object`: ObservableMap[K, V], `type`: update | add | delete): IMapWillChange[K, V] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMapWillChange[K, V]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IMapWillChange[?, ?], K, V] (val x: Self & (IMapWillChange[K, V])) extends AnyVal {
      
      inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: V): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
      
      inline def setObject(value: ObservableMap[K, V]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setType(value: update | add | delete): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type IObservableMapInitialValues[K, V] = (IMapEntries[K, V]) | (IReadonlyMapEntries[K, V]) | IKeyValueMap[V] | (Map[K, V])
  
  type IReadonlyMapEntries[K, V] = js.Array[IReadonlyMapEntry[K, V]]
  
  type IReadonlyMapEntry[K, V] = js.Tuple2[K, V]
}
