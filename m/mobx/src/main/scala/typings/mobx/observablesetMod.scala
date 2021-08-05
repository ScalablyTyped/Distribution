package typings.mobx

import typings.mobx.interceptUtilsMod.IInterceptable
import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.listenUtilsMod.IListenable
import typings.mobx.modifiersMod.IEnhancer
import typings.mobx.utilsMod.Lambda
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object observablesetMod {
  
  @JSImport("mobx/lib/types/observableset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("mobx/lib/types/observableset", "ObservableSet")
  @js.native
  class ObservableSet[T] ()
    extends StObject
       with Set[T]
       with IInterceptable[ISetWillChange[js.Any]]
       with IListenable {
    def this(initialData: IObservableSetInitialValues[T]) = this()
    def this(initialData: Unit, enhancer: IEnhancer[T]) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T]) = this()
    def this(initialData: Unit, enhancer: Unit, name: String) = this()
    def this(initialData: Unit, enhancer: IEnhancer[T], name: String) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: Unit, name: String) = this()
    def this(initialData: IObservableSetInitialValues[T], enhancer: IEnhancer[T], name: String) = this()
    
    /* private */ var _atom: js.Any = js.native
    
    /* private */ var _data: js.Any = js.native
    
    /* private */ var dehanceValue: js.Any = js.native
    
    var dehancer: js.Any = js.native
    
    def delete(value: js.Any): Boolean = js.native
    
    def enhancer(newV: js.Any): js.Any = js.native
    def enhancer(newV: js.Any, oldV: js.Any): js.Any = js.native
    
    def has(value: js.Any): Boolean = js.native
    
    /* CompleteClass */
    override def intercept(handler: IInterceptor[ISetWillChange[js.Any]]): Lambda = js.native
    
    var name: String = js.native
    
    def observe(listener: js.Function1[/* changes */ ISetDidChange[T], Unit]): Lambda = js.native
    def observe(listener: js.Function1[/* changes */ ISetDidChange[T], Unit], fireImmediately: Boolean): Lambda = js.native
    
    def replace(other: IObservableSetInitialValues[T]): ObservableSet[T] = js.native
    def replace(other: ObservableSet[T]): ObservableSet[T] = js.native
    
    @JSName("size")
    def size_MObservableSet: Double = js.native
    
    def toJS(): Set[T] = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag_ObservableSet: typings.mobx.mobxStrings.Set = js.native
  }
  
  inline def isObservableSet(thing: js.Any): /* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObservableSet")(thing.asInstanceOf[js.Any]).asInstanceOf[/* is mobx.mobx/lib/types/observableset.ObservableSet<any> */ Boolean]
  
  type IObservableSetInitialValues[T] = Set[T] | js.Array[T]
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.NewValueObject[T]
    - typings.mobx.anon.ObjectOldValue[T]
  */
  trait ISetDidChange[T] extends StObject
  object ISetDidChange {
    
    inline def NewValueObject[T](newValue: T, `object`: ObservableSet[T]): typings.mobx.anon.NewValueObject[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("add")
      __obj.asInstanceOf[typings.mobx.anon.NewValueObject[T]]
    }
    
    inline def ObjectOldValue[T](`object`: ObservableSet[T], oldValue: T): typings.mobx.anon.ObjectOldValue[T] = {
      val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("delete")
      __obj.asInstanceOf[typings.mobx.anon.ObjectOldValue[T]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.mobx.anon.OldValueType[T]
    - typings.mobx.anon.NewValueObjectType[T]
  */
  trait ISetWillChange[T] extends StObject
  object ISetWillChange {
    
    inline def NewValueObjectType[T](newValue: T, `object`: ObservableSet[T]): typings.mobx.anon.NewValueObjectType[T] = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("add")
      __obj.asInstanceOf[typings.mobx.anon.NewValueObjectType[T]]
    }
    
    inline def OldValueType[T](`object`: ObservableSet[T], oldValue: T): typings.mobx.anon.OldValueType[T] = {
      val __obj = js.Dynamic.literal(oldValue = oldValue.asInstanceOf[js.Any])
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("delete")
      __obj.asInstanceOf[typings.mobx.anon.OldValueType[T]]
    }
  }
}
